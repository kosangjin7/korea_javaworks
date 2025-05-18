package interfaces.bookshelf;

import java.util.ArrayList;

//책제목 저장할 선반 클래스 정의
public class Shelf {
	
	private ArrayList<String> shelf;
	
	public Shelf() {
		shelf=new ArrayList<>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
		
	}

}
