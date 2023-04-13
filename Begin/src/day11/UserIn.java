package day11;
//1만원씩 저출하느 ㄴ쓰레드
public class UserIn extends Thread {
	
	private Account account;
	public UserIn(Account ac, String name) {
		this.account=ac;
		setName(name);
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			account.save(1);;//1만원 저축
		}
	}

}
