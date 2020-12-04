<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Place your order</h1>
<sf:form action="saveordercontroller" modelAttribute="customer">
<sf:label path="custname">Customer Name</sf:label>
  <sf:input path="custname"/><br>
  <sf:label path="address">Address</sf:label>
  <sf:input path="address"/><br>
  <sf:label path="phone">phone no</sf:label>
  <sf:input path="phone"/><br>
  Choose Topping:
  <select name="topping">
  <c:forEach var="choice" items="${pizzatoppings}">
  <option value="${choice.key}">${choice.value}</option>
  </c:forEach>
  </select>
  <br>
  <input type="submit" value="order"/>
  
</sf:form>
</body>
</html>