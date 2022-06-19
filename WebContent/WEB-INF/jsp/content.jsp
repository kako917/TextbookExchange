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
      <h2>あげる</h2>
      <form action="">
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
      </form>
    </div><!-- /.wrapper -->

  </body>
</html>