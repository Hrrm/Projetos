package canvas;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Principal extends Application {

	public static void main(String[]  args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Canvas canvas = new Canvas(800, 600);
		Pane pane = new Pane(canvas);
		
		Scene scene = new Scene(pane);
		
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		AnimationTimer timer = new AnimationTimer() {
			
			@Override
			public void handle(long arg0) {
				// TODO Auto-generated method stub
				
			}
		};
		
		timer.start();
		
		stage.setScene(scene);
		stage.show();
	}
	
}
