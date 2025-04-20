package reference.score2;

import reference.score.Subject;

public class Student {
	private int studentId;
	private String studentName;
	private Subject[] subjects;
	
	public Student(int studentId,String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
		subjects=new Subject[10];
	}
	
	public void addSubject(String name,int score) {
		Subject subject=new Subject();
		
		subject.setSubjectName(name);
		subject.setScorePointName(score);
		
		for(int i=0;i<subjects.length;i++) {
			if(subjects[i]==null) {
				subjects[i]=subject;
				break;
			}
		}
	}
	public void displayInfo() {
		//과목 총점,개수, 평균
		int total=0;
		int count=0;
		double avg;
		
		
		
		//학번,이름출력
		System.out.println("학번:"+studentId+
				"\n이름:"+studentName);
		
		//과목출력
		for(int i=0;i<subjects.length;i++) {
			if(subjects[i] !=null) {
				
				total +=subjects[i].getScorePoint();
				count ++;
				
				System.out.println(     
						subjects[i].getSubjectName()+
						"점수:"+subjects[i].getScorePoint()						
						
						);
			}
			System.out.println("==========================");
			//평균 계산=총점/개수
			
			avg=(double)total/count;
			System.out.println("평균점수: %.1f점",avg);
			System.out.println("\n==================");
			
			
		}
	}
	
}
