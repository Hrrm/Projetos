<!DOCTYPE html>
<html>
<head>
	<title>Contate-me</title>
</head>
<body>
	<div class="col-md-6" id="divFormContato">
		<form action="envia.php" name="nFormContato" id="iFormContato" method="post" accept-charset="utf-8">
			<fieldset>
				<legend>Formulário de Contato</legend>
				<p><label for="iNome">Nome:&nbsp&nbsp</label><input type="text" name="nNome" id="iNome" size="20" 
				maxlength="50" placeholder="Digite seu nome" autofocus></p>
				<p><label for="iEmail">E-mail: </label><input type="email" name="nEmail" id="iEmail" size="35" maxlength="50" placeholder="seu_email@email.com"></p>
				<p><label for="iAssunto">Assunto: </label><input type="text" name="nAssunto" id="iAssunto" size="20" maxlength="25" placeholder="Assunto"></p>
				<p><label for="iMensagem">Mensagem:</label></p>
				<textarea name="nMensagem" id="iMensagem" cols="44" rows="5" maxlength="600" placeholder="Digite seu texto até 600 caracteres aqui."></textarea>
				<p><button type="submit">Enviar</button></p>
			</fieldset>
		</form>
	</div>
</body>
</html>