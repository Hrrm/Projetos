<?php 
	include("php/gerenciapaginas.php");
?>
<!DOCTYPE html>
<html>
<head>

	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

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
		<div class="row">
			<div class="col">
				<?php
					if($pagina_atual = 'noticia'){
						include("php/noticias.php");
					}
				?>
			</div>
		</div>
	</main>
	<footer>

	</footer>
</body>
</html>