package gerenciadores.de.layout.básico.ii.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Principal extends Application {
    BorderPane borderPane = new BorderPane();
    Label lblTop, lblEsquerda, lblBaixo, lblDireita, lblCentro;
    
    public static void main(String []args){
        launch();
    }    
    
    @Override
    public void start(Stage estagio)throws Exception{
        borderPane.setTop(lblTop = new Label("Topo"));
        borderPane.setLeft(lblEsquerda = new Label("Esquerda"));
        borderPane.setBottom(lblBaixo = new Label("Baixo"));
        borderPane.setRight(lblDireita = new Label("Direita"));
        borderPane.setRight(lblCentro = new Label("Centro"));
        
        
        //metodo estático para posicionar o componente
        BorderPane.setAlignment(lblTop,Pos.CENTER);
        
        GridPane gridPane = new GridPane();
        
        gridPane.add(new Label("0 x 0"),0,0);
        gridPane.add(new Label("0 x 1"),0,1);
        gridPane.add(new Label("1 x 0"),1,0);
        gridPane.add(new Label("1 x 1"),1,1);
        
        gridPane.setVgap(20);
        gridPane.setHgap(20);
        
        gridPane.setTranslateX(120);
        gridPane.setTranslateY(30);
        
        FlowPane flowPane = new FlowPane();
        
        flowPane.setAlignment(Pos.CENTER_RIGHT);
        for(int i = 0; i<10; i++)
            flowPane.getChildren().add(new Label("Label "+i));
        
        Scene cena1= new Scene(gridPane);
        
        estagio.setTitle("Gerenciador de Layout II");
        estagio.setScene(cena1);
        estagio.show();        
    }
}
