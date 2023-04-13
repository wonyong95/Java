package day07;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class ShapeTest {

	public static void main(String[] args) {
         System.out.println("각도형의 면적을 구합시다~");
         System.out.printf("가로 %d, 세로 %d 인 도형의 면적----\n", 8,10);
         //사각형 객체 생성후 area()호출
         Rectangle rt=new Rectangle();
         rt.area(8, 10);
         //직삼각형 객체 생성후 area()호출
         Triangle tr=new Triangle();
         tr.area(8, 10);
         //원 객체 생성 후 area()호출         
         //원: 반지름 8
        // Circle cr=new Circle();[x]
         //Circle => 추상클래스
         //추상클래는 타입선언은 할수있으나 인스턴스화할수없다
         
         Circle cr=new SubCircle();//[o]
         cr.area(8, 0);	
         //cr.area(8);[x]
         ((SubCircle)cr).area(8);
         
         SubCircle cr2=new SubCircle();
         cr2.area(10);
         System.out.println("cr.pi: "+cr.pi);
         
         Shape r=new Rectangle();
         r.area(5, 6);
         
          //rt,tr,cr,cr2,r 를 배열에 저장한후 반복문을 돌려서 각도형의 면적을 출력
         //12,24 반지름12
         Shape[]arr= {rt,tr,cr,cr2, r};
         for(Shape to:arr){
        	 {
         
        	 if(to instanceof SubCircle) {
        		 ((SubCircle)to).area(12);
        	 }else
              to.area(12,24);        }
	}
}
}