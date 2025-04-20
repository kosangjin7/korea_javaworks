package reference.score;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Student {
	private int studentId;
	private String studentName;
	private Subject korean;
	private Subject math;
	
	
	public Student(int studentId,String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
		korean=new Subject();
		math=new Subject();
	}
	
	public void setKoreanSubject(String name,int score) {
		korean.setSubjectName(name);
		korean.setScorePointName(score);
	}
	public void setMathSubject(String name,int score) {
		math.setSubjectName(name);;
		math.setScorePointName(score);
	}
	public void showStudentInfo() {
		System.out.println(
				"학번:"+studentId+
				"\n이름:"+studentName+
				"\n국어점수:"+korean.getSubjectName()+
				"\n수학점수:"+math.ScorePointName());
			
			System.out.println("-----------------");	
				
				
				
				
				
		
	}
	
}
