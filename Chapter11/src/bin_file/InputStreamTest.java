package bin_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) {
		// 바이트 기반 차일 읽기
		try {
			InputStream is = new FileInputStream("c:/file/file1.bin");
			int data;//읽은 데이터 저장
			while((data = is.read()) !=-1) {
				//System.out.println(data);//코드값 출력
				System.out.println((char)data);//문자 출력
			}
			is.close();
			//다중 예외인 경우 부모 클래스만 사용해도 됨
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
