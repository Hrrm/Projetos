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