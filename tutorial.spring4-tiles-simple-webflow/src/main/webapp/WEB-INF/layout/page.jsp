<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"  %>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Spitter HTML5</title>
	</head>
<body>
	<div id="header">
		<t:insertAttribute name="header" />
	</div>
	<div id="content">
		<t:insertAttribute name="body" />
	</div>
	<div id="footer">
		<t:insertAttribute name="footer" />
	</div>
	
</body>
</html>