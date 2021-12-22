<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Optional"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>編集画面</title>
</head>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css">

<%
Optional<List<String[]>>optList = Optional.ofNullable((List<String[]>)request.getAttribute("list"));
List<String[]> list=new ArrayList<>();
if(optList.isPresent()){
	list = optList.get();
}
%>

<body bgcolor="#87cefa">
	<div class="header">
		<img src="./image/editHeader.svg">
	</div>
	
	<form method="get" action="あとでいれます" class="inputable">
		<table class="foodTable">
			<thead class="header">
				<tr>
					<th></th>
					<th>名前</th>
					<th>期限</th>
					<th>数</th>
				</tr>
			</thead>
			<tbody>
				<%! int count = 0; %>
				<% for (String[] s : list){ %>
    				<tr>
   						<td><%=++count %>
						<td><%=s[0] %></td>
						<td><input type="text" value=<%=s[1] %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=s[2] %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=s[3] %> class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
	    		<%} %>
	    		<%count=0; %>
			</tbody>
		</table>

		<table class="buttonTable">
			<tr>
				<td><a href="あとで"><button id="button" class="returnButton" type="button">戻る</button></a></td>
				<td><button type="submit" id="button" class="nextButton">決定</button></td>
			</tr>
		</table>
	</form>
	
</body>
</html>