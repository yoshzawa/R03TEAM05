<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Login</h1>
    <FORM method="POST" action="Control">
      UserName : <INPUT type="text" name="username"><br><br>
      Password : <INPUT type="password" name="password"><br><br>
      <INPUT type="submit" name="pagename" value="SEND">
      <INPUT type="reset" value="RESET">  
    </FORM>  
  </body>
</html>