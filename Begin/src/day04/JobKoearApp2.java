package day04;

public class JobKoearApp2 {
	public static void main(String[] args) {
		Company c1=new Company();//생성자 호출
		c1.info();
		
		c1.name="구글";
		c1.year=1989;
		c1.employees=5000;
		c1.info();
	}

}
