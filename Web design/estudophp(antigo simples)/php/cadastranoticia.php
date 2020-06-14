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