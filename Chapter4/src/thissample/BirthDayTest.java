package thissample;


//private생략하면 default로 public과 유사
class BirthDay{
	int year;
	int month;
	int day;
	
	public void serYear(int year) {
		this.year=year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
}


public class BirthDayTest {

	public static void main(String[] args) {
		// BirthDay객체생성
		BirthDay bDay=new BirthDay();
		bDay.serYear(2020);
		
		System.out.println(bDay);
		bDay.printThis();
	}

}
