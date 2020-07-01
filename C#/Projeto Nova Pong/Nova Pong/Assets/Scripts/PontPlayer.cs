using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class PontPlayer: MonoBehaviour {

	//CONTROLE DE PONT DO PLAYER
	public int pontPlayer;

	//VERIFICA A PONTUAÇÃO DO COMPUTADOR PARA FAZER CONTROLE DE COR
	//DA PONTUAÇÃO DO PLAYER
	public Text pontAi;

	//FAZ A DIFERENÇA DE PONTUAÇÃO ENTRE O PLAYER E A VAR PONTAI PARA SABER
	//SE O PLAYER TEM MAIS OU MENOS PONTOS QUE O COMPUTADOR
	int diferenca;

	// Use this for initialization
	void Start () {
		//PONTUAÇÃO INICIAL DO JOGADOR IGUAL A 0
		pontPlayer = 0;
	}
	
	// Update is called once per frame
	void Update () {
		//ATUALIZA CONSTANTEMENTE A DIFERENÇA DE PONTOS DO PLAYER MENOS COMPUTADOR
		//PARA ALTERAR A COR DO TEXTO DE PONTUAÇÃO
		diferenca = pontPlayer - pontAi.gameObject.GetComponent<PontAi>().pontAi;

		//COMPONENTE TEXTO RECEBE VAR INT PONTPLAYER TRANSFORMADA EM TEXTO
		gameObject.GetComponent<Text> ().text = pontPlayer.ToString ();

		//SE DIFERENÇA IGUAL A ZERO
		if (diferenca.Equals (0)) {
			//TEXTO AMARELO
			gameObject.GetComponent<Text> ().color = new Color (204, 204, 0);
		//SENAO, SE DIFERENÇA MENOR QUE 0
		} else if (diferenca < 0) {
			//TEXTO VERMELHO
			gameObject.GetComponent<Text> ().color = new Color (255, 0, 0);
		//SENÃO, SE DIFERENÇA MAIOR QUE ZERO
		} else if (diferenca > 0) {
			//TEXTO VERDE
			gameObject.GetComponent<Text> ().color = new Color (0, 102, 0);
		}
	}
}
