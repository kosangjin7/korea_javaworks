package bin_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {

	public static void main(String[] args) {
		// 바이트 기반 ㅍ일 쓰기
		
		try {
			OutputStream os = new FileOutputStream("c:/file/file1.bin");
			byte a=10;
			byte b=20;
			
			os.write(a);
			os.write(b);
			//배열로  쓰기
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		
		
		

	}

}
