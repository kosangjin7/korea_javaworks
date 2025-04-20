package Objects;

public class BookTest {
	public static void main(String[] args) {
		
		//String name="한강";
		String name=new String("한강");
		System.out.println(name);
		System.out.println(name.toString());
		
		//책 객제생성
		Book book=new Book(100,"채식주의자");
		System.out.println(book);
		System.out.println(book.toString());
		}
	}
	


