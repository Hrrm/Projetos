package controles.basicos.ii.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControlesBasicosIICanvas extends Application {

    @Override
    public void start(Stage tela) throws Exception{
        VBox raiz = new VBox(10);
        raiz.setTranslateX(10);
        raiz.setTranslateY(20);
        
        Label lblTitulo = new Label("Pesquisa sobre programação");
        lblTitulo.setUnderline(true);
        
        final TextField txtNome = new TextField();
        HBox hbNome = new HBox(10);
        hbNome.getChildren().addAll(new Label("nome"), txtNome);
        
        HBox hbSo = new HBox(20);
        ToggleButton tbLinux = new ToggleButton("Linux");
        tbLinux.setSelected(true);
        ToggleButton tbWindows = new ToggleButton("Windows");
        ToggleButton tbMac = new ToggleButton("Mac");
        final ToggleGroup tgSo = new ToggleGroup();
        
        tgSo.getToggles().addAll(tbLinux, tbMac, tbWindows);
        hbSo.getChildren().addAll(new Label("Sistema Operacional Utilizado"), tbLinux, tbMac, tbWindows);
        
        final ToggleGroup tgLinguagem = new ToggleGroup();
        HBox hbLinguagens = new HBox(20);
        RadioButton rbJava = new RadioButton("Java");
        rbJava.setSelected(true);
        RadioButton rbC = new RadioButton("C");
        RadioButton rbPython = new RadioButton("Python");
        tgLinguagem.getToggles().addAll(rbJava, rbC, rbPython);
        hbLinguagens.getChildren().addAll(new Label("Linguagem de programação preferida"), rbJava, rbC, rbPython);
        
        final CheckBox chkFrequencia = new CheckBox("Programa todo dia?");
        final CheckBox chkGosto = new CheckBox("Gosta de Programação?");
        chkGosto.setAllowIndeterminate(true);
        chkGosto.setIndeterminate(true);
        
        Button btnSubmeter = new Button("Submeter pesquisa");
        btnSubmeter.setOnAction(new EventHandler(){
            @Override
            public void handle(Event evt) {
                System.out.println("Resultado da pesquisa para " + txtNome.getText());
                //podemos não ter um sistema operacional(SO) selecionado
                ToggleButton tbSo = (ToggleButton)tgSo.getSelectedToggle();
                System.out.print("Sistema Operacional Preferido:");
                System.out.println(tbSo == null ?"Não selecionado" : tbSo.getText());
                
                //Deve ter uma linguagem selecionada
                RadioButton rbLinguagem = (RadioButton)tgLinguagem.getSelectedToggle();
                System.out.println("Linguagem de programação: " + rbLinguagem.getText());
                System.out.println((chkFrequencia.isSelected() == true ? "p" : "Não p") + "rograma todo dia.");
                
                System.out.print("Gosta de programação: ");
                if(chkGosto.isSelected()){
                    System.out.println("Sim.");
                }else if(chkGosto.isIndeterminate()){
                    System.out.println("Não respondido.");
                }else{
                    System.out.println("Não.");
                }
                System.out.println("\n\n");
                
            }
        });
        
        raiz.getChildren().addAll(lblTitulo, hbNome, hbSo, hbLinguagens, chkFrequencia,chkGosto, btnSubmeter);
        
        Scene cena = new Scene(raiz, 450, 250);
        tela.setTitle("Tratando eventos");
        tela.setScene(cena);
        tela.show();
    }
    
    public static void main(String []args){
        launch();
    }
}
