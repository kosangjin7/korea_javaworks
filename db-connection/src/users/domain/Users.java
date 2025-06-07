package users.domain;

//users클래스(자료형)-DTO(data transfer object) 정의
public class Users {
	private String userId;
	private String userPassword;
	private String userName;
	private int userAge;
	
	
	public  void  userId(String userId) {
		this.userId=userId;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getUserAge() {
		return userAge;
	}


	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}


	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userPassword=" + userPassword + ", userName=" + userName + ", userAge="
				+ userAge + "]";
	}
	
}
