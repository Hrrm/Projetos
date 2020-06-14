<?php
	//STARTA A SESSION EM TODAS AS PÁGINAS.
	session_start();


	//SE A FUNÇÃO DESLOGAR() DO JAVASCRIPT É ACIONADA,
	//ADICIONA UMA VARIÁVEL LOGADO AO GET, SE EXISTIR UM LOGADO,
	//DESTROI A SESSION E LIMPA O POST LOGIN E SENHA
	if($_GET){
		if($_GET['logado'])
			session_destroy();
			unset($_POST['login']);
			unset($_POST['senha']);
			header('location:login.php');
	}

	function inserirConteudo(){
		$enderecohost = "localhost";
		$usuario = "root";
		$senha = "";
		$bancoDeDados = "legendarygame";
		$mysqli = mysqli_connect($enderecohost, $usuario, $senha, $bancoDeDados);
		$comandoSQL = "INSERT INTO USUARIO(
							NIVEL_USR, 
							LOGIN_USR,
							NOME_USR,
							SENHA_USR,
							EMAIL_USR
						) VALUES(
							".(int)$_POST['nNivelUsuario'].",
							'".$_POST['nTxtLogin']."',
							'".$_POST['nTxtNome']."',
							'".$_POST['nTxtSenha']."',
							'".$_POST['nTxtEmail']."'
						)";
		if(!mysqli_query($mysqli, $comandoSQL)){

			echo "<center>(".$mysqli->errno.") Ocorreu um erro.</center>";
		}
		else{
			echo "<center>Cadastro realizado com sucesso.</center>";
		}
		
	}

	function checaLogin(){
		$enderecohost = "localhost";
		$usuario = "root";
		$senha = "";
		$bancoDeDados = "legendarygame";
		$mysqli = mysqli_connect($enderecohost, $usuario, $senha, $bancoDeDados);
		$comandoSQL = "SELECT LOGIN_USR, SENHA_USR 
						FROM usuario 
						WHERE LOGIN_USR = '".$_POST['nTxtLogin']."' and SENHA_USR = '".$_POST['nSenha']."'";


		$resultado = mysqli_query($mysqli, $comandoSQL);

		if(!$resultado){

			echo $resultado->connect_error;
		}
		else{
			if(mysqli_num_rows($resultado) > 0) {
			    $_SESSION['login'] = $_POST['nTxtLogin'];
			    $_SESSION['senha'] = $_POST['nSenha'];
			    $_SESSION['logado'] = 1;
			    header('location:cadastranoticia.php');
			} else {
				session_destroy();
			    echo '<center>Login ou senha incorreto.</center>';
			}
		}
	}
	
?>