package users.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//DAO(data acess object)-데이터메이스에 연결,데이터를 생성,조회,수정,삭제등의
//작업을 하는 클래스
public class UsersDAO {
	//DB 에 연결
	static {
		try {
			//클래스 로딩시 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static String url ="jdbc:oracle:thin:@localhost:1521/xe";//db경로
	static String username="system";//사용자계정
	static String password="1234";//사용자 비밀번호
	
	//회원생성
	public void insertUser(Users users) {
		//SQL-DML(삽입구문)
		//?-칼럼값을 칼럼명에 바인딩 시킴
		//Connestion(db 연결),PreparedStatement(sq작업)객체 생성
		String sql="INSERT INTO users (userId,userpassword,username,userage)"
		+ "VALUES (?,?,?,?)";
		
		try(Connection conn=DriverManager.getConnection(url,username,password);
			PreparedStatement pstmt=conn.prepareStatement(sql)){	
			
				pstmt.setString(1, user.getUserId());
				pstmt.setString(2, user.getUserPassword());
				pstmt.setString(3, user.getUserName());
				pstmt.setInt(4, user.getUserAge());
				
				pstmt.executeUpdate();//sql실행(커밋과 같은 역할)
				
				
				
			}catch(SQLException e) {
				e.printStackTrace();
			}	
		}
	
		//회원목록 추가
		public List<Users> getUserList(){
			String sql ="SELECT * FROM users";
			List<Users> userList = new ArrayList<>();
			
			try(Connection conn=DriverManager.getConnection(url,username,password);
			    PreparedStatement pstmt=conn.prepareStatement(sql);
					ResultSet rs=pstmt.executeQuery()){
				
				while(rs.next()) {
					Users user=new Users();
					user.setUserId(rs.getString("userid"));
					user.setUserPassword(rs.getString("userpassword"));
					user.setUserName(rs.getString("username"));
					user.setUserAge(rs.getInt("userage"));
					
					userList.add(user);
				}
				
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return userList;
		}
	
	
	
	
	
	
	
	
	
	
	
	

}
