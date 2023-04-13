package day05;

public class CoffeeShop {

	public static void main(String[] args) {
		VendingMachine vm=new VendingMachine();
		//1.밀크커피
		vm.makeTea(1,2,3);
		
		//2.설탕커피
		vm.makeTea(2,3);
		
		//3.블랙커피
		System.out.println(vm.makeTea(1));
		
		//4.크림커피
        vm.makeTea(1,(short)3);
        vm.makeTea((short)3,3);
        
        //5.유자차
        Yuja yj=new Yuja();
        yj.setYuja(10);
        yj.setSugar(10);
        
        vm.makeTea(yj);
	}

}
