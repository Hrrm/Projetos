//ARRAY QUE RECEBE TODAS AS IMAGENS DO SLIDER
var imagem = document.getElementsByClassName('imagem');
//DEFINE LARGURA DAS IMAGENS E DISTÂNCIA QUE IRÃO SE MOVER
var num;


// USADA PARA DEFINIR O SRC DAS IMAGENS DO SLIDER
var caminhoImagem;

//RECEBE O VALOR DE NUM PARA DAR A LARGURA
var larguraImagem;

//RETORNA O VALOR DA LARGURA DE SLIDER DO BOOTSTRAP
function retornaNum(){
	if(parseInt(document.getElementById("slider").clientWidth) != 0){
		return parseInt(document.getElementById("slider").clientWidth);
	}else{
		return 264;
	}
}

//UTILIZA A FUNÇÃO DE RETORNO DO TAMANHO DA DIV SLIDER PARA A VAR NUM
function defineNum(){
	num = retornaNum();
	larguraImagem = num+"px";
}

//CARREGA AS VARIÁVEIS
function carregarPagCertificado(){
	defineNum();
	for(var i = 0;i < imagem.length; i++){
		imagem[i].style.width = larguraImagem;
		document.getElementById("slider").style.height = (num*0.65)+"px";
		imagem[i].style.height = (num*0.65)+"px";
	}
}


//POSICIONA AS TAGS IMG
function posicionaImagensSlide(){
	for(var i = 0; i < imagem.length; i++){
		if(i == 0){
			imagem[i].style.left = "0px";
			imagem[i].style.top = "0px";
		}else{
			imagem[i].style.left = (num*i)+"px";
			imagem[i].style.top = "0px";			
		}
	}
}


//DEFINE AS IMAGENS DO SLIDER
function defineImagensSlide(){
	for(var i = 0; i < imagem.length; i++){
		caminhoImagem = i + ".png";
		imagem[i].src = caminhoImagem;
	}
}

//AJUSTA A LARGURA DO PROJETO A DIV
function iFrameWidth(){
	document.getElementById("game").style.width = document.getElementById("divIframe").clientWidth+"px";
	document.getElementById("game").style.height = document.getElementById("game").style.width/2;
}

