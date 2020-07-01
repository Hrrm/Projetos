﻿using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

/*BIBLIOTECA QUE PERMITE IMPORTAR AS CLASSES IPOINTERDOWNHALDER E IPOINTERUPHANDLER
 * PARA USAR OS METODOS ONPOINTERDOWN E ONPOINTERUP*/
using UnityEngine.EventSystems;


/*HERDA AS CLASSES NECESSÁRIAS PARA USAR OS MÉTODOS ONPOINTERDOWN E 
 * ONPOINTERUP*/
public class BotaoDown : MonoBehaviour, IPointerDownHandler, IPointerUpHandler {

	//VARIÁVEL QUE IDENTIFICA SE O BOTÃO ESTÁ OU NÃO PRESSIONADO
	public bool pressionado;

	//GAMEOBJ BOLA
	public GameObject bola;

	public Canvas canvas;
	// Use this for initialization
	void Start () {
		
	}

	//MÉTODO HERDADO DA CLASSE IPOINTERDOWNHALDER QUE RECONHECE SE O BOTÃO ESTÁ SENDO PRESSIONADO
	public void OnPointerDown(PointerEventData evento){
		pressionado = true;
		//SE BOLA TEM VELOCIDADE ZERO
		if (bola.GetComponent<Rigidbody2D>().velocity.Equals( Vector2.zero)) {
			//DETERMINA A VELOCIDADE DELA BASEADO NAS VARIÁVEIS X E Y DO OBJ
			bola.GetComponent<Rigidbody2D> ().velocity = new Vector2 (bola.gameObject.GetComponent<Ball>().x, -bola.gameObject.GetComponent<Ball>().y);
		}
	}

	//MÉTODO HERDADO DA CLASSE IPOINTERUPHALDER QUE RECONHECE SE O BOTÃO NÃO ESTÁ PRESSIONADO
	public void OnPointerUp(PointerEventData evento){
		pressionado = false;
	}

	// Update is called once per frame
	void Update () {
		
	}
}