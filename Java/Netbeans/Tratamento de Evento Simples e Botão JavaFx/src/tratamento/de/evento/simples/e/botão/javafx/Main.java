package tratamento.de.evento.simples.e.botão.javafx;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler {
    @Override
    public void start(Stage estagio) throws Exception{
        VBox raiz = new VBox(20);
        raiz.setAlignment(Pos.CENTER);
        raiz.setTranslateY(5);
        
        Button btn1 = new Button("Clique me! (tratador de evento externo)");
        Button btn2 = new Button("Clique me! (Classe anônima tratando evento)");
        Button btn3 = new Button("Clique me! (Própria Classe)");
        
        //Esse trecho vai usar a classe TratadorEvento crada anteriormente para tratar os eventos
        btn1.setOnAction(new TratadorEvento());
        
        //Criando uma instância de uma classe anônima para tratar evento
        btn2.setOnAction(new EventHandler(){
            @Override
            public void handle(Event event){
                System.out.println("Evento tratado opr uma classe anônima");
            }
        });
        
        //O botão 3 usa a própria classe ("Principal") para tratar seus eventos
        btn3.setOnAction(this);
        
        raiz.getChildren().addAll(btn1, btn2, btn3);
        
        Scene cena = new Scene(raiz, 300, 200);
        estagio.setTitle("Tratando eventos");
        estagio.setScene(cena);
        estagio.show();
    }
    
    @Override
    public void handle(Event evento){
        System.out.println("Evento tratado na própria classe");
    }
    
    public static void main(String []args){
        launch();
    }
}
