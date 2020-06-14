package game;

import game.sprite.Sprite;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SpriteGame extends Application {
	public static void main(String[] args) {
		try {
			launch(args);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.exit(0);
		}
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		BorderPane root = new BorderPane();
		
		Scene cena = new Scene(root);
		
		//Custom code - Begin
		
		Canvas canvas = new Canvas(600, 600);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		root.setCenter(canvas);
		
		
		
		Sprite turtle = new Sprite();
		turtle.position.set(100, 100);
		turtle.setImage("/images/nurse_joy.png");
			
		AnimationTimer gameLoop = new AnimationTimer() {
			@Override
			public void handle(long nanotime) {

				gc.setFill(Color.BLUE);
				gc.fillRect(0, 0, 600, 600);
				
				turtle.render(gc);
			}
		};
		
		gameLoop.start();
		
		//Custom code - End
		
		stage.setTitle("Sprite Based Game");
		stage.setScene(cena);
		stage.show();
	}
	
}
