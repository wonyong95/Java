package day07;

abstract public class Animal {//추상클래스
      String x,y;
      public String toString() {
    	  return " 나는 동물클래스 Animal";
      }
      abstract void crySound();
      abstract void getBaby(int num);
      
      public String toString1() {
    	  return "Animal";
      }
      
}//

class Dog extends Animal
{
    @Override
    public void crySound() {
    	System.out.println("멍멍~");   	
    }
    @Override
    protected void getBaby(int n) {
    	System.out.println(n+"마리의 새끼를 낳았어요");
    }
	
}///////dog
class Cat extends Animal{
	public void crySound() {
		System.out.println("야옹 야옹~");
	}
	public void getBaby(int n) {
		System.out.println(n+"마리의 새끼를 낳았어요~");
	}
	
}///////cat


class Duck extends Animal{
	 void crySound() {
		System.out.println("꽥꽥");		
	}
	void getBaby(int num) {
		System.out.println(num+"마리의 새끼를 낳았어요");
	}
	
}///////Duck














