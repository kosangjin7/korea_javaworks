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
		
		//회원수정
		/*Users renewUser=new Users();
		renewUser.setUserId("today ");
		renewUser.getUserPassword()"t1357!!");
		renewUser.getUserName("이종범");
		renewUser.getUserAge(50);
		
		dao.updateUser(renewUser);//수정메서드 호출*/
		
		//회원삭제
		dao.deleteUser("cloud");//삭제 메서드 호출
		
		List<Users> userList=dao.getUserList();
		for(int i=0;i<userList.size();i++) {
			Users findUser=userList.get(i);
			System.out.println(findUser);
		}
		
		//회원상세보기
		Users gerUser=dao.getUser("korea");
		System.out.println(getUser);
	}

}
