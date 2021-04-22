<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Historique</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
</head>
<body>
	<div class="container bg-warning" style="display:flex;flex-direction:column;align-items: center;justify-content: center">
		<h1>Perdu! Tu as usé toutes tes vies!</h1>
		<div>
			<h3>Historique des tentatives</h3>
			<table class=" table table-success table-hoover" style="width: 15rem">
				<thead>
					<tr >
						<th scope="col" >#</th>
						<th scope="col" >Nombre donné</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="row">1</th>
						<td>${nb1}</td>
					</tr>
					<tr>
						<th scope="row">2</th>
						<td>${nb2 }</td>
					</tr>
					<tr>
						<th scope="row">3</th>
						<td>${nb3 }</td>
					</tr>
			</table>
		</div>
		<div>
			<h4>Le bon nombre était  ${nombre}</h4>
		</div>
		<button class="btn btn-danger" onclick="window.close()">Quitter</button>
	</div>
</body>
</html>