package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest2 {

	public static void main(String[] args) {
		// 보조 스트림-Buffered스트림
		//버퍼는 임시 기억장소
		//보조스트림은 기반 스트림을 생성자의 매개 변수로 사용해야 함
		//이유는 보조 스트림이 독립적으로 입출력을 수행 할 수 없음
		String originFile ="C:\\javaworks\\Chapter11\\white-cat-9595396_1280.jpg";
		String copyFile ="C:\\javaworks\\Chapter11\\white-cat2-9595396_12802.jpg";
		long start,end;
		try(FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos =new FileOutputStream(copyFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos= new BufferedOutputStream(fos)){
			
			start=System.currentTimeMillis();
			//읽고 쓰기
			int data;
			while((data=bis.read()) !=-1) {
				bos.write(data);
			}
			end=System.currentTimeMillis();
			System.out.println("파일복사소요시간:"+(end-start+"ms"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
