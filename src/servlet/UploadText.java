package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AccountDao4;
/**
 * Servlet implementation class UploadText
 */
@WebServlet("/UploadText")
public class UploadText extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadText() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("WEB-INF/jsp/content.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//文字コードの設定
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		//ログイン画面で入力された値を取得
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String book = request.getParameter("book");
		String overview = request.getParameter("overview");
		
		AccountDao4 ac4 = new AccountDao4();
		ac4.insert(name, email, book, overview);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("WEB-INF/jsp/content.jsp");
		dispatcher.forward(request, response);
	}

}
