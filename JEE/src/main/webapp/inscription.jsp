<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Club"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
form {
	background-color: #47484;
	border-radius: 20px;
	box-sizing: border-box;
	height: 370px;
	padding: 20px;
	width: 320px;
	font-family: 'Arial';
	margin: 25px auto;
	border-collapse: collapse;
	border: 1px solid #eee;
	border-bottom: 2px solid #00cccc;
}

input[type=text] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

button {
	background-color: #00cccc;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

button:hover {
	opacity: 0.8;
}
</style>
<meta charset="ISO-8859-1">
<title style="text-align:center;">Remplir le formulaire suivante</title>
</head>
<body>
	<form action="/Controle/inscriptionController" method="post">

		<div class="container">
			<label><b>N° Club</b></label> <input type="text" name="idClub"
				style="background: #ebebeb" required="required"
				value="<%=request.getParameter("idClub")%>" readonly /> <label><b>Nom</b></label>
			<input type="text" placeholder="Nom abonné" name="nom" required>

			<label><b>Prénom</b></label> <input type="text"
				placeholder="Prénom abonné" name="prenom" required>

			<button type="submit">S'inscrire</button>

		</div>
	</form>

</body>
</html>