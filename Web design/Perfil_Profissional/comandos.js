
function rolagemNext(){
	if(parseInt(imagem[imagem.length-1].style.left) > 0)
			for(var i = 0; i < imagem.length; i++){
				imagem[i].style.left=(parseInt(imagem[i].style.left)-num)+"px";
			}
}

function rolagemPreview(){
	if(parseInt(imagem[0].style.left) < 0)
			for(var i = 0; i < imagem.length; i++){
				imagem[i].style.left=(parseInt(imagem[i].style.left)+num)+"px";
			}
}

function gameFull(){
	var el = document.getElementById("game");
	toggleFullscreen(el);
}

function slideFull(){
	var slider = document.getElementById("slider");
	toggleFullscreen(slider);
}

function toggleFullscreen(el){
	if(document.fullscreenElement || 
		document.mozFullScreenElement ||
		document.webkitFullscreenElement ||
		document.msFullscreenElement)
	{
		if(document.exitFullscreen){
			document.exitFullscreen();
		}else if(document.mozCancelFullScreen){
			document.mozCancelFullScreen();
		}else if(document.webkitExitFullscreen){
			document.webkitExitFullscreen();
		}else if(document.msExitFullscreen){
			document.msExitFullscreen();
		}
	}else{
		if(document.documentElement.requestFullscreen){
			el.requestFullscreen();
		}else if(document.documentElement.mozRequestFullScreen){
			el.mozRequestFullScreen();
		}else if(document.documentElement.webkitRequestFullscreen){
			el.webkitRequestFullscreen();
		}else if(document.documentElement.msRequestFullscreen){
			el.msRequestFullscreen();
		}
	}
}
