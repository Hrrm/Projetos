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