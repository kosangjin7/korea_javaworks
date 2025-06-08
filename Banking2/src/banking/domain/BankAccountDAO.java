package banking.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankAccountDAO {

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static String url ="jdbc:oracle:thin:@localhost:1521/xe";
	static String username="javauser";
	static String password="pwjava";
	
	public void createAccount(BankAccount account) {
		String sql="INSERT INTO bank_account_VALUES (?,?,?)";
		
		try(Connection conn = DriverManager.getConnection(url,username,password);
				PreparedStatement pstmt=conn.prepareStatement(sql)){
			
			pstmt.setString(1, account.getAno());
			pstmt.setString(2, account.getOwner());
			pstmt.setInt(3,account.getBalance());
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
