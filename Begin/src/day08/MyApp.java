package day08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//CardLayout 
public class MyApp extends JFrame implements ActionListener {

   Container cp;
   MyLoginPage p = new MyLoginPage();//1번카드
   JPanel p2= new JPanel();//2번카드
   CardLayout card;

   public MyApp() {
      super("::MyApp::");
      cp = this.getContentPane();//기본 borderLayout==>CardLayout으로 변경
      card=new CardLayout();
      cp.setLayout(card);
      
     //cp.add(p, "Center");
      cp.add(p,"login");//white
      cp.add(p2,"home");//pink
      p.btLogin.addActionListener(this);
     // card.show(cp,"login");
      
      p.setBackground(Color.white);
      p2.setBackground(Color.pink);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
   	Object obj= e.getSource();
   	if(p.tfName.getText().length()==0) return;
   	if (obj == p.btLogin) {
   		try {
   		login();
   		}catch(NotSupportedNameException ex) {
   			JOptionPane.showMessageDialog(this , ex.getMessage());
   			ex.printStackTrace();
   		}
   	}
   }
   
   
   
	public void login()
	throws NotSupportedNameException
	{
		
		if((p.tfName).getText().startsWith("퐁")) {
			card.show(cp, "home");
		}else if ((p.tfName).getText().startsWith("콩")) {
			reset();
			throw new NotSupportedNameException("콩씨는 로그인 불가");
		}else {
			card.show(cp, "home");
			throw new NotSupportedNameException("기타 성씨는 이용에 제한있음");
		}
												
		
	}
	public void reset(){
		p.tfName.setText("");
		p.tfPwd.setText("");
		p.tfName.requestFocus();
	}

   public static void main(String[] args) {
      MyApp my = new MyApp();
      my.setSize(400, 700);
      my.setVisible(true);
   }
}