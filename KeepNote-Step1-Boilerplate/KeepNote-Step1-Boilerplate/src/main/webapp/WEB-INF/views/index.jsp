
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KeepNote</title>
</head>
<body>
	<!-- Create a form which will have text boxes for Note ID, title, content and status along with a Send 
		 button. Handle errors like empty fields -->

	<!-- display all existing notes in a tabular structure with Id, Title,Content,Status, Created Date and Action -->

    <h2>Enter Note Information</h2>

	<form action="saveNote" method="post">

	  Note ID:<br>
	  <input type="number" id="noteId" name="noteId"><br>
	  Title:<br>
	  <input type="text" id="noteTitle" name="noteTitle"><br>
	  Content:<br>
	  <input type="textarea" id="noteContent" name="noteContent"><br>
	  Status:<br>
	  <select id="noteStatus" name= "noteStatus">
		  <option value="active">Active</option>
		  <option value="inactive">Inactive</option>
	  </select>
	  <br>
	  <br>
	  <input type="submit" value="Submit">

	</form>
	<br>

	<!-- display all existing notes in a tabular structure with Id, Title,Content,Status, Created Date and Action -->
    <c:if test="${not empty error}">
	   <p style="color:black"></p> ${error}
	</c:if>
	<h2>Saved Notes</h2>
	<table border="1">
	<c:forEach items="${SavedNotes}" var="note">
		<tr>
		<td>Note ID</td>
		<td>${noteId}</td>
		</tr>

		<tr>
		<td>Title</td>
		<td>${noteTitle}</td>
		</tr>

		<tr>
		<td>Content</td>
		<td>${noteContent}</td>
		</tr>

		<tr>
		<td>Status</td>
		<td>${noteStatus}</td>
		</tr>

		<tr>
		<td>Created at</td>
		<td>${createdAt}</td>
		</tr>
		<tr>
		<td>

		<form action="deleteNote" method="post">
			<input type="hidden" id="noteId" name="noteId" value="${noteId}"/>
			<button type="submit">Delete</button>
		</form>
		</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>