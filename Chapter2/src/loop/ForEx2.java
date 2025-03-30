package loop;

public class ForEx2 {

	public static void main(String[] args) {
		// 문자 세트-아스키 코드,유니 코드
		char ch;//전역변수(전체에 영향을 미치는 변수)
    //	ch=65;
   //	ch=(char)(ch+1);
    	
  //  	ch++;
		
	    for(ch=65;ch<123;ch++) {
			System.out.println(ch);
		}
		
		System.out.println();
		
		//한글출력
		for(ch=12593; ch<12686; ch++) {
			System.out.println(ch + " ");
		}
		
		//구구단 출력
		int dan=6;
		for(int i=1; i<10; i++) {
			System.out.println(dan + "x"+ i + "="+(dan*i));
		}
		
		

	}

}
