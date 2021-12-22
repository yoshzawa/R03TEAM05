<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>未入力エラー</title>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css">

</head>
 <body bgcolor="#87cefa">
        <div class="psi"> 
                <img src="./image/NotEnteredError.svg" width=800 height=400>
		</div>
		<div class="area">
				<a href="javascript:history.back()"><button class ="button" type="button">戻る</button></a>
        </div>
 </body>
</html>