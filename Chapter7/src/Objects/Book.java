package Objects;

public class Book  {
	//책번호,책제목
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber,String bookTitle){
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}
	//객체의 정보를 문자열로 출력
	@Override
	public String toString() {
		return bookNumber+","+bookTitle;
	}
	
	/*@Override
	public boolean equals(Object obj) {
		//instanceof - 클래스이 객체(인스턴스)인지 확인 사용
		if(obj instanceof Book) {
			Book book = (Book)obj;   //왼쪽이 작으면 강제타입변환(다형성-상속관계)
			if(this.bookNumber == book.bookNumber)
				return true;
			
		}*/
		
		
		return false;
	}
	
	
	
	
}
