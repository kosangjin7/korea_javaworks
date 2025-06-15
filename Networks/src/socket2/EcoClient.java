package socket2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EcoClient {

	public static void main(String[] args) {
		// 소켓 객체생성
		try {
			Socket socket =new Socket("localhost",8000);
			System.out.println("클라이언트 연결성공");
			//--------------------------------------------//
			//데이터 보내기
			String sendMessage="오늘도 즐거운 하루되세요";
			//바이트 기반 스트림
			OutputStream os=socket.getOutputStream()
;			//문자열을 바이트로 저장함
			byte[] bytes = sendMessage.getBytes("utf-8");
			os.write(bytes);
			os.flush();
			System.out.println("클라이언트 데이터");
			
			
			socket.close();
			System.out.println("클라이언트 연결 끊음");
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
