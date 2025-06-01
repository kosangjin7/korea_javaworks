package typing;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample2 {

	public static void main(String[] args) {

		//파일쓰기
		try(Writer writer = new FileWriter("word.txt")){
			String words="ant bear cow chicken eagle elephant"
		+ "fox horse monkey penguin tiger";
	
			writer.write(words);
			
			writer.flush();
			System.out.println("파일쓰기완료");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
