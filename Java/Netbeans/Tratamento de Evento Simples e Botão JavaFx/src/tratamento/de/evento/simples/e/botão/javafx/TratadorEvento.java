package tratamento.de.evento.simples.e.botão.javafx;

import javafx.event.Event;
import javafx.event.EventHandler;

public class TratadorEvento implements EventHandler {
    @Override
    public void handle(Event evento){
        System.out.println("Evento tratado por uma classe externa.");
    }
}
