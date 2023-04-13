package day08;
//파일을 읽어서 콘솔에 출력하는 프로그램
//[1] try ~ catch
//[2] throws
/*  Exception
* 		|
* 	IOException
* 		+-------FileNotFoundException
* */
import java.io.*;//입출력관련 패키지

import javax.swing.JOptionPane;
public class FileIo {
	
	public static String reading(String fileName) throws FileNotFoundException,IOException
	{ 
		System.out.println("----"+fileName+"-----");
		String content="";
		FileReader fr=null;
		char[] data=new char[1000];//파일 데이터를 담을 배열-1000자
		
		fr=new FileReader(fileName);//파일과 노드연결
		//FileNotFoundException
		
		int n=fr.read(data, 0, 1000);//파일을 읽어서 data배열에 담는다
		//IOException
		
		fr.close();//파일 리소스를 변환
		//IOException1000
		content=new String(data, 0 ,data.length);
		
		return content;
	}

	public static void main(String[] args) 
	{	
		String fname=JOptionPane.showInputDialog("읽을 파일을 입력하세요");
		if(fname==null) return;
		try {
		String str=reading(fname);
		System.out.println(str);
		}catch(IOException e) {
			System.out.println("파일 입출력 중 예외 발생: "+e);
		}
	}

}
