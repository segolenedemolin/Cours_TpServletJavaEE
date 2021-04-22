<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page de connexion</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.rtl.min.css" integrity="sha384-trxYGD5BY4TyBTvU5H23FalSCYwpLA0vWEvXXGm5eytyztxb+97WzzY+IWDOSbav" crossorigin="anonymous">
</head>
<body>
<div class="container">
<c:if test="${message!=null}">
<div class="alert alert-danger" role="alert">
  Joueur inconnu
</div>
</c:if>
		<h1 class="text-info bg-dark  text-center"> Connexion : </h1>
		<form method="post"  style="width: 25rem; margin: auto">
				  <label for="email" >Login</label>
					<input type="text" class="form-control" id="email" name="login">
				<label for="mdp">Password</label>
				<input type="password" class="form-control  mb-3" id="mdp" name="mdp">
			<button type="submit" class="btn btn-success">Connexion</button>
		</form>
	</div>
</body>
</html>