<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>あげる</title>
  </head>
  <body>
    <div class="wrapper">
      <h2>譲る教科書をアップロード</h2>
      <form action="<%=request.getContextPath() %>/UploadText">
 				<table style="margin:0 auto">
 					<tr>
 						<td style="width:60">名前</td>
 						<td ><input type=text size="30" name="name"></input></td>
 					</tr>
 					<tr>
 						<td style="width:70">メールアドレス</td>
 						<td ><input type=text size="30" name="email"></input></td>
 					</tr>
 					<tr>
 						<td style="width:70">教科書の名前</td>
 						<td ><input type=text size="30" name="book"></input></td>
 					</tr>
 					<tr>
 						<td style="width:70">教科書の概要</td>
 						<td ><input type=text size="30" name="overview"></input></td>
 					</tr>
 					<tr>
 						<td style="width:70">教科書の画像</td>
 						<td><input type="file" name="pict"></input></td>
 					</tr>
 					<tr>
 						<td colspan=2 style="text-align:center">
 							<input type="submit" value="登録">
 						</td>
 					</tr>
 				</table>
 			</form>
       
      <!--form action="UploadText" method="post" enctype="multipart/form-data">
        <div>
          <label for="name">名前</label>
          <input type="text" id="name" name="your-name">
        </div>
        <div >
          <label for="email">メールアドレス</label>
          <input type="email" id="email" name="your-email">
        </div>
        <div>
          <label for="name">本の名前</label>
          <input type="text" id="bookname" name="your-bookname">
        </div>
        <div >
          <label for="file">本の画像</label>
          <input type="file" id="file" accept="image/png">
        </div>
        <div>
          <label for="message">本の概要</label>
          <textarea id="message" name="your-message"></textarea>
        </div>
        <input type="submit" class="button" value="送信">
      </form-->
      <div>
         <a href = "MainServlet">戻る</a>
     </div>
    </div><!-- /.wrapper -->

  </body>
</html>