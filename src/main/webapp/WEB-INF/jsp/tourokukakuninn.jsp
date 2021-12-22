<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Optional"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">

<title>OUBO</title>
</head>
<%
Optional<List<String[]>> optList = Optional.ofNullable((List<String[]>) request.getAttribute("list"));
List<String[]> list = new ArrayList<>();
if (optList.isPresent()) {
	list = optList.get();
}
%>
<body>

	<H1>OUBO</H1>
	<table class="table">
		<thead>
			<th>結果</th>
		</thead>
		<tbody>

			<%
			for (String[] s : list) {
			%>
			<tr>
				<td><%=Arrays.toString(s)%></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>

	<div class="row">
		<div class="col"></div>
		<div class="col-8">




			<h2>入力内容の確認</h2>
			<form action="/登録画面のサーブレット">

				<button type="submit" class="btn btn-primary">戻る</button>
			</form>

			<form action="/insert and delete">
				<button type="submit" class="btn btn-primary">決定</button>
			</form>
		</div>
		<div class="col"></div>
	</div>


</body>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"
	integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js"
	integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj"
	crossorigin="anonymous"></script>

</html>