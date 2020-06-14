package gerenciadores.de.layout.básico.i.javafx;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.Circle;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author kuxoha
 */
public class Principal extends Application {
    public static void main(String []args){
        launch();
    }

    
    @Override
    public void start(Stage estagio){
        Scene cena;
        
        /*VBox  caixaVertical = new VBox();
        caixaVertical.setSpacing(5);
        caixaVertical.setAlignment(Pos.CENTER);
        
        caixaVertical.setTranslateX(10);
        caixaVertical.setTranslateY(20);
        
        Rectangle retanguloAzul = new Rectangle(40,20);
        Rectangle retanguloVerde = new Rectangle(40,20);
        Rectangle retanguloVermelho = new Rectangle(40,20);
        
        retanguloAzul.setFill(Color.BLUE);
        retanguloVerde.setFill(Color.GREEN);
        retanguloVermelho.setFill(Color.RED);
        
        caixaVertical.getChildren().addAll(retanguloAzul,retanguloVerde,retanguloVermelho);
        */
        
        StackPane painelEmpilhador = new StackPane();
        Rectangle retangulo = new Rectangle(220,120);
        retangulo.setFill(Color.GREEN);
        
        Polygon losango = new Polygon();
        losango.getPoints().addAll(new Double[]{
            50.0,50.0,
            150.0,0.0,
            250.0,50.0,
            150.0,100.0,
            50.0,50.0
        });
        losango.setFill(Color.YELLOW);
        
        Path arco = new Path();
              
        MoveTo moveTo = new MoveTo();
        moveTo.setX(0.0);
        moveTo.setY(0.0);
        
        ArcTo arcTo = new ArcTo();
        arcTo.setX(55.0);
        arcTo.setY(0.0);
        arcTo.setRadiusX(50.0);
        arcTo.setRadiusY(50.0);
        
        arco.getElements().add(moveTo);
        arco.getElements().add(arcTo);
        arco.setStroke(Color.WHITE);
        
        arco.setRotate(180);
        arco.setStrokeWidth(5);
        
        Circle circulo = new Circle(30, Color.BLUE);
        
        painelEmpilhador.getChildren().addAll(retangulo, losango, circulo, arco);

        
        cena = new Scene(painelEmpilhador);

        
        estagio.setTitle("Gerenciadores de Layout Básico I");
        estagio.setScene(cena);
        estagio.show();
    }
}
