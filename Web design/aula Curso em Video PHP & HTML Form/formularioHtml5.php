<!-- <label for=""></label> -->

<!DOCTYPE html>
<html>
<head>
	<title></title>
	<script src="javascript/pagina.js"></script>
	<link rel="stylesheet" type="text/css" href="css/aulaHtmlFormulario.css">
</head>
<body>
	 <form method="post" id="fContato" action="" accept-charset="utf-8" oninput="calc_total();">
		<fieldset id="usuario">
			<legend>Identificação do Usuário</legend>		
		 	<p><label for="cNome">Nome:</label> <input type="text" name="tNome" id="cNome" size="25" maxlength="50" placeholder="Seu nome completo" /></p>
		 	<p><label for="cSenha">Senha:</label> <input type="password" name="tSenha" id="cSenha" size="8" maxlength="8" placeholder="8 digitos" /></p>
		 	<p><label for="cEmail">E-mail:</label> <input type="email" name="tEmail" id="cEmail" size="40" maxlength="50"/ placeholder="Digite aqui seu e-mail" ></p>
		 	<fieldset id="sexo">
		 		<legend>Sexo</legend>
		 		<input type="radio" name="tSexo" id="cMasc" checked /><label for="cMasc" >Masculino</label><br/>
		 		<input type="radio" name="tSexo" id="cFem" /><label for="cFem" >Feminino</label>
			 </fieldset>
	 		<p><label for="cNasc">Data de Nascimento:</label> <input type="date" name="tNasc" id="cNasc" </p>
	 	</fieldset>

	 	<fieldset id="endereco">
	 		<legend>Endereço do Usuário</legend>	 	
	 		<p><label for="cRua">Logradouro:</label> <input type="text" name="tRua" id="cRua" placeholder="Rua, Travessa, Av." /></p>
	 		<p><label for="cNum">Número:</label> <input type="number" name="tNum" id="cNum" min="0" max="99999" /></p>
	 		<p><label for="cUF">Estado:</label> 
	 			<select name="cUF" id="cUF">
	 				<optgroup label="Região Nordeste">
	 					<option value="PE" selected>Pernambuco</option>
	 				</optgroup>
	 				
	 				<optgroup label="Região Sudeste">
	 					<option value="RJ">Rio de janeiro</option>
	 					<option value="SP">São Paulo</option>
	 				</optgroup>

	 				<optgroup label="Região Centro-Oeste">
	 					<option value="MG">Minas Gerais</option>
	 				</optgroup>
	 				
	 				<optgroup label="Região Sul">
	 					<option value="PR">Paraná</option>
		 				<option value="SC">Santa Catarina</option>
		 				<option value="RS">Rio Grande do Sul</option>
	 				</optgroup>
	 						
	 			</select> </p>
	 		<p><label for="cCid">Cidade:</label> <input type="text" name="tCid" id="cCid" placeholder="Cidade" maxlength="40" size="20" list="lCid" /></p>
	 		<<datalist id="lCid">
	 			<option value="Recife"></option>
	 			<option value="Olinda"></option>
	 			<option value="">Camaragibe</option>
	 		</datalist>
	 	</fieldset>

	 	<fieldset id="mensagem">
	 		<legend>Mensagem do Usuário</legend>	 	
	 		<p><label for="cUrg">Grau de Urgência:</label></p>
	 		<p>Mín<input type="range" name="tUrg" id="cUrg" min="0" max="10" step="5" />Máx</p>
	 		<p><label for="cMsg">Mensagem:</label></p>
	 		<textarea name="tMsg" id="cMsg" cols="45" rows="5" ></textarea>
	 	</fieldset>

	 	<fieldset id="pedido">
	 		<legend>Quero um Google Glass</legend>
	 		<p><input type="checkbox" name="tPed" id="cPed" checked><label for="cPed">Gostaria de Adiquirir um Google Glass quando disponível</label></p>
	 		<p><label for="cCor">Cor:</label>
	 			<input type="color" name="tCor" id="cCor" value="#0000ff"></p>
	 		<p><label for="cQt">Quantidade:</label>
	 			<input type="number" name="tQt" id="cQt" min="0" max="5" size="3" maxlength="3 "></p>
	 		<p><label for="cTot">Preço Total:</label>
	 			<input type="text" name="tTot" id="cTot" placeholder="Total a pagar" readonly></p>
	 	</fieldset>

	 	<input type="submit" value="Enviar">
	 </form>
</body>
</html>