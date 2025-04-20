package reference.score;

public class ScoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee= new Student(1001,"이정후");
		Student shin= new Student(1002,"신유빈");
	   
		lee.setKoreanSubject("국어",90);
	    lee.setMathSubject("수학",85);
	    
	    shin.setKoreanSubject("국어",95);
	    shin.setMathSubject("수학",80);
	    
	    
	    lee.showStudentInfo();
	    shin.showStudentInfo();
	    
	}

}
