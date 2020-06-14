<?php 
	include("php/manterMYSqlLegendaryGame.php");
?>
<!DOCTYPE html>
<html>
<head>

	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title></title>

	<!--JQUERY JS BOOTSTRAP 4-->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
	<!--BOOTSTRAP 4-->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">


	<!--MEU JS-->

	<!--MEU CSS-->
	<link rel="stylesheet" type="text/css" href="css/login.css">
	<link rel="stylesheet" type="text/css" href="css/principal.css">
	<link rel="stylesheet" type="text/css" href="css/animacao.css">
</head>
<body>
	<header class="container-fluid">
		<div id="menu" class="col-md-12" align="center;">
			<bottom>
				<div class="btnMenu">Home</div>
				<div class="btnMenu">Stream</div>
				<div class="btnMenu">Vídeos</div>
			</bottom>
		</div>
	</header>
	<main>
		<div class="row justify-content-center">
			<div class="col-7 col-sm-5 col-md-4 col-lg-4 col-xl-3 form-control" id="iDivForm">
				<?php
				if(!$_POST){
						if($_SESSION){
							header('location:cadastranoticia.php');

						}else{
							echo '
							<form align="center" name="nFormLogin" id="iFormLogin" action="" method="post">
								<label align="center" for="iTxtLogin">Usuário</label>
								<input type="text" name="nTxtLogin" id="iTxtLogin">
								<label align="center" for="iSenha">Senha</label>
								<input type="password" name="nSenha" id="iSenha">
								<input type="submit" name="nEntrar" id="iEntrar" value="Entrar">
							</form>
							';
						}
				}else{
					checaLogin();
				}
				?>
			</div>			
		</div>
	</main> 
	<footer>

	</footer>
</body>
</html>