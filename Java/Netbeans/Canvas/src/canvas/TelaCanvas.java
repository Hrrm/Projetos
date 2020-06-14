package canvas;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;




public class TelaCanvas extends Application {
    public static void main(String[]args){
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane raiz = new StackPane();
        Label lblMensagem = new Label();
        lblMensagem.setText("Estou aprendendo Java FX");
        raiz.getChildren().add(lblMensagem);
        
        Scene cena = new Scene(raiz, 250, 100);
        
        primaryStage.setTitle("Aprendendo JavaFX");
        primaryStage.setScene(cena);
        primaryStage.show();
    }
}
