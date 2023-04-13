package day07;
import javax.swing.*;
public class AnimalTest {
	public static void main(String[] args) {
		
		String type=JOptionPane.showInputDialog("동물 종류 입력");
		String cnt=JOptionPane.showInputDialog("새끼 수 입력");
		if(type==null||cnt==null)return;
		
		int cnt_int=Integer.parseInt(cnt);
		Animal an=null;
		if(type.equals("강아지")) {
			
			    an=new Dog();			    
			}else if(type.equals("고양이")) {
				an=new Cat();
			}else if(type.equals("오리")){
				an=new Duck();
			}else{
				System.out.println("그런 동물 안킴움");
				return;
			}
		   an.crySound();
		   an.getBaby(cnt_int);
		
	}

}
