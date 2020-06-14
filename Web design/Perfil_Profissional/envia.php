<!DOCTYPE html>
<?php
	$to = $_POST['nEmail'];
	$subject = $_POST['nAssunto'];
	$mensagem = $_POST['nNome'] . ": " . $_POST['nMensagem'];

	if(isset($to) && isset($subject) && isset($mensagem)){
		echo "está certo";
	}else{
		echo"não está certo";
	}

	if(mail($to, $subject, $mensagem)){
		echo "E-mail enviado.";
	}else{
		echo "Por favor preencha todos os campos.";
	}
?>
<html>
<head>
	<title>enviado</title>
</head>
<body>

</body>
</html>