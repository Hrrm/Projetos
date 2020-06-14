package calculadora;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class Principal extends Application{
    
    private float btnTam = 0.14f;
    private float btnDist = 0.2f;
    private double bordaEsquerda;
    private double referencia;
    private static Stage cenario;
    
    Metodos m = new Metodos();
    
    AnchorPane tela = new AnchorPane();
    Scene cena;
    
    //Variáveis para Cálculo
    private String a;   
    private String b;   
    private char s;
    
    //Mostra os cálculos
    private Label lblCalculadora = new Label();
       
    //botões
    Button botaoC = new Button();
    Button botao1 = new Button();
    Button botao2 = new Button();
    Button botao3 = new Button();
    Button botao4 = new Button();
    Button botao5 = new Button();
    Button botao6 = new Button();
    Button botao7 = new Button();
    Button botao8 = new Button();
    Button botao9 = new Button();
    Button botao0 = new Button();
    Button botaoVirgula = new Button();
    Button botaoSoma = new Button();
    Button botaoMenos = new Button();
    Button botaoMult = new Button();
    Button botaoDiv = new Button();
    Button botaoCalcular = new Button();
    
    public void initComponents(){
            
        tela.setPrefSize(300, 400);
        tela.setStyle("-fx-background-color: linear-gradient(from 100% 100% to 0% 0%, green 0%, blue 100%);");
        
        bordaEsquerda = tela.getPrefWidth()*btnTam;
                
        //texto resultado+formula
        
        lblCalculadora.setLayoutX(bordaEsquerda);
        lblCalculadora.setLayoutY(tela.getPrefWidth()*0.1f);
        lblCalculadora.setPrefSize(tela.getPrefWidth()*0.74f,bordaEsquerda);
        lblCalculadora.setStyle("-fx-font-size: 18 pd;");
        lblCalculadora.setStyle("-fx-background-color: white;");
        
        botao1.setText("1");
        botao1.setLayoutX(bordaEsquerda);
        botao1.setLayoutY(tela.getPrefHeight()*1.2f*btnDist);
        botao1.setPrefSize(bordaEsquerda,bordaEsquerda);
        
        referencia = botao1.getLayoutX()+tela.getPrefWidth()*btnDist;
        
        
        botao2.setText("2");
        botao2.setLayoutX(referencia);
        botao2.setLayoutY(botao1.getLayoutY());
        botao2.setPrefSize(bordaEsquerda,bordaEsquerda);

        
        botao3.setText("3");
        botao3.setLayoutX(botao1.getLayoutX()+tela.getPrefWidth()*2*btnDist);
        botao3.setLayoutY(botao1.getLayoutY());
        botao3.setPrefSize(bordaEsquerda,bordaEsquerda);
        
        
        botao4.setText("4");
        botao4.setLayoutX(botao1.getLayoutX());
        botao4.setLayoutY(botao1.getLayoutY()+tela.getPrefWidth()*btnDist);
        botao4.setPrefSize(bordaEsquerda,bordaEsquerda);
        
        
        botao5.setText("5");
        botao5.setLayoutX(botao1.getLayoutX()+tela.getPrefWidth()*btnDist);
        botao5.setLayoutY(botao1.getLayoutY()+tela.getPrefWidth()*btnDist);
        botao5.setPrefSize(bordaEsquerda,bordaEsquerda);
                
        
        botao6.setText("6");
        botao6.setLayoutX(botao1.getLayoutX()+tela.getPrefWidth()*2*btnDist);
        botao6.setLayoutY(botao1.getLayoutY()+tela.getPrefWidth()*btnDist);
        botao6.setPrefSize(bordaEsquerda,bordaEsquerda);
        
        
        botao7.setText("7");
        botao7.setLayoutX(botao1.getLayoutX());
        botao7.setLayoutY(botao1.getLayoutY()+tela.getPrefWidth()*2*btnDist);
        botao7.setPrefSize(bordaEsquerda,bordaEsquerda);
        
        
        botao8.setText("8");
        botao8.setLayoutX(botao1.getLayoutX()+tela.getPrefWidth()*btnDist);
        botao8.setLayoutY(botao1.getLayoutY()+tela.getPrefWidth()*2*btnDist);
        botao8.setPrefSize(bordaEsquerda,bordaEsquerda);
        
        
        botao9.setText("9");
        botao9.setLayoutX(botao1.getLayoutX()+tela.getPrefWidth()*2*btnDist);
        botao9.setLayoutY(botao1.getLayoutY()+tela.getPrefWidth()*2*btnDist);
        botao9.setPrefSize(bordaEsquerda,bordaEsquerda);
        
        
        botao0.setText("0");
        botao0.setLayoutX(botao1.getLayoutX()+tela.getPrefWidth()*btnDist);
        botao0.setLayoutY(botao1.getLayoutY()+tela.getPrefWidth()*3*btnDist);
        botao0.setPrefSize(bordaEsquerda,bordaEsquerda);
        
        
        botaoVirgula.setText(",");
        botaoVirgula.setLayoutX(botao1.getLayoutX()+tela.getPrefWidth()*2*btnDist);
        botaoVirgula.setLayoutY(botao1.getLayoutY()+tela.getPrefWidth()*3*btnDist);
        botaoVirgula.setPrefSize(bordaEsquerda,bordaEsquerda);
        
        
        botaoSoma.setText("+");
        botaoSoma.setLayoutX(botao1.getLayoutX()+tela.getPrefWidth()*3*btnDist);
        botaoSoma.setLayoutY(botao1.getLayoutY());
        botaoSoma.setPrefSize(bordaEsquerda,bordaEsquerda);
        
        
        botaoMenos.setText("-");
        botaoMenos.setLayoutX(botao1.getLayoutX()+tela.getPrefWidth()*3*btnDist);
        botaoMenos.setLayoutY(botao1.getLayoutY()+tela.getPrefWidth()*btnDist);
        botaoMenos.setPrefSize(bordaEsquerda,bordaEsquerda);
        
        
        botaoMult.setText("*");
        botaoMult.setLayoutX(botao1.getLayoutX()+tela.getPrefWidth()*3*btnDist);
        botaoMult.setLayoutY(botao1.getLayoutY()+tela.getPrefWidth()*2*btnDist);
        botaoMult.setPrefSize(bordaEsquerda,bordaEsquerda);
        
        
        botaoDiv.setText("/");
        botaoDiv.setLayoutX(botao1.getLayoutX()+tela.getPrefWidth()*3*btnDist);
        botaoDiv.setLayoutY(botao1.getLayoutY()+tela.getPrefWidth()*3*btnDist);
        botaoDiv.setPrefSize(bordaEsquerda,bordaEsquerda);
        
        
        botaoCalcular.setText("Calcular");
        botaoCalcular.setStyle("-fx-font-size: 18 pd");
        botaoCalcular.setLayoutX(botao1.getLayoutX());
        botaoCalcular.setLayoutY(botao1.getLayoutY()+tela.getPrefWidth()*4*btnDist);
        botaoCalcular.setPrefWidth(tela.getPrefWidth()*0.74f);
        
        botaoC.setText("C");
        botaoC.setLayoutX(bordaEsquerda);
        botaoC.setLayoutY(botao1.getLayoutY()+tela.getPrefWidth()*3*btnDist);
        botaoC.setPrefSize(bordaEsquerda,bordaEsquerda);
        
        tela.getChildren().addAll(lblCalculadora,botao1,botao2,botao3,botao4,
                botao5,botao6,botao7,botao8,botao9, botao0,botaoVirgula,botaoSoma,botaoMenos,botaoMult,botaoDiv,botaoCalcular,botaoC);
        }
    
    private void initListener(){
        botao1.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               m.adicionarValor(Integer.parseInt(botao1.getText()));
               lblCalculadora.setText(m.mostrarValor());
           } 
        });
        botao2.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               m.adicionarValor(Integer.parseInt(botao2.getText()));
               lblCalculadora.setText(m.mostrarValor());
           } 
        });
        botao3.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               m.adicionarValor(Integer.parseInt(botao3.getText()));
               lblCalculadora.setText(m.mostrarValor());
           } 
        });
        botao4.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               m.adicionarValor(Integer.parseInt(botao4.getText()));
               lblCalculadora.setText(m.mostrarValor());
           } 
        });
        botao5.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               m.adicionarValor(Integer.parseInt(botao5.getText()));
               lblCalculadora.setText(m.mostrarValor());
           } 
        });
        botao6.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               m.adicionarValor(Integer.parseInt(botao6.getText()));
               lblCalculadora.setText(m.mostrarValor());
           } 
        });
        botao7.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               m.adicionarValor(Integer.parseInt(botao7.getText()));
               lblCalculadora.setText(m.mostrarValor());
           } 
        });
        botao8.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               m.adicionarValor(Integer.parseInt(botao8.getText()));
               lblCalculadora.setText(m.mostrarValor());
           } 
        });
        botao9.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               m.adicionarValor(Integer.parseInt(botao9.getText()));
               lblCalculadora.setText(m.mostrarValor());
           } 
        });
        botao0.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               m.adicionarValor(Integer.parseInt(botao0.getText()));
               lblCalculadora.setText(m.mostrarValor());
           } 
           
        });
        botaoSoma.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               m.adicionarValor('+');
               lblCalculadora.setText(m.mostrarValor());
           }
        });
        botaoMenos.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               m.adicionarValor('-');
               lblCalculadora.setText(m.mostrarValor());
           }
        });
        botaoMult.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               m.adicionarValor('*');
               lblCalculadora.setText(m.mostrarValor());
           }
        }); 
        botaoDiv.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               m.adicionarValor('/');
               lblCalculadora.setText(m.mostrarValor());
           }
        });
        botaoCalcular.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               lblCalculadora.setText(m.mostrarResultado());               
           }
        });
        botaoC.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               lblCalculadora.setText(m.zerarValores());               
           }
        });
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        initComponents();
        initListener();
        
        cena = new Scene(tela);
        
        primaryStage.setScene(cena);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Calculadora");
        primaryStage.show();

        Principal.cenario= primaryStage;
    }
    public static Stage getCenario(){
        return cenario;
    }
    public static void main(String[] args){
        launch(args);
        
                
    }
    
}
