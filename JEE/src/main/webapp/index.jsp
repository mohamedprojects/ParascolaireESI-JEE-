<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="model.Club"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

table {
	font-family: 'Arial';
	margin: 25px auto;
	border-collapse: collapse;
	border: 1px solid #eee;
	border-bottom: 2px solid #00cccc;
}

tr { &:hover { background:#f4f4f4;td { color:#555;
	
}

}
}
th, td {
	color: #999;
	border: 1px solid #eee;
	padding: 12px 35px;
	border-collapse: collapse;
}

th {
	background: #00cccc;
	color: #fff;
	text-transform: uppercase;
	font-size: 12px;
	&.
	last
	{
	border-right
	:
	none;
}
}
}
</style>
</head>
<body>

	<h2 style="text-align: center;">Inscription au clubs de l'ESI</h2>
	<%
	ArrayList<Club> liste = (ArrayList<Club>) request.getAttribute("ListeClub");
	ArrayList<Integer> listeId = (ArrayList<Integer>) request.getAttribute("listeId");
	Integer id = (Integer) request.getAttribute("Id");
	%>

	<table border="1">
		<tr>
			<th>N° Club</th>
			<th>Nom Club</th>
			<th>Nom Président</th>
			<th>Date création</th>
			<th>Actions</th>

		</tr>
		<%-- faire une boucle qui permet de visualiser liste des clubs disponibles --%>

		<%
		for (Club c : liste) {
		%>
		<tr>
			<td><%=c.getIdClub()%></td>
			<td><%=c.getNomClub()%></td>
			<td><%=c.getNomPresident()%></td>
			<td><%=c.getDateCreation()%></td>
			<td>
			<%-- faire une conditionne qui permet d'actualiser la valeur d'actions --%>
				<% if (listeId.contains(c.getIdClub())==false) {%> 
				<%-- vérifie si l'id de club est appartenu la liste qui regroupe l'ensemble des Ids de clubs qui l'utilisateur est déjà s'inscrit  --%>
				<a href="inscriptionController?idClub=<%=c.getIdClub()%>">[S'inscrire] </a> 
				<%
				 } else {
				 %> <a href="DesabonnementController?idClub=<%=c.getIdClub()%>">[Se désabonner] </a>
				 <%
				 }
				 %>
			</td>
		</tr>
		<%
	    }
	    %>
	</table>


</body>
</html>
