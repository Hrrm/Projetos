package game.util;


//Classe usada para determinar posi��o e velocidade baseado nos vetores x e y
public class Vector {
	public double x, y;
	
	public Vector(double x, double y) {
		this.set(x, y);
	}
	
	public void set(double x, double y) {
		this.x = x;
		this.y = y;
	}

}
