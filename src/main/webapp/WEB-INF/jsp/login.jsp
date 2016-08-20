<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="login.page.title" /></title>
<style type="text/css">
	#form_login {
	   	width:24%;
	    height:22%;
	    background-color:ghostwhite;
	    position:absolute;
	    margin-left:-12%;
	    margin-top:-10%;
	    top:50%;
	    left:50%;
	    padding-left:2%;
	    padding-right:2%
	}
	table td {
		padding-left:6%;
	}
</style>
</head>
<body>
	<div id="parent">
		<form action="." method="post" modelAttribute="loginBean" id="form_login">
			<table>
				<tr>
					<td>
						<label>
							<spring:message code="login.page.userName"/>
						</label>
					</td>
					<td>
						<form:input path="loginBean.userName" autocomplete="off"/>
					</td>
				</tr>
				<tr>
					<td>
						<label>
							<spring:message code="login.page.passwd"/>
						</label>
					</td>
					<td>
						<form:input path="loginBean.passwd" autocomplete="off"/>
					</td>
				</tr>
			</table>
			<input id="#Submit" type="submit" value="<spring:message code="login.page.submit"/>" style="margin-left: 41%;padding-left: 5%;padding-right: 5%"/>
		</form>
	</div>
	<script	src="<c:url value="/resources/js/dataTables.bootstrap.min.js" />"></script>
	
</body>
</html>