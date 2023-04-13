package day08;
//파일을 읽어서 콘솔에 출력하는 프로그램

//[1] try ~ catch
//[2] throws
/*  Exception
* 		|
* 	IOException
* 		+-------FileNotFoundException
* <1> try~catch로 예외처리
* */
//D:\web\myjava\workspace\Begin\src\day05\Cafe.java
import java.io.*;//입출력관련 패키지

import javax.swing.JOptionPane;
public class FileIo2 {
	
	public static String reading(String fileName) {
		
		System.out.println("----"+fileName+"-----");
		String content="";
		FileReader fr=null;
		char[] data=new char[1000];//파일 데이터를 담을 배열-1000자
		try {
				fr=new FileReader(fileName);//파일과 노드연결
				//FileNotFoundException
				
				int n=fr.read(data, 0, 1000);//파일을 읽어서 data배열에 담는다
				//IOException
				
				fr.close();//파일 리소스를 변환
				//IOException
		}catch (FileNotFoundException e) {
			System.out.println(fileName+"지정된 파일을 찾을수 없습니다");
		}catch (IOException e) {
			System.out.println("입출력 발생 에러"+e);
		}
		
		content=new String(data, 0 ,data.length);
		
		return content;
	}
	public static void main(String[] args) {
		
		String fname=JOptionPane.showInputDialog("읽을 파일을 입력하세요");
		if(fname==null) return;
		String str=reading(fname);
		System.out.println(str);

	}

}
