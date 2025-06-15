package jsondata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJson {

	public static void main(String[] args) {
		//member.json 파일 읽기
		try(BufferedReader br = new BufferedReader(new FileReader("member,json"))){
			String json = br.readLine();
			
			JSONObject root = new JSONObject(json);
			
			System.out.println(root.getString("id"));
			System.out.println(root.getString("name"));
			System.out.println(root.getInt("age"));
			System.out.println(root.getBoolean("student"));
			
			JSONObject tel = root.getJSONObject("tel");
			System.out.println("home:"+tel.getString("home"));
			System.out.println("mobile:"+tel.getString("mobile"));
			
			JSONArray skill = root.getJSONArray("skill");
			System.out.print("skill:");
			for(int i=0; i<skill.length(); i++) {
				System.out.print(skill.get(i)+",");
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
