package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.DataBean;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        getDB(request);
		
		response.setCharacterEncoding("UTF-8");
		
		ServletContext context = this.getServletContext();
		//AccountDao4 ac4 = new AccountDao4();
		getDB(request);
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("WEB-INF/jsp/customer_list.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void getDB(HttpServletRequest request) {
		//DBconfig.propertiesのurlを取得
				String url = "jdbc:mysql://localhost/customer_control_db?useSSL=false&serverTimezone=Japan";
				//DBconfig.propertiesのuserを取得
				String db_user_name = "root";
				//DBconfig.propertiesのpasswordを取得
				String db_password = "Mango0824";

				String sql = "select * from aboutbook";
				

				//ログインユーザのオブジェクト生成(DTO)
				//LoginUser login_user = new LoginUser();
				//ログインユーザの情報をリスト形式で取得する
				//List<LoginUser> user_info = new ArrayList<LoginUser>();

		        try{
		        	Class.forName("com.mysql.jdbc.Driver");
		            Connection conn = DriverManager.getConnection(url,db_user_name,db_password);
					//PreparedStatement stmt = conn.prepareStatement(sql);
		        //String sql = "select * from Table_2;"; 
		            Statement stmt = conn.createStatement(); 
		            ResultSet rs = stmt.executeQuery(sql);

		            List<DataBean> list = new ArrayList<DataBean>();
		        
		            while (rs.next()) { 
		              list.add(new DataBean(rs.getString("col1"), rs.getString("col2"), rs.getString("col3"), rs.getString("col4")));
		            }
		        
		            request.setAttribute("dbdata", list);
		        
		            rs.close();   
		            stmt.close();
		            conn.close();
		        
		        }  catch (Exception e) { 
		             e.printStackTrace(); 
		        } finally {
		    	  
		      }
	}

	
	

}
