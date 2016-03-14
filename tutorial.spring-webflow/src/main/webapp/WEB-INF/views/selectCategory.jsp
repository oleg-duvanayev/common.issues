<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

 <section id="loginSection">
 
	<form:form id="theLoginForm" method="POST" modelAttribute="orderForm" action="${flowExecutionUrl}">

	 	 <form:errors path="*" element="div" cssClass="error" />
	 		<fieldset class="emailFieldGroup" id="emailFieldGroup">
	 		<legend>Select categories:</legend>
				<p>
					<label for="theCategory">Categories:</label>
					<form:select id="theCategory" path="categoryId" 
						items="${categoryList}" itemLabel="name" itemValue="id"></form:select>
				</p>
				<p>
					<input id="return" name="_eventId_cancel" type="submit" value="Cancel"  />
				</p>
				<p>
					<input id="continue" name="eventId_next" type="submit" value="Next"  />
				</p>
		 	</fieldset>
	</form:form>
 </section>