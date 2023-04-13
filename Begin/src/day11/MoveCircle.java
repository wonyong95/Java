package day11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircle extends JFrame implements Runnable {

	Container cp;
	JPanel p = new JPanel();
	MyCirclePanel p2=new MyCirclePanel();
	JButton btStart, btstop;
	Thread tr;
	boolean isStop=false;

	public MoveCircle() {
		super("::MoveCircle::");
		cp = this.getContentPane();
		cp.add(p2, "Center");
		cp.add(p, "North");
		p.setBackground(Color.magenta);
		p2.setBackground(Color.white);
		
		p.add(btStart=new JButton("Start"));
		p.add(btstop=new JButton("Stop"));
		
		//btStart버튼에 대한 ActionEvent처리를 Anonymous로 해보기
		//타이틀 변경 "Start"
		btStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//여기서는 this 이름없는 클래스
				setTitle("start..."+this);
				isStop=false;
				//스레드 생생해서 동작시키기
//				MoveCircle r=new MoveCircle();//Runnable객체,또다른 Jframe객체
//				r.setSize(200,200);
//				r.setVisible(true);
				//this => Anonymous class의 this가된다
				tr=new Thread(MoveCircle.this);
				tr.start();
			}
		});
						
		//btStop버튼에 대한 이벤트 처리 Lambda로 해보기
		//타이틀 변경 "Stop"
		btstop.addActionListener(e->{
			System.out.println(this);//람다식에서의 this는 MoveCircle 이됨
			setTitle("Stop...");
		    isStop=true;
			//스레드 동작 중지시키기
			//tr.stop();//[x] 안쓰는것이좋음 deprecated
			//tr.interrupt();
		});
		
		
			
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//생성자-------
	
	@Override
	public void run() {
	    while(!isStop) {
		//무한반복 돌면서 MyCirclePanel x값을 증가시킨다
	    	if(p2.x>p2.getWidth()) {
	    		p2.x=0;
	    	}
		    p2.x+=5;
		//sleep()걸어주기
		    System.out.println("p2.x: "+p2.x);
	    	try {
	    		Thread.sleep(100);
	    	}catch (InterruptedException e) {
				System.out.println(e);
				break;
			}
	    	//p2.paint();; //[x] paint()메서드는 JVM이 호출하는 메서드=>repaint()를 호출해야함
	    	p2.repaint();  //JVM이 알아서 paint 호출                        
	    }//while---
	}//run()----

	public static void main(String[] args) {
		MoveCircle my = new MoveCircle();
		my.setSize(700, 500);
		my.setVisible(true);
	}

}