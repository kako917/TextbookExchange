<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"%>
    <%!
// サーブレットのinitメソッドに相当
public void jspInit() {
    try {
        // JDBCドライバをロード
        Class.forName("com.mysql.jdbc.Driver");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
%>

    
<!DOCTYPE html>
<html lang="ja" dir="ltr">
  <head>
      <meta charset="utf-8">
    <title>ホーム画面</title>
  </head>
  <body>

  </body>
  <aside>
    <h3>マイページ</h3><hr>
    <ul>
      <a href="">マイページ</a>
      <a href = "UploadText">教科書をあげる</a>
      <a href="LoginServlet">ログアウト</a>
    </ul>
    <hr>
    <table>
    <tr>
      <th>名前</th>
      <th>メアド</th>
      <th>教科書の名前</th>
      <th>教科書の概要</th>
    </tr>
    
    <%
        // データベースへのアクセス開始
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // データベースに接続するConnectionオブジェクトの取得
            con = DriverManager.getConnection("jdbc:mysql://localhost/customer_control_db?useSSL=false&serverTimezone=Japan", "root", "Mango0824");
            // データベース操作を行うためのStatementオブジェクトの取得
            stmt = con.createStatement();
            // SQL()を実行して、結果を得る
            rs = stmt.executeQuery("select * from aboutbook");

            // 得られた結果をレコードごとに表示
            while (rs.next()) {
%>
                <tr>
                <%-- レコードのNOフィールドを表示 --%>
                <td><%= rs.getString("name")%></td>
                <%-- レコードのNAMEフィールドを表示 --%>
                <td><%= rs.getString("email")%></td>
                <%-- レコードのPRICEフィールドを表示 --%>
                <td><%= rs.getString("book")%></td>
                <td><%= rs.getString("overview")%></td>
                </tr>
<%
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // データベースとの接続をクローズ
            try { rs.close(); } catch (Exception e) {}
            try { stmt.close(); } catch (Exception e) {}
            try { con.close(); } catch (Exception e) {}
        }
%>
    
   
    <!--c:forEach items="${dbdata}" var="dbdataLine"-->
    <!--tr>
      <td>${dbdataLine.col1}</td>
      <td>${dbdataLine.col2}</td>
      <td>${dbdataLine.col3}</td>
      <td>${dbdataLine.col4}</td>
    </tr-->
    <!--/c:forEac -->
  
  </table>
  </aside>
</html>