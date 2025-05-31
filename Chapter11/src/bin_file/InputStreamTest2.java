package bin_file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest2 {

	public static void main(String[] args) {
		// 바이트 기반 피일 읽기
		try(InputStream is= new FileInputStream("c:/file/file2.bin")){
			//읽은 체이터를 배열에 저장
			byte[] data=new byte[256];
			
			while(true) {
				int num = is.read(data);//데이터 개수
				if(num == -1) break;
				for(int i=0;i<num;i++) {
					System.out.print((char)data[i]);
				}
			}
			//is.close()생략
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
