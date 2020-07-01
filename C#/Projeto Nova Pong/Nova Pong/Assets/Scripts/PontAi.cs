using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class PontAi : MonoBehaviour {

	//CONTROLE DE PONTUAÇÃO DO COMPUTADOR
	public int pontAi;

	//VERIFICA A PONTUAÇÃO DO PLAYER PARA QUE POSSA SER FEITO A DIFERENÇA
	//E A MUDANÇA DE COR DA PONTUAÇÃO
	public Text pontPlayer;
	//VAR USADA PARA RECEBER DIFERENÇA ENTRE PONTUAÇÃO
	int diferenca;

	// Use this for initialization
	void Start () {
		//PONT INICIAL IGUAL A 0
		pontAi = 0;
	}
	
	// Update is called once per frame
	void Update () {
		//RECEBE CONSTANTEMENTE ATUALIZAÇÃO DA PONTUAÇÃO DO COMP CONTRA O PLAYER
		diferenca = pontAi - pontPlayer.gameObject.GetComponent<PontPlayer>().pontPlayer;

		//COMPONENTE TEXTO RECEBE INT PONTAI TRANSFORMADA EM TEXTO
		gameObject.GetComponent<Text> ().text = pontAi.ToString ();

		//SE DIFERENÇA IGUAL A ZERO
		if (diferenca.Equals (0)) {
			//TEXTO AMARELO
			gameObject.GetComponent<Text> ().color = new Color (204, 204, 0);
		//SENÃO, SE DIFERENÇA MENOR QUE 0
		} else if (diferenca < 0) {
			//VERMELHO
			gameObject.GetComponent<Text> ().color = new Color (255, 0, 0);
		//SENÃO, SE DIFERENÇA MAIOR QUE ZERO
		} else if (diferenca > 0) {
			//VERDE
			gameObject.GetComponent<Text> ().color = new Color (0, 102, 0);
		}
	}
}
