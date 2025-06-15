package socket1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		// 소켓 객체생성
		try {
			Socket socket =new Socket("localhost",8000);
			System.out.println("클라이언트 연결성공");
			
			socket.close();
			System.out.println("클라이언트 연결 끊음");
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
