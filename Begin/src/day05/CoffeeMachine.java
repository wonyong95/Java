package day05;
/* access mdifier
 * [1] private : 자기 클래스 내에서만 접근가능하다
 * [2] 생략형    : 같은 패키지 내에 있는 클래스들끼리 접근가능
 * [3] protected : 같은 패키지는 물론, 다른 패키지 일지라도 부모자식 상속관계면 접근 가능함
 * [4] public   : 어디서든 접근 가능
 * 
 * private < 생략형 < protected < public
 * */

public class CoffeeMachine {
	private int coffee;
	private int sugar;
	private short cream;
	
	//setXXX() : setter => void, 매개변수를 받는다
	public void setCoffee(int c) {
		coffee=c;
	}
	public void setSugar(int s) {
		sugar=s;
	}
	public void setCream(short s) {
		cream=s;
	}
	//getXXX() : getter => 반환타입을 명시 매개변수는 x
	public int getCoffee() {
		return coffee;
	}
    public int getSugar() {
		return sugar;
	}
    public short getCream() {
    	return cream;
    }
    
}//////////////////////
