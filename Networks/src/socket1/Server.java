package socket1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	//서버 소켓 객체 선언
	private static ServerSocket serverSocket;
	
	public static void main(String[] args) {
		System.out.println("===========================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요");
		System.out.println("===========================");

		
		startServer();//서버 시작 함수 호출
		Scanner scan= new Scanner(System.in);
		while(true) {
			String key =scan.nextLine();
			//소문자로 변경후 일치하는지 비교
			if(key.toLowerCase().equals("q")) break;
		}
		scan.close();
		stopServer();//서버 종료함수
		
	}

	private static void stopServer() {
		try {
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void startServer() {
		// 작업 스레드 생성
		Thread thread =new Thread() {
			
			@Override
			public void run() {
				try {
					//포트 번호-8000번 사용
					serverSocket=new ServerSocket(8000);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("[서버] 클라이언드의 연결 요청 기다림");
						//연결수락함수 호출
						Socket socket=serverSocket.accept();
						
						//요청한 클라이언트의 소켓 주소(포트번호)
						InetSocketAddress isa=
								(InetSocketAddress)socket.getRemoteSocketAddress();
						
						String clientIp =isa.getHostString();
						System.out.println("[서버] 클라이언트이 연결 요청 기다림");
						//연결 끊기
						
						socket.close();
						System.out.println("서버"+clientIp+"의 연결 종료");
					}
					
				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println("서버"+e.toString());
				}
			} 
			
		};
		thread.start();
	}

}



