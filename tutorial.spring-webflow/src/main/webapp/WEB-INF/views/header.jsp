<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"  %>


<li>
	<s:url value="/createOrders" var="createOrder"></s:url>
	<a href="${createOrder}">Buy books</a>
</li>