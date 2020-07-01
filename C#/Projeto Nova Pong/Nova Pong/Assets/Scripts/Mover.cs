using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class Mover : MonoBehaviour {


	//CONTROLE DOS BOTÕES E COMPONENTES
	//CONTROLE DO GAMEOBJECT BOTÃO
	public Button btnUp;
	public Button btnDown;
	//CONTROLE DO COMPONENTE BOTÃO
	BotaoUp componenteUp;
	BotaoDown componenteDown;

	//CONTROLE DO GAMEOBJ PLAYER
	public GameObject player;
	//POSIÇÃO INICIAL DO PLAYER
	public Vector2 posInicialPlayer;
	//CONTROLE DE VELOCIDADE DO PLAYER
	Rigidbody2D rbPlayer;
	//VELOCIDADE DO PLAYER
	float velocidadePlayer;

	// Use this for initialization
	void Start () {
		//DEFINE A VELOCIDADE DO PLAYER
		velocidadePlayer = 1.5f;

		//RECEBE POSICAO INICIAL, ESSA POSIÇÃO NÃO DEVE SER ATUALIZADA
		posInicialPlayer = player.transform.position;
		//RECEBE O COMPONENTE BUTTON DO GAMEOBJECT DE CENA BUTTON
		componenteUp = btnUp.GetComponent<Button> ().GetComponent<BotaoUp> ();
		//RECEBE O COMPONENTE BUTTON DO GAMEOBJECT DE CENA BUTTON
		componenteDown = btnDown.GetComponent<Button> ().GetComponent<BotaoDown> ();
		//RECEBE O RIGIDBODY PARA FAZER CONTROLE DA VELOCIDADE DO PLAYER
		rbPlayer = player.gameObject.GetComponent<Rigidbody2D> ();
	}
	
	// Update is called once per frame
	void Update () {
		//VERIFICA SE A VARIÁVEL PRESSIONADO NO SCRIPT BOTAOUP ESTÁ PRESSIONADA
		if (componenteUp.pressionado.Equals (true)) {
			//MOVIMENTA O PLAYER PARA CIMA USANDO A CLASSE ESTÁTICA VECTOR2  E
			//A VARIÁVEL UP MULTIPLICADA PELA VELOCIDADEPLAYER
			rbPlayer.velocity = Vector2.up * velocidadePlayer;

		//VERIFICA SE A VARIÁVEL PRESSIONADO NO SCRIPT BOTAODOWN ESTÁ PRESSIONADA
		} else if (componenteDown.pressionado.Equals (true)) {
			//MOVIMENTA O PLAYER PARA BAIXO USANDO A CLASSE ESTÁTICA VECTOR2  E
			//A VARIÁVEL DOWN MULTIPLICADA PELA VELOCIDADEPLAYER
			rbPlayer.velocity = Vector2.down * velocidadePlayer;
		//SENÃO DEFINE A VELOCIDADE DO PLAYER COMO ZERO PARA QUE ELE NÃO SE MEXA SÓ
		//EVITANDO BUGS
		} else {
			//CLASSE ESTÁTICA VECTOR2 COM VARIÁVEL 0
			rbPlayer.velocity = Vector2.zero;
		}
	}
}
