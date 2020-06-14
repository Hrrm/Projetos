package animações.usando.transições.javafx;

import javafx.animation.FadeTransition;
import javafx.animation.FillTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

public class FabricaTransicao {
    public static enum Transicoes{FADE,TRANSLATE,SCALE,FILL,ROTATE}

    public static Transition fazerTransicao(Transicoes transicao, double duracaoSegundo, Node alvo) {
        Duration duracao = new Duration(duracaoSegundo * 1000);
        Transition t = null;
        
        switch(transicao) {
            case FADE:
                FadeTransition fadeTransition = new FadeTransition();
                fadeTransition.setFromValue(1);
                fadeTransition.setToValue(0);
                fadeTransition.setDuration(duracao);
                fadeTransition.setNode(alvo);
                
                t = fadeTransition;
                
                break;
            case FILL:
                FillTransition fillTransition = new FillTransition();
                fillTransition.setFromValue(Color.RED);
                fillTransition.setToValue(Color.DARKGREEN);
                fillTransition.setDuration(duracao);
                fillTransition.setShape((Shape)alvo);
                
                t = fillTransition;
                
                break;
            case ROTATE:
                RotateTransition rotateTransition = new RotateTransition();
                rotateTransition.setByAngle(360);
                rotateTransition.setDuration(duracao);
                rotateTransition.setNode(alvo);
                
                t = rotateTransition;
                
                break;
            case SCALE:
                ScaleTransition scaleTransition = new ScaleTransition();
                scaleTransition.setFromX(1);
                scaleTransition.setFromY(1);
                scaleTransition.setToX(4);
                scaleTransition.setToY(4);
                scaleTransition.setDuration(duracao);
                scaleTransition.setNode(alvo);
                
                t = scaleTransition;
                
                break;
            case TRANSLATE:
                TranslateTransition translateTransition = new TranslateTransition();
                translateTransition.setToX(600);
                translateTransition.setToY(250);
                translateTransition.setDuration(duracao);
                translateTransition.setNode(alvo);
                t = translateTransition;
                
                break;
        }
        t.setAutoReverse(true);
        t.setCycleCount(2);
        return t;
    }
}