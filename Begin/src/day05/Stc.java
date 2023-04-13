package day05;

public class Stc {
	public static void main(String args[]) {
		SutdaCard card1= new SutdaCard(3,false);
		SutdaCard card2= new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard{ //멤버변수 num isKwang
	int num;
	boolean isKwang;
	
	SutdaCard(){ // SutdaCard(1,true)를 호출한다
		num = 1;
		isKwang = true;
			
	}
	SutdaCard(int num,boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
		
	}
	String info() {//  isKwang 이 true인경우 K를 뒤에 붙임
		return num + (isKwang? "K": "");
	}
}

			

