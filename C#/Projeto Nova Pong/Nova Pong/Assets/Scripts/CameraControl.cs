using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CameraControl : MonoBehaviour {

	/*RECEBE A MAIN CAMERA DO GAME*/
	Camera mainCamera;

	//RECEBE A ALTURA DA VISÃO DA CAMERA
	float height;

	//RECEBE A LARGURA DA VISÃO DA CAMERA
	float width;

	//RECEBE A POSIÇÃO ATUAL DA CAMERA PRINCIPAL
	Vector3 cameraPos;

	// Use this for initialization
	void Start () {
		//RECEBE A CAMERA PRINCIPAL
		mainCamera = Camera.main;

		/*FÓRMULA ENCONTRADA NA NET PARA DEFINIR A ALUTRA DA CAMERA
		DE ACORDO COM O TAMANHO DA TELA*/
		height = 2f * mainCamera.orthographicSize;

		/*FÓRMULA ENCONTRADA NA NET PARA DEFINIR A LARGURA DA CAMERA
		DE ACORDO COM O TAMANHO DA TELA*/
		width = Screen.height * mainCamera.aspect;
	}

	/*RETORNA O VALOR DA VARIÁVEL PRIVATE LARGURA DA CAMERA*/
	public float getWidth(){
		return width;
	}

	/*RETORNA O VALOR DA VARIÁVEL PRIVATE ALTURA DA CAMERA*/
	public float getHeight(){
		return height;
	}


	/*RETPORNA O VALOR DA VARIÁVEL PRIVATE POSIÇÃO ATUAL DA CAMERA
	 * PARA OUTRAS CLASSES E OBJETOS*/
	public Vector3 getMainCamPosition(){
		return cameraPos;
	}

	// Update is called once per frame
	void Update () {
		//VAR CONTENDO POSIÇÃO DA CAMERA QUE PODE SER USADA SE NECESSÁRIO
		cameraPos = mainCamera.transform.position;
	}
}
