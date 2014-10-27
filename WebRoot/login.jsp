<%@ page import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	</head>

	<body>
		<div>
			<form method="post" action="/LoginServlet">
				<table>
					<tr>
						<td>
							用户名：
						</td>
						<td>
							<input type="text" name="name" />
						</td>

					</tr>
					<tr>
						<td>
							密 码：
						</td>
						<td>
							<input type="text" name="password" />
						</td>
					</tr>
					<tr>
						<td>
							<input type="reset" value="重置" />
						</td>
						<td>
							<input type="submit" value="提交" />
						</td>
					</tr>
				</table>
			</form>
		</div>

	</body>
</html>
