package classes;
//객체의 얕은 복사
public class ObjectCopy {

	private static Book[] array3;

	public static void main(String[] args) {
		//Book 객체생성
		Book[ ]array1=new Book[3];
		Book[ ]array2=new Book[3];
		
		array1[0]=new Book(100,"채식주의자","한강");
		array2[1]=new Book(101,"자바 프로그래밍 입문","박은종");
		array3[2]=new Book(102,"모두의 파이선","이승찬");
		
		System.out.println("array1츨력");
		for(Book book:array1)
			book.showBookInfo();
		
		
		
		for(int i=0;i<array1.length;i++) {
			array2[i]=array1[i];
		}
		System.out.println("array2 출력");
		for(Book book:array2)
			book.showBookInfo();
		

	}

}
