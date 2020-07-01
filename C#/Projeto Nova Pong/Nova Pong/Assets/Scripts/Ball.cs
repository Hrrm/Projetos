using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class Ball : MonoBehaviour {
	/*CONTROLE DO OBJETO BOLA E SUA VELOCIDADE*/ 
	GameObject bola;
	Rigidbody2D rbBola;
	Vector2 posInicialBola;


	public GameObject player;


	public GameObject ai;


	//CONTROLE DE PONTUAÇÃO
	//DO PLAYER
	public Text pontPlayer;
	//DO COMPUTADOR
	public Text pontAi;

	/*INFORMAÇÕES DA CAMERA PRINCIPAL PARA CALCULAR QUANDO A BOLA IRÁ MUDAR DE POSIÇÃO
	OU MARCAR PONTOS*/
	float larguraCam;
	float alturaCam;

	//VARIÁVEIS QUE CONTROLAM A VELOCIDADE X E Y DA BOLA
	public float x;
	public float y;
    

	// Use this for initialization
	void Start () {
		//RECEBE O OBJ BOLA DA CENA
		bola = GameObject.Find ("bola");
		//RECEBE O COMPONENTE RIGIDBODY DE BOLA
		rbBola = bola.GetComponent<Rigidbody2D> ();
		//RECEBE A POS INICIAL DA BOLA PARA QUE ELA
		//SEJA REPOSICIONADA DEPOIS DO PONTO
		posInicialBola = transform.position;

		//VELOCIDADE PADRÃO INICIAL DA BOLA
		x = 1;
		y = 1;
	}
	
	// Update is called once per frame
	void Update () {
		
	}

	void OnCollisionEnter2D(Collision2D Col){

		//SE COLLISÃO COM JOGADOR
		if (Col.gameObject.name.Equals ("jogador")) {
			//SE VELOCIDADE NO EIXO Y É POSITIVA
			if (rbBola.velocity.y > 0) {
				//RETORNA A BOLA PARA O AI COM A MESMA VELOCIDADE DE Y
				rbBola.velocity = new Vector2 (x, y);
			//SENÃO, SE VELOCIDADE Y NEGATIVA
			}else if (rbBola.velocity.y < 0) {
				//RETORNA OBJ BOLA COM A MESMA VELO NEGATIVA NO EIXO Y
				rbBola.velocity = new Vector2 (x, -y);
			}
			//CADA VEZ QUE SE CHOCAR CONTRA O JOGADOR A VELOCIDADE IRÁ AUMENTAR
			//PARA DIFICULTAR A PARTIDA
			x += 0.1f;
			y += 0.1f;
		//SENÃO, SE COLISÃO COM TOPO
		}else if (Col.gameObject.name.Equals ("topo")) {
			//SE X POSITIVO
			if (rbBola.velocity.x > 0) {
				//NEGATIVA O VALOR DE Y PARA QUE A BOLA CONTINUE NO CAMPO
				rbBola.velocity = new Vector2 (x, -y);
			//SENÃO, SE X NEGATIVO
			}else if (rbBola.velocity.x < 0) {
				//NEGATIVA O VALOR DE -Y PARA QUE A BOLA CONTINUE NO CAMPO
				rbBola.velocity = new Vector2 (-x, -y);
			}
		//SENÃO, SE COLISÃO COM BAIXO
		}else if (Col.gameObject.name.Equals ("baixo")){
			//REALIZA O MESMO PROCESSO EM Y PARA QUE SE MANTENHA NA ÁREA DE GAME
			if (rbBola.velocity.x > 0) {
				rbBola.velocity = new Vector2 (x, y);
			}else if (rbBola.velocity.x < 0) {
				rbBola.velocity = new Vector2 (-x, y);
			}
		//SENÃO, SE COLISÃO COM LATERAL ESQUERDA DO CAMPO
		}else if (Col.gameObject.name.Equals ("esquerda")) {
			//RESETA A POSIÇÃO DA BOLA PARA COMEÇAR A PARTIDA DE NOVO
			rbBola.position = posInicialBola;
			//RESETA A POSIÇÃO DO PLAYER
			player.transform.position = player.gameObject.GetComponent<Mover>().posInicialPlayer;
			//RESETA A POSIÇÃO DA INTELIGÊNCIA ARTIFICIAL
			ai.transform.position = ai.gameObject.GetComponent<MoverAi> ().posInicialAi;
			//ZERA A VELOCIDADE DA BOLA PARA QUE ELA AGUARDE O COMANDO PARA COMEÇAR A SE
			//MOVER DE NOVO
			rbBola.velocity = new Vector2 (0, 0);
			//REDEFINE OS VALORES DE X E Y PARA FICAR FÁCIL E IR DIFICULTANDO
			x = 1;
			y = 1;
			//ADICIONA 1 PONTO PARA O AI, POIS O JOGADOR FALHOU
			pontAi.gameObject.GetComponent<PontAi> ().pontAi += 1;
		}
		//SENAO, SE COLISÃO LATERAL COM DIREITA DO CAMPO
		if (Col.gameObject.name.Equals ("direita")) {
			//RESETA A POSIÇÃO DA BOLA PARA COMEÇAR A PARTIDA DE NOVO
			rbBola.position = posInicialBola;
			//RESETA A POSIÇÃO DA INTELIGÊNCIA ARTIFICIAL
			player.transform.position = player.gameObject.GetComponent<Mover>().posInicialPlayer;
			//RESETA A POSIÇÃO DA INTELIGÊNCIA ARTIFICIAL
			ai.transform.position = ai.gameObject.GetComponent<MoverAi> ().posInicialAi;
			//ZERA A VELOCIDADE DA BOLA PARA QUE ELA AGUARDE O COMANDO PARA COMEÇAR A SE
			//MOVER DE NOVO
			rbBola.velocity = new Vector2 (0, 0);
			//REDEFINE OS VALORES DE X E Y PARA FICAR FÁCIL E IR DIFICULTANDO
			x = 1;
			y = 1;
			//ADICIONA 1 PONTO PARA O JOGADOR, POIS O AI FALHOU
			pontPlayer.gameObject.GetComponent<PontPlayer> ().pontPlayer += 1;
		//SENÃO, SE COLISÃO COM AI
		}else if (Col.gameObject.name.Equals ("ai")) {
			//EFETUA COMANDOS PARA MANTER A BOLA NA ÁREA DE JOGO
			if (rbBola.velocity.y > 0) {
				rbBola.velocity = new Vector2 (-x, y);
			}else if (rbBola.velocity.y < 0) {
				rbBola.velocity = new Vector2 (-x, -y);
			}
			//CADA VEZ QUE SE CHOCAR CONTRA O AI A VELOCIDADE IRÁ AUMENTAR
			//PARA DIFICULTAR A PARTIDA
			x += 0.1f;
			y += 0.1f;
		}
	}

}
