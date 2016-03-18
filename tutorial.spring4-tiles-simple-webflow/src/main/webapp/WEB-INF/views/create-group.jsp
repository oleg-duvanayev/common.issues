<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="theCreateGroupRoot">
		 <section id="createGroupSection">
			<sf:form id="theCreateGroupForm" method="POST" modelAttribute="createGroupForm" action="${flowExecutionUrl}" >
			 	 <sf:errors path="*" element="div" cssClass="error" />
			 		<fieldset class="emailFieldGroup" id="emailFieldGroup">
			 		<legend>CreateGroup:</legend>
		 				<c:if test="${not empty errDescription}">
		 					<p>
		 						<label cssErrorClass="error" id="theErrorDescription" name="errorDescription">${errDescription}</label>
		 					</p>
						</c:if>
						<p>
							<label for="theUserId" cssErrorClass="error">Group title:</label>
							<input id="theUserId" name="title" type="text" placeholder="Fügen Sie den Grouptitel" cssErrorClass="error" /><br />
						</p>
						<p>
						<button type="submit" name="_eventId_next">Next</button>
						<button type="submit" name="_eventId_cancel">Cancel</button>
						</p>
				 	</fieldset>
			</sf:form>
		 </section>
	 </div>