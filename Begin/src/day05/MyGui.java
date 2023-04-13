package day05;
//GUI (Graphic User Interface) : 윈도우 애플리케이션
//CLI (Command Line Interface) : 콘솔 애플리케이션

//윈도우 프로그램 ==> javax.swing.JFrame을 상속받아 구현한다
//사이즈를 주고 setVisible(true)을 해야 육안으로 확인가능
import javax.swing.*;
import java.awt.*;
import java.security.acl.Group;

//JPanel을 생성해서 Jframe이 가지고 있는 Container에 붙인다
//JButton을 생성해서 Jpanel에 붙인다
public class MyGui extends JFrame {
	
	JButton b1,b2,b3,b4;//Component(부품)
	JPanel p;//container
	//기본생성자 구성하기
	Container cp;
	ImageIcon icon1, icon2, icon3, icon4;
	
	JTextField tf1, tf2;
	JCheckBox c1,c2,c3;
	JRadioButton r1,r2;
	JTextArea ta1;
	
	public  MyGui() {
		cp=getContentPane();//컨테이너를 반환하는 메서드
		p=new JPanel();//패널(일종의 컨테이너)
		p.setBackground(Color.white);
		cp.add(p);
		
		
		icon1=new ImageIcon("./images/icon1.png");
		icon2=new ImageIcon("./images/icon2.png");
		icon3=new ImageIcon("./images/icon3.png");
		icon4=new ImageIcon("./images/icon4.png");
		
		b1=new JButton("Home");
		b2=new JButton("Login");
		b3=new JButton(icon1);
		b4=new JButton("join",icon2);
		
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);
		
		b4.setHorizontalTextPosition(JButton.CENTER);//텍스트를 수평중앙에 위치
		b4.setVerticalTextPosition(JButton.BOTTOM); //수직탑에위치 
		
		b4.setPressedIcon(icon3);
		b4.setRolloverIcon(icon4);
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		tf1=new JTextField(20);
		tf2=new JTextField("네이버를 검색해봐",20);
		
		p.add(tf1);
		p.add(tf2);
		
		c1=new JCheckBox("Java");
		c2=new JCheckBox("HTML",true);
		c3=new JCheckBox("CSS",false);
		
		p.add(c1);
		p.add(c2);
		p.add(c3);
		
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female",true);
		p.add(r1);
		p.add(r2);
		//단일체크 하도록 만들려면 ButtonGroup 객체에 add해주어야 한다
		ButtonGroup group=new ButtonGroup();
		group.add(r1);
		group.add(r2);
		
		//스크롤페인에 붙여야 스크롤바가 생성된다
		ta1=new JTextArea(7,20);
//		p.add(ta1);[x]
		JScrollPane sp=new JScrollPane(ta1);
		p.add(sp);
//		ta1.setBackground(Color.gray);
		
		//창닫기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프로세스종료
	}//생성자

	public static void main(String[] args) {
		MyGui my=new MyGui();
		my.setSize(500,500);//width, height
		my.setVisible(true);

	}

}
