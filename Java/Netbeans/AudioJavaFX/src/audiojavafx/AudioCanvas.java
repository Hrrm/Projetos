package audiojavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AudioCanvas extends Application{
    private final String AUDIO_URL1 = getClass().getResource("cdz_pegasus_fantasy.mp3").toString();
    private final String AUDIO_URL2 = getClass().getResource("cdz_pelo_mundo.mp3").toString();
    
    Label texto = new Label("Tocando Áudio em JavaFX.");
    
    Button btn1 = new Button("Musica 1");
    Button btn2 = new Button("Música 2");
    
    AudioClip clip1 = new AudioClip(AUDIO_URL1);
    AudioClip clip2 = new AudioClip(AUDIO_URL2);
    
    AnchorPane raiz = new AnchorPane();
    Scene cena;
    
    //Método deve ser chamado no método start();
    public void initComponents(){
        
        raiz.setPrefSize(600, 100);

        texto.setPrefSize(150, 20);
        texto.setLayoutX(raiz.getPrefWidth()/2-texto.getPrefWidth()/2);
        texto.setLayoutY(raiz.getPrefHeight()/3- texto.getPrefHeight()/2);
        
        btn1.setPrefSize(80, 20);
        btn1.setLayoutX(raiz.getPrefWidth()/2-btn1.getPrefWidth()-5);
        btn1.setLayoutY(raiz.getPrefHeight()/3+btn1.getPrefHeight()/2+texto.getPrefHeight()/2);
        
        btn2.setPrefSize(80, 20);
        btn2.setLayoutX(raiz.getPrefWidth()/2+5);
        btn2.setLayoutY(raiz.getPrefHeight()/3+btn2.getPrefHeight()/2+texto.getPrefHeight()/2);
        
        
        raiz.getChildren().addAll(texto, btn1, btn2);
        cena = new Scene(raiz);
        
    }
    
    private void initListener(){
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clip2.stop();
                clip1.play();
            }
        
        });
                btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clip1.stop();
                clip2.play();
            }
        
        });
    }
    
    public static void main(String []args){
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        initComponents();
        initListener();

        primaryStage.setTitle("Tocando Áudio em JavaFX");
        primaryStage.setScene(cena);
        primaryStage.show();
    }
    
}
