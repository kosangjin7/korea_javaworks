package enums;

import java.util.Calendar;

public class WeekTest {

	public static void main(String[] args) {

		Week today = null;
		
		//요일-인섹스(1-일,2-월,3-화....)
		Calendar cal=Calendar.getInstance();
		int week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);//1
		
		//열거형 상수를 사용해서 요일을 출력
		switch(week) {
		case 1:
			today = week.SUNDAY ; break;
		case 2:
			today = week.MONDAY ; break;
		case 3:
			today = week.TUESDAY; break;
		case 4:
			today = week.WEDNESDAY; break;
		case 5:
			today = week.THURSDAY ; break;
		case 6:
			today = week.FRIDAY ; break;
		case 7:
			today = week.SATURDAY ; break;
		default:
			System.out.println("해당요일이 없습니다."); break;
			
		}
		System.out.println("Today is"+today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 놀러 나갑니다.");
		}else {
			System.out.println("평일에는 열심히 코딩합니다.");
		}
		
	}

}
