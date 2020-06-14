<?php 

	//ADICIONA API DE CONTROLE DO BD
	include('php/manterMYSqlLegendaryGame.php');
	
	//QUANDO A PÁGINA CARREGA LIMPA O $_POST,
	//ASSIM A PÁGINA ENTENDO QUE O USUÁRIO DESEJA ADICIONAR MAIS UMA NOTÍCIA
?>
<!DOCTYPE html>
<html>
<head>

	<meta charset='utf-8'>
	<meta name='viewport' content='width=device-width, initial-scale=1'>

	<title></title>

	<!--JQUERY JS BOOTSTRAP 4-->
	<script src="js/jquery-3.2.1.slim.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	
	<!--BOOTSTRAP 4-->
	<link rel="stylesheet" href="css/bootstrap.min.css">

	<!--MEU JS-->
	<script type="text/javascript" src="javascript/javascript.js"></script>

	<!--MEU CSS-->
	<link rel='stylesheet' type='text/css' href="css/principal.css">
	<link rel='stylesheet' type='text/css' href="css/animacao.css">
	<link rel="stylesheet" type="text/css" href="css/cadastranoticia.css">
</head>
<body>
	<header class='container-fluid'>
		<div  class='row align-items-center justify-content-center' style='height:100%; width: 70%; float: left;'>
			<div id='menu' class='col-md-12'>
					<div class='btnMenu'>Home</div>
					<div class='btnMenu'>Stream</div>
					<div class='btnMenu'>Vídeos</div>
					
			</div>
		</div>
		<div id='menu' class="row align-items-center justify-content-end" style="height: 100%;width:18%; margin-right: 2%; float: right;">
			<?php
				if($_SESSION)
					echo '<div class="btnMenu" onclick="deslogar();">Teste</div>';
			?>
		</div>
	</header>
	<main>
		<div class='row justify-content-center'>
			<div class='col-11 col-sm-8 col-md-4 col-lg-4 col-xl-4 form-control' id="iDivForm">

				<!--Tenha certeza que seu formulário de upload tenha o atributo enctype='multipart/form-data' por outro lado o upload não irá funcionar.-->
				<?php
					if($_SESSION){
						if($_POST){
							inserirConteudo();
							echo "<form action='cadastranoticia.php' method='get'><center><input type='submit' name='btnNovaNoticia' id='iNovaNoticia' value='Nova Noticia'/><center></form>";
						}else{
							echo "<form enctype='multipart/form-data' action='' method='post' id='centralizaForm'>
									Título:<br>
									<input style='width: 100%;' type='text' name='nTitulo' id='iTitulo' placeholder='Digite o título da notícia.' size='30'><br><br>
									Texto<br>
									<textarea style='width: 100%;'	 cols='38' rows='5'></textarea><br><br>
									Dia da Postagem<br>
									<input style='width: 100%;' style='width: 100%;' type='date' name='nData' id='iData'><br><br>
									Foto<br>
									<!--O campo escondido (input type='hidden') nMaxTamanho (medido em bytes) deve preceder o campo de input de arquivo (input type='file'), e o seu valor é o tamanho limite aceito pelo PHP-->
									<input type='hidden' name='nMaxTamanho' value='1500000' />
									<input style='width: 100%;' type='file' name='nFoto' id='iFoto'><br><br>
									<center><input type='submit' name='sEnviarNoticia' value='Enviar Noticia'></center>
								</form>";
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