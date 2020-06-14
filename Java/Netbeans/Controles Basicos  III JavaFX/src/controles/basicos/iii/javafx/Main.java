package controles.basicos.iii.javafx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    
    public String [] cores;
    public static void main(String []args){
        launch();
    }
    
    @Override
    public void start(Stage palco) throws Exception{
        cores = new String[]{"Blue", "Black", "Red", "White", "Green", "Yelloow", "Grey", "Pink", "Salmon"};
        
        StackPane raiz = new StackPane();
        
        HBox opcoes = new HBox(10);
        opcoes.setAlignment(Pos.CENTER);
        
        final Rectangle retangulo = new Rectangle(300, 100);
        
        ComboBox cbCorCena = new ComboBox<>();
        ComboBox cbCorRetangulo = new ComboBox<>();
        
        cbCorCena.getItems().addAll(cores);
        cbCorRetangulo.getItems().addAll(cores);
    
        opcoes.getChildren().addAll(cbCorCena,cbCorRetangulo);
        
        raiz.getChildren().addAll(retangulo,opcoes);
        
        final Scene cena = new Scene(raiz, 450, 250);
        
        palco.setTitle("Uso de ComboBox");
        palco.setScene(cena);
        palco.show();
                        
        cbCorCena.getSelectionModel().selectedItemProperty().addListener(new ChangeListener(){
            @Override
            public void changed(ObservableValue observable, Object valorAntigo, Object valorNovo) {
                cena.setFill(Color.valueOf(valorNovo.toString()));
            }
        });
        cbCorRetangulo.getSelectionModel().selectedItemProperty().addListener(new ChangeListener(){
            @Override
            public void changed(ObservableValue valorObservado, Object valorAntigo, Object valorNovo) {
                retangulo.setFill(Color.valueOf(valorNovo.toString()));
            }            
        });        
        cbCorRetangulo.getSelectionModel().select(1);
        cbCorCena.getSelectionModel().select(1);
        

    }
}
