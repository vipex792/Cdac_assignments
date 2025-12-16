<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h2>Your order is placed successfully</h2>
		<h2>
			Your bill amount
			<%=request.getParameter("tamt")%>
			successfully
		</h2>
		<h2>Your order will be delivered in 2 days</h2>
		<h2>Thank you for visiting , do visit again</h2>
		<%--remove the session --%>
		<%
		System.out.println("session is invalidated");
		session.invalidate();
		%>

	<jsp:include page="Login.jsp"></jsp:include>
</body>
</html>