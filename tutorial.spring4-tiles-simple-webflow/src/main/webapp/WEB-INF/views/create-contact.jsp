<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="theCreateContactRoot">
		 <section id="createContactSection">
			<sf:form id="theCreateContactForm" method="POST" modelAttribute="createContactForm" action="${flowExecutionUrl}" >
			 	 <sf:errors path="*" element="div" cssClass="error" />
			 		<fieldset class="emailFieldGroup" id="emailFieldGroup">
			 		<legend>Create Contact:</legend>
		 				<c:if test="${not empty errDescription}">
		 					<p>
		 						<label cssErrorClass="error" id="theErrorDescription" name="errorDescription">${errDescription}</label>
		 					</p>
						</c:if>
						<p>
							<label for="theUserName" cssErrorClass="error">Surname:</label>
							<input id="theUserName" name="surname" type="text" placeholder="Fügen Sie Ihr Vornname" cssErrorClass="error" /><br />
						</p>
						<p>
							<label for="theUserVorName" cssErrorClass="error">Name:</label>
							<input id="theUserVorName" name="name" type="text" placeholder="Fügen Sie Ihr Familienname" cssErrorClass="error" /><br />
						</p>
						<p>
							<label for="theUserEmail" cssErrorClass="error">Email:</label>
							<input id="theUserEmail" name="email" type="email" placeholder="Fügen Sie Ihr email" cssErrorClass="error" /><br />
						</p>
						<p>
							<input id="addContact_btn" name="_eventId_add" type="submit" value="add contact"  />
							<input id="saveGroup_btn" name="_eventId_save" type="submit" value="Save group"  />
							<input id="cancel_btn" name="_eventId_cancel" type="submit" value="Cancel"  />
						</p>
				 	</fieldset>
			</sf:form>
		 </section>
	 </div>