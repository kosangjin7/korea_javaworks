package jsondata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class CtrateJson {

	public static void main(String[] args) {
		//json 객체생성 
		JSONObject root = new JSONObject();
		System.out.println(root);
		
		//속성추가
		root.put("id", "sky123");
		root.put("name", "이하늘");
		root.put("age", 23);
		root.put("student",true);
		
		//전화번호
		JSONObject tel = new JSONObject();
		tel.put("home","02-111-2222");
		tel.put("mobile","010-3333-5555");
		root.put("tel", tel);
		//배열 속성추가
		JSONArray skill = new JSONArray();
		skill.put("Java");
		skill.put("C");
		skill.put("C++");
		
		root.put("skill", skill);
		
		//json 데이터를 문자열로 생성
		String json=root.toString();
		System.out.println(json);
		
		//json 데이터를 파일로 저장
		try(Writer writer = new FileWriter("member,json",
				Charset.forName("utf-8"))){
					writer.write(json);
					writer.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
				

	}

}
