<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<sf:form action="validate"  modelAttribute="userBean"  >
	

UserName:<sf:input path="uname"/>
   

Password:<sf:password path="pwd"/>
     
	<input type="submit" value="submit" /><br />

</sf:form>
</body>
</html>