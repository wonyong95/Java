package day08;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.*;
import java.awt.*;
public class MyLoginPage extends JPanel {
	
	JTextField tfName;
	JPasswordField tfPwd;
	JButton btLogin;
	//x,y좌표 지정해서 붙이려면 기본레이아웃을 해제해야한다
	//대신 컴포넌트 들의 사이즈와 x,y좌표를 일일이 수동으로 지정해야함
	//setBounds(x,y,w,h,)
	public MyLoginPage() {
		this.setLayout(null);//레이아웃 해제
		
		tfName=new JTextField(20);
		tfPwd=new  JPasswordField(20);
		btLogin=new JButton("Login");
		
		tfName.setBounds(90, 170, 200, 50);
		tfPwd.setBounds(90,240,200,50); 
		btLogin.setBounds(90,310,200,50);
		btLogin.setBackground(new Color(110,200,110));//r,g,b
		btLogin.setForeground(Color.white);
		
		tfName.setBorder(new TitledBorder("name"));
		tfPwd.setBorder(new TitledBorder("Passward"));
		
		add(tfName);
		add(tfPwd);
		add(btLogin);
	}
      public static void main(String[] args) {
    	  MyApp my = new MyApp();
          my.setSize(400, 700);
          my.setVisible(true);
	}
}
