package day11;
//[2]java.lang.Runnable 인터페이스를 상속받아 구현하는 경우
class Snail implements Runnable
{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("달팽이가 기어갑니다");
			int sec=(int)(Math.random()*2000);
			try {
			    Thread.sleep(sec);
			}catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}/////////
public class ThreadTest {

	public static void main(String[] args) {
		//1. Runnalbe 객체 생성
		Snail r=new Snail();
		//2. Thread객체 생성 <= 이떄 Runnalbe객체 생성자에 매개변수로 전달
		Thread tr=new Thread();
		//3. Thread의 start호출
		tr.start();
		final String name="똘똘이";
		Runnable r2=new Runnable() {
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println(name+"달팽이 기어갑니다2");
					try {
						Thread.sleep(200);
					}catch (Exception e) {}
				}
			}
		};
		Thread tr2=new Thread(r2);
		tr2.start();
		
		//Lambda식을 이용한 스레드 구현
		final String name2="이쁜이";
		Thread tr3=new Thread(()->{
		for(int i=0;i<5;i++) {
			System.out.println(name2+"달팽이 기어갑니다2");
			try {
				Thread.sleep(500);
			}catch (Exception e) {}
		}
	});
		tr3.start();

	}

}
