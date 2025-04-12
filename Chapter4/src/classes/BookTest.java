package classes;

public class BookTest {

	public static void main(String[] args) {
		// 
	/*	Book[] books=new Book[3];
		
		for(int i=0;i<books.length;i++) {
			System.out.println(books[i]);
		}
		
		books[0]=new Book(100,"채식주의자","한강");
		books[1]=new Book(101,"자바 프로그래밍 입문","한강");
		books[2]=new Book(102,"모두의 파이썬","한강");
		*/
		//객체배열 생성 방법2
		Book[] books= {
				new Book(100,"채식주의자","한강"),
				new Book(101,"박은종","모두의 자바"),
				new Book(102,"모두의 파이썬","이승찬"),
				
				
				
		};
		
		
		for(int i=0;i<books.length;i++) {
			books[i].showBookInfo();
		}	
			
			
		
	}

}
