<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/dataTables.bootstrap.min.css"/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap.min.css"/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/jquery.dataTables.min.css"/>">
</head>
<body>

	<table id="mainTable" width="100%" cellspacing="0" class="display" style="margin: 1px 1px">
		<thead>
            <tr>
                <th>Title</th>
                <th>Publisher</th>
                <th>Description</th>
                <th>Authors</th>
            </tr>
        </thead>	
	</table>
	
	<script src="<c:url value="/resources/js/jquery-3.1.0.min.js" />"></script>
	
	<%-- <script src="<c:url value="/resources/js/jquery-1.12.3.min.js" />"></script> --%>
	<script src="<c:url value="/resources/js/jquery.dataTables.min.js" />"></script>
	<script	src="<c:url value="/resources/js/dataTables.bootstrap.min.js" />"></script>
	<script type="text/javascript">
	
			$(document).ready(function() {
				$('#mainTable').DataTable({
					"ajax" : {
					"dataType": 'json',
			        "contentType": "application/json; charset=utf-8",
			        "type": "POST",						
					"url":"<c:url value='/REST/getAllBooks.json'/>",
					"dataSrc": "bookList",
					"deferRender" : true,
					},
					"columns" : [
					{
						"data" : "title"
					}, {
						"data" : "publisher"
					}, {
						"data" : "description"
					}, {
						"data" : "authors[, ]"
					} ]
				});
			});
		</script>
</body>
</html>