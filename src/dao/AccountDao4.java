package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountDao4 {

	public void insert(String name, String email, String book, String overview) throws IOException{
		//DBconfig.propertiesの各値をlist形式で取得

		//DBconfig.propertiesのurlを取得
		String url = "jdbc:mysql://localhost/customer_control_db?useSSL=false&serverTimezone=Japan";
		//DBconfig.propertiesのuserを取得
		String db_user_name = "root";
		//DBconfig.propertiesのpasswordを取得
		String db_password = "Mango0824";

		String sql = "insert into aboutbook values(?, ?, ? ,?)";
		

		//ログインユーザのオブジェクト生成(DTO)
		//LoginUser login_user = new LoginUser();
		//ログインユーザの情報をリスト形式で取得する
		//List<LoginUser> user_info = new ArrayList<LoginUser>();

        try{
        	Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,db_user_name,db_password);
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setString(2, email);
			stmt.setString(3, book);
			stmt.setString(4, overview);
			//変数sqlの一番目の?に引数のuserをセットする
			//stmt.setString(1, user);
			//変数sqlの二番目の?に引数のpasswordをセットする
			//stmt.setString(2, password);
			//sqlを実行し該当するデータ格納
			int rs = stmt.executeUpdate();

			/*if(rs.next()) {
				login_user.setId(rs.getInt("id"));
				login_user.setName(rs.getString("name"));
				login_user.setPassword(rs.getString("password"));
				user_info.add(login_user);
			} else {
				login_user.setName("No user");
				login_user.setPassword("Not match password");
				user_info.add(login_user);
			}*/
		} catch (SQLException e) {
			e.printStackTrace();
			//login_user.setName("田中");
			//login_user.setPassword("11223344");
			//user_info.add(login_user);
		
		}catch(ClassNotFoundException e) {
		//login_user.setName("No user");
		//login_user.setPassword("Not match password");
		//user_info.add(login_user);
		}
	
		//return user_info;
	}
	
	public void insertCustomer(int id, String name, String email) throws IOException{
		//DBconfig.propertiesの各値をlist形式で取得

		//DBconfig.propertiesのurlを取得
		String url = "jdbc:mysql://localhost/customer_control_db?useSSL=false&serverTimezone=Japan";
		//DBconfig.propertiesのuserを取得
		String db_user_name = "root";
		//DBconfig.propertiesのpasswordを取得
		String db_password = "Mango0824";

		String sql = "insert into login_user_tb values(? ,?, ?)";
		

		//ログインユーザのオブジェクト生成(DTO)
		//LoginUser login_user = new LoginUser();
		//ログインユーザの情報をリスト形式で取得する
		//List<LoginUser> user_info = new ArrayList<LoginUser>();

        try{
        	Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,db_user_name,db_password);
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, email);
			//stmt.setString(3, book);
			//stmt.setString(4, overview);
			//変数sqlの一番目の?に引数のuserをセットする
			//stmt.setString(1, user);
			//変数sqlの二番目の?に引数のpasswordをセットする
			//stmt.setString(2, password);
			//sqlを実行し該当するデータ格納
			int rs = stmt.executeUpdate();

			/*if(rs.next()) {
				login_user.setId(rs.getInt("id"));
				login_user.setName(rs.getString("name"));
				login_user.setPassword(rs.getString("password"));
				user_info.add(login_user);
			} else {
				login_user.setName("No user");
				login_user.setPassword("Not match password");
				user_info.add(login_user);
			}*/
		} catch (SQLException e) {
			e.printStackTrace();
			//login_user.setName("田中");
			//login_user.setPassword("11223344");
			//user_info.add(login_user);
		
		}catch(ClassNotFoundException e) {
		//login_user.setName("No user");
		//login_user.setPassword("Not match password");
		//user_info.add(login_user);
		}
	
		//return user_info;
	}
 }