package videocanvas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class VideoJavaFX extends Application {
    
    private String VIDEO_URL = getClass().getResource("videoplayback (4).mp4").toString();
    
    public static void main(String []args){
        launch();
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //1.Carrega a mídia via Url
        //2.Instancia um player para a mídia  e lança a mídia
        //3.Cria uma view para a mídia ser exibida e carrega o player
        
        Media media = new Media(VIDEO_URL);
        MediaPlayer mediaPlayer= new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        
        //1.Cria um paineil, adiciona os nos instanciados na classe no painel
        //2.Adiciona o painel na cena
        //3.Adiciona a cena no Estágio
        //4.Mostra o Stage
        StackPane raiz = new StackPane();
        raiz.getChildren().add(mediaView);
        Scene cena = new Scene(raiz, 600,400);
        primaryStage.setTitle("Rodando vídeo em JavaFX");
        primaryStage.setScene(cena);
        primaryStage.show();
        
        //Roda midia
        mediaPlayer.play();
        
    }
    
}
