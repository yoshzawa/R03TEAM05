<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="insert.css">
<title>登録画面</title>
</head>
<body>
	<%--<table align="center" border="1" style="border-collapse: collapse">--%>
		<tr>
			<th>あああああ</th>
			<th>名前</th>
			<th>期限</th>
			<th>数</th>
		</tr>
		<tr>
			<td>
				＋
			</td>

			<td><input type="text" name="name"></td>

			<td><input type="date" value="today" id="today" min="2021-11-01"
				max="2022-02-28"> <script src="today.js"></script></td>

			<td>
				<div class="container">

					<div class="field">
						<button class="button" id="down">－</button>
						<input type="text" value="0" class="inputtext" id="textbox">
						<button class="button" id="up">＋</button>
					</div>
				</div> <script src="main.js"></script>
			</td>
		</tr>
		<tr>
<td>
				＋
			</td>

			<td><input type="text" name="name"></td>

			<td><input type="date" value="today" id="today" min="2021-11-01"
				max="2022-02-28"><script src="today.js"></script></td>

			<td>
				<div class="container">

					<div class="field">
						<button class="button" id="down">－</button>
						<input type="text" value="0" class="inputtext" id="textbox">
						<button class="button" id="up">＋</button>
					</div>
				</div><script src="main.js">			</td>
		</tr>
	<%-- </table>--%>
	<button type="submit" class="btn btn-primary">これで応募</button>
</body>
</html>