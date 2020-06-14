<?php
	include('php/manterMYSqlLegendaryGame.php');

	//QUANDO A PÁGINA CARREGA LIMPA O $_POST,
	//ASSIM A PÁGINA ENTENDO QUE O USUÁRIO DESEJA ADICIONAR MAIS UMA NOTÍCIA
	unset($_POST['']);
?>
<!DOCTYPE html>
<html>
<head>

	<meta charset='utf-8'>
	<meta name='viewport' content='width=device-width, initial-scale=1'>

	<title></title>

	<!--JQUERY JS BOOTSTRAP 4-->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
	<!--BOOTSTRAP 4-->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

	<!--MEU JS-->

	<!--MEU CSS-->
	<link rel='stylesheet' type='text/css' href="css/principal.css">
	<link rel='stylesheet' type='text/css' href="css/animacao.css">
	<link rel="stylesheet" type="text/css" href="css/criaLogin.css">
</head>
<body>
	<header class='container-fluid'>
		<div id='menu' class='col-md-12' align='center;'>
			<bottom>
				<div class='btnMenu'>Home</div>
				<div class='btnMenu'>Stream</div>
				<div class='btnMenu'>Vídeos</div>
			</bottom>
		</div>
	</header>
	<main>
		<div class='row justify-content-center'>
			<div class='col-11 col-sm-8 col-md-4 col-lg-4 col-xl-4 form-control' id="iDivForm">
				<?php

					if($_SESSION){
						if(!$_POST){
							echo "<form action='' method='post' name='nFormCriaLogin' id='iFormCriaLogin'>
								<center>
									<!--TÍTULO DO FORM-->
									<legend>Criar Usuário</legend>

									<!--LOGIN-->
									<label for='iTxtLogin' name='nLblLogin' id='iLblLogin'>Login</label>
									<input type='text' name='nTxtLogin' id='iTxtLogin' maxlength='50'><br>

									<!--NOME-->
									<label for='iTxtNome' name='nLblNome' id='iLblNome'>Nome</label>
									<input type='text' name='nTxtNome' id='iTxtNome' maxlength='50'><br>

									<!--SENHA-->
									<label for='iTxtSenha' name='nLblSenha' id='iLblSenha'>Senha</label>
									<input type='text' name='nTxtSenha' id='iTxtSenha' maxlength='20'><br>

									<!--EMAIL-->
									<label for='iTxtEmail' name='nLblEmail' id='iLblEmail'>E-mail</label>
									<input type='email' name='nTxtEmail' id='iTxtEmail' maxlength='50'><br>

									<!--NÍVEL DE USUÁRIO-->
									<fieldset>
										<legend>Nível de Usuário</legend>
										<select name='nNivelUsuario' id='iNivelUsuario'>
											<option value='0'>Administrador</option>
										</select><br>
									</fieldset><br>
									
									<!--SUBMIT-->
									<input type='submit' name=''>
								</center>
							</form>";
						}else{
							inserirConteudo();
						}
					}else{
						echo "<center>Faça login para acessar a página.</center><center><a href='login.php'>Login</a></center>";
					}
				?>
			</div>
		</div>
	</main>
	<footer>

	</footer>
</body>
</html>