package datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DateStreamTest {

	public static void main(String[] args) {
		//보조스트림
		//메로리에 저장된 0과1의 상태를 그대로 읽거나 쓴다.
		//보조스트림 기반 스트림을 생성자와 새개 변수로 가죠야 함

		try(TileOutputStream fos=new FileOutputStream("object.data"));
				DataOutputStream dos = new DataOutputStream(fos)){
					
					//데이터 쓰기
					dos.writeInt(1);
					dos.writeUTF("우여우");
					dos.writeDouble(95.1);
					
					dos.writeInt(2);
					dos.writeUTF("정그래");
					dos.writeDouble(88.7);
					
					data.flush();
					
				}catch(IOException e) {
					e.printStackTrace();
				}
				try(FileInputStream fis=new FileInputStream("object.data");
						DataInputStream dis = new DataInputStream(fis)){
					
					for(int i=0;i<2;i++) {
						int no=dis.readInt();
						String name=dis.readUTF();
					}
					
				}catch(IOException e) {
					e.printStackTrace()
				}
				
				
				
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
