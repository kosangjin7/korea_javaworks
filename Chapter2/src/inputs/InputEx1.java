package inputs;

import java.util.Scanner;

public class InputEx1 {

	public static void main(String[] args) {
		//입력 처리 - Scanner 클래스 사용
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까?");
		String name = scanner.nextLine();
		System.out.println("당신의 이름은"+ name + "이군요!");
		
		System.out.print("당신의 나이는 몇 세입니까?");
		int age = scanner.nextInt();
		System.out.println("당신의 나이는"+ age + "세 이군요!");
		
					
		
		scanner.close();
		
	}

}
