package day10;
import java.util.*;
public class HashMapTest {
	//회원(아이디(K) == 비밀번호(V)) 저장===>HashMap
	
	HashMap<String , String> map=new HashMap<>();
	
	public void join() {
		map.put("hong", "123");
		map.put("choi", "abc");
		map.put("admin", "tiger");
		System.out.println(">회원가입완료<");
		
	}//----------
	/*입력한 값이 map에 저장되어 있는지 체크
	 * 1) 해당 아이디가 map에 저장되어 있는지 검사
	 *    (a) 없다면 => "없는 아이디입니다"
	 *    (b) 있다면 
	 *    		=> 비밀번호 체크
	 *    			=> 비번 일치하면 
	 *    				[1] 일반 유저=> 환영메시지 보여주기
	 *    				[2] 관리자면 => 관리자 모드를 이용할 수 있어요	
	 *             		반복문 벗어나기
	 *              => 비번 불일치라면 =>"비밀번호가 틀려요"
	 *                  반복문 계속 수행
	 * */
	
	public void loginCheck() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("아이디: ");
			String userId=sc.nextLine();
			System.out.println("비밀번호: ");
			String pwd=sc.nextLine();
			System.out.println(userId+"/"+pwd);
			boolean isExist=map.containsKey(userId);
			if(!isExist) {
				System.out.println(userId+"는 없는 아이디입니다");
				continue;
			}
			String realpwd=map.get(userId);
			if(!realpwd.equals(pwd)) {
				System.out.println("비밀번호가 일치하지 않습니다");
				continue;
			}
			String msg="";
			if(userId.equals("admin")) {
				msg="관리자모드 이용가능";
			}else {
				msg="환영합니다"+userId+"님";
			}
			System.out.println(msg);
			break;
		}
						
	}
	
	public static void main(String[] args) {
		HashMapTest app=new HashMapTest();
		app.join();
		app.loginCheck();
	}

}
