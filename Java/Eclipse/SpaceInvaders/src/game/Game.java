package game;

import java.util.List;
import java.util.stream.Collectors;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Game extends Application{
	
	private Pane root = new Pane();
	
	private double t = 0; 
	
	private Sprite player = new Sprite(600/2 - 40/2, 650, 40, 40, "player", Color.BLUE);

	private Parent createContent() {
		root.setPrefSize(600, 700);
		
		root.getChildren().add(player);
		
		AnimationTimer timer = new AnimationTimer() {
			
			@Override
			public void handle(long now) {
				// TODO Auto-generated method stub
				update();
			}
		};
		
		timer.start();
		
		nextLevel();
		
		 return root;
	}
	
	private void nextLevel() {
		for(int i = 0; i < 5; i++) {
			Sprite s = new Sprite (90 + i*100, 150, 30, 30, "enemy", Color.RED);
			
			root.getChildren().add(s);
		}
	}
	
	private List<Sprite> sprites(){
		return root.getChildren().stream().map(n -> (Sprite)n).collect(Collectors.toList());
	}
	
	private void update() {
		t += 0.016;
		sprites().forEach(s -> {
			switch(s.type) {
			case "enemybullet":
				s.moveDown();
				
				if(s.getBoundsInParent().intersects((player.getBoundsInParent()))){
					player.dead = true;
					s.dead = true;
				}
				break;
			case "playerbullet":
				s.moveUp();
				
				sprites().stream().filter(e -> e.type.equals("enemy")).forEach(enemy ->{
					if(s.getBoundsInParent().intersects(enemy.getBoundsInParent())) {
						enemy.dead = true;
						s.dead = true;
					}
				});
				
				break;
			case "enemy":
				if(t > 2) {
					if(Math.random() < 0.3) {
						shoot(s);
					}
				}
				
				break;
			}
		});
		
		root.getChildren().removeIf(n ->{
			Sprite s = (Sprite) n;
			return s.dead;
		});
		
		if(t > 2) {
			t = 0;
		}
	}
	
	private void shoot(Sprite who) {
		Sprite s = new Sprite((int)who.getTranslateX() + 20, (int)who.getTranslateY(), 5, 20, who.type + "bullet", Color.BLACK);
		
		root.getChildren().add(s);
	}
	
	@Override	
	public void start(Stage stage) throws Exception{
		Scene scene = new Scene(createContent());
		
		scene.setOnKeyPressed(e ->{
			switch(e.getCode()) {
				case A:
					player.moveLeft();
					break;
				case D:
					player.moveRight();
					break;
				case SPACE:
					shoot(player);
					break;
			}	
		});
		
		stage.setScene(scene);
		
		stage.show();
	}
	
	public class Sprite extends Rectangle{
		boolean dead = false;
		final String type;
		
		Sprite(int posX, int posY, int width, int height, String type, Color color) {
			//super
			super(width, height, color);
			
			this.type = type;
			 setTranslateX(posX);
			 setTranslateY(posY);	
		}
		
		void moveLeft() {
			setTranslateX(getTranslateX() - 5);
		}
		
		void moveRight() {
			setTranslateX(getTranslateX() + 5);
		}
		
		void moveUp() {
			setTranslateY(getTranslateY() - 5);
		}
		
		void moveDown() {
			setTranslateY(getTranslateY() + 5);
		} 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}