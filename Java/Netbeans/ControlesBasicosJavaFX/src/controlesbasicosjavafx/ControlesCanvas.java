package controlesbasicosjavafx;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControlesCanvas extends Application {

    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox raiz = new VBox(10);
        raiz.setAlignment(Pos.CENTER);
        
        Label rotulo = new Label("Sou um rótulo de texto!");
        rotulo.setTooltip(new Tooltip("Esse é um rótulo para mostrar textos de forma simples!"));
        
        TextField campoTexto = new TextField("Digite Algo!");
        campoTexto.setTooltip(new Tooltip("Campo de texto para entrada de uma só linha!"));
        
        TextArea areaTexto = new TextArea("Digite algo com várias linhas");
        areaTexto.setTooltip(new Tooltip("Campo de texto para entrada de múltiplas linhas!"));
        
        //Padrão é o separador ser horizontal, se quiser usar vertical necessita
        //mudar a orientação atraves de paramentro com a classe Orientation.
        Separator separadorHorizontal = new Separator();
        Separator separadorVertical = new Separator(Orientation.VERTICAL);
        
        Slider deslizante = new Slider();
        deslizante.setShowTickLabels(true);
        deslizante.setShowTickMarks(true);
        deslizante.setTooltip(new Tooltip("O controle deslizante tem um valor numérico de acordo com sua posição!"));
        
        raiz.getChildren().addAll(rotulo, campoTexto, areaTexto, separadorHorizontal, separadorVertical, deslizante);
        
        Scene cena = new Scene(raiz, 300, 400);
        
        primaryStage.setTitle("Controles Básicos I");
        primaryStage.setScene(cena);
        primaryStage.show();
    }
    
    public static void main(String []args){
        launch();
    }
    
}
