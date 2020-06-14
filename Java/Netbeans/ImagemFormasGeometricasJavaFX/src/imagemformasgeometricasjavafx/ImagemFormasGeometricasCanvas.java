package imagemformasgeometricasjavafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ImagemFormasGeometricasCanvas extends Application {
    
    private final String IMG_URL = getClass().getResource("Cavaleiros-do-zodiaco-nova-musica.jpg").toString();
    
    public static void main (String []args){
        launch();
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Image imagem = new Image(IMG_URL);
        imagem.isBackgroundLoading();
        ImageView visualizadorImagem = new ImageView(imagem);
        visualizadorImagem.setTranslateX(80);
        visualizadorImagem.setTranslateY(30);
        visualizadorImagem.isResizable();
        
               
        Text textoInformativo = new Text("Algumas Figuras Geométricas com"
                + "JavaFX");
        textoInformativo.setTranslateX(30);
        textoInformativo.setTranslateY(70);
        textoInformativo.setFill(Color.RED);
        
        Rectangle retangulo = new Rectangle(100, 40);
        retangulo.setTranslateX(5);
        retangulo.setTranslateY(90);
        retangulo.setFill(Color.GREEN);
        
        Circle circulo = new Circle(30);
        circulo.setTranslateX(160);
        circulo.setTranslateY(110);
        circulo.setFill(Color.YELLOW);
        
        Circle circuloBranco = new Circle(30);
        circuloBranco.setTranslateX(240);
        circuloBranco.setTranslateY(110);
        circuloBranco.setStroke(Color.BLACK);        
        circuloBranco.setStrokeWidth(3.0);        
        circuloBranco.setFill(Color.WHITE);

        Ellipse elipse = new Ellipse(30, 10);
        elipse.setTranslateX(320);
        elipse.setTranslateY(110);
        elipse.setFill(Color.BLUE);
        
        Group componentes = new Group();
        componentes.getChildren().addAll(visualizadorImagem, textoInformativo, retangulo, circulo, circuloBranco, elipse);
        Scene cena = new Scene(componentes, 360, 150);
        visualizadorImagem.resize(cena.getWidth(),cena.getHeight());
        
        primaryStage.setTitle("Gráficos e Imagens em JavaFX");
        primaryStage.setScene(cena);
        primaryStage.show();
    }
}
