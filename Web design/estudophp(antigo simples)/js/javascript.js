

//ENTRA NA PÁGINA DE NOVO COM UMA VÁRIAVEL GET
//ESSA VARIÁVEL É PÊGA PELO CÓDIGO PHP, APAGA O SESSION O POST E RECARREGA A PÁGINA
//QUE É REDIRECIONADA PARA A TELA DE LOGIN
function deslogar(){
	window.location.replace("cadastranoticia.php?logado=1");
}