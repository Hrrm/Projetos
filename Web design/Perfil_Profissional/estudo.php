<!DOCTYPE html>
<html>
<head>
	<title>Estudo</title>
</head>
<body>
	<form action="estudo.php" method="post" accept-charset="utf-8">
		<input type="text" name="texto">
		<input type="submit" value="Calcular" name="calcular">
	</form>
	<?php
		if(isset($_POST['texto'])){
			$texto = $_POST['texto'];
			echo $texto;
		}
	 ?>
</body>
</html>