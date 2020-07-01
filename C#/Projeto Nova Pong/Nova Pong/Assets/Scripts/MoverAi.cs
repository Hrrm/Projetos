using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class MoverAi : MonoBehaviour {

	//GAMEOBJ DE CENA BOLA
	public GameObject bola;
	//POSIÇÃO SEMPRE ATUALIZADA DA BOLA
	Vector2 posBola;

	//GAMEOBJ DE CENA INTELIGÊNCIA ARTIFICIAL
	public GameObject Ai;
	//POSIÇÃO SEMPRE ATUALIZADA DA INTELIGÊNCIA ARTIFICIAL
	Vector2 posAi;
	//POSIÇÃO INICIAL DA AI DEFINIDA SOMENTE NO START
	public Vector2 posInicialAi;
	//RECEBE O RIGIDBODY PARA CONTROLE DE VELOCIDADE
	Rigidbody2D rbAi;
	//VELOCIDADE DA INTELIGÊNCIA ARTIFICIAL
	float velocidadeAi;

	//VARIÁVEL QUE VERIFICA QUAL A DISTÂNCIA  NO EIXO Y DA BOLA COM O COMPUTADOR
	//PARA QUE O COMPUTADOR POSSA ACOMPANHAR A BOLA
	float distancia;
	//DISTÂNCIA MÍNIMA NO EIXO Y PARA QUE O COMPUTADOR SE MOVA ATRAS DA BOLA
	//EVITA BUGS COMO O COMPUTADOR SE MOVENDO SEM PARAR LOUCAMENTE
	//ALÉM DE, SE ALTERADA PARA UM VALOR MUITO ALTO O COMPUTADOR SE TORNA MAIS FÁCIL 
	//DE GANHAR
	float distMinSeguir;

	// Use this for initialization
	void Start () {
		//POSIÇÃO INICIAL DO COMPUTADOR
		posInicialAi = Ai.transform.position;
		//VELOCIDADE DO COMPUTADOR
		velocidadeAi = 1.3f;
		//DISTÂNCIA MÍNIMA PARA QUE O COMPUTADOR COMECE A CORRER ATRAS
		//DA BOLA
		distMinSeguir = 0.02f;

	}
	
	// Update is called once per frame
	void Update () {
		//RECEBE A POSIÇÃO SEMPRE ATUALIZADA DA BOLA
		posBola = bola.GetComponent<Rigidbody2D> ().position;

		//RECEBE SEMPRE A POSIÇÃO ATUALIZADA DO COMPUTADOR
		posAi = Ai.GetComponent<Rigidbody2D> ().position;
		//RECEBE O COMPONENTE RIGIDBODY PARA CONTROLE DE VELOCIDADE
		rbAi = Ai.GetComponent<Rigidbody2D> ();

		//CÁLCULA A DISTÂNCIA Y ENTRE BOLA E AI
		distancia = posBola.y - posAi.y;

		//SE VELOCIDADE DA BOLA NO EIXO X MAIOR QUE 0
		//FAZ COM QUE O COMPUTADOR SÓ SE MOVA SE A BOLA ESTIVER INDO EM SUA DIREÇÃO,
		//OU SEJA, ELE IRÁ FICAR PARADO APÓS LANÇAR A BOLA CONTRA O JOGADOR
		if (GameObject.Find ("bola").GetComponent<Rigidbody2D> ().velocity.x > 0) {
			//SE A DISTÂNCIA ENTRE BOLA E COMPUTADOR NO EIXO Y ESTIVER ENTRE -0.2F E +0.2F
			if (distancia > -distMinSeguir && distancia < distMinSeguir) {
				//COMPUTADOR FICARÁ PARADO
				//CLASSE ESTÁTICA VECTOR2 COM VARIÁVEL ESTÁTICA ZERO
				rbAi.velocity = Vector2.zero;
			}
			//SE DISTÂNCIA FOR MAIOR QUE DISTÂNCIA MÍNIMA 0.2F
			if (distancia > distMinSeguir) {
				//COMPUTADOR SE MOVIMENTARÁ PARA CIMA MULTIPLICADO PELA VELOCIDADE
				rbAi.velocity = Vector2.up * velocidadeAi;
			}
			//SE DISTÂNCIA MENOR QUE -0.2F
			if (distancia < -distMinSeguir) {
				//COMPUTADOR  SE MOVIMENTARÁ PARA BAIXO MULTIPLICADO PELA VELOCIDADE
				rbAi.velocity = Vector2.down * velocidadeAi;
			}
		//SENÃO, SE X FOR MENOR QUE 0
		} else {
			//COMPUTADOR FICARÁ ESTÁTICO
			rbAi.velocity = Vector2.zero;
		}
	}
}
