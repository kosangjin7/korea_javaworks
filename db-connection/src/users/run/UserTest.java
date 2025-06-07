package users.run;

import java.util.List;

import users.domain.Users;
import users.domain.UsersDAO;

public class UserTest {

	public static void main(String[] args) {
		Users user =new Users();//Users객체생성
		UsersDAO dao=new UsersDAO();
		
		/*user.setUserId("korea");
		user.setUserPassword("2468!!");
		user.setUserName("이대헌");
		user.setUserAge(31);
		dao.insertUser(user);*/
		
		List<Users> userList=dao.getUserList();
		for(int i=0;i<userList.size();i++) {
			Users findUser=userList.get(i);
			System.out.println(findUser);
		}
		
	}

}
