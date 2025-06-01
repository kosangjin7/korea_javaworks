package buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderTest {

	public static void main(String[] args) {
		// 파일 읽기-보조스트림
		try(Reader reader = new FileReader("message.txt");
			BufferedReader br=new BufferedReader(reader)){
			String str;//읽은 문자 저장 변수
			int lineNo=1;//행번호 생성
			while((str= br.readLine()) !=null) {
				System.out.println(lineNo +" "+str);
				lineNo++;
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
