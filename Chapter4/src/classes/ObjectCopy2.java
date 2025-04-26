package classes;
//깊은복사(DeepCopy)
public class ObjectCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Book 객체생성
				Book[ ]array1=new Book[3];
				Book[ ]array2=new Book[3];
				
				array1[0]=new Book(100,"채식주의자","한강");
				array1[1]=new Book(101,"자바 프로그래밍 입문","박은종");
				array1[2]=new Book(102,"모두의 파이선","이승찬");
				
				
				//array2객체생성(기본생성자)
				
				array2[0]=new Book();
				array2[1]=new Book();
				array2[2]=new Book();
				
				//깊은복사
				for(int i=0;i<array1.length;i++) {
					array2[i].setBookNumber(array1[i].getBookNumber());
					array2[i].setBookTitle(array1[i].getBookTitle());
					array2[i].setAuthor(array1[i].gerAuthor());
				}
				
				
				
				
				//array1의 첫번째 요소 수정
				array1[0].setBookTitle("미생1");
				array1[0].setAuthor("윤태호");
				
				
				//향상된for
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
