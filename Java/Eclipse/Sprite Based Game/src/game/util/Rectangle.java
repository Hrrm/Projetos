package game.util;


//Classe usada para determinar se dois sprite objects se colidem no game
//Overlaps
public class Rectangle {
	public double x, y, width, height;
	
	public Rectangle(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;	
	}
	
	
	//Método utiliza o Separating Axis Theorem para verificar se não há colisao, depois nega o valor
	//para retornar se houve colisão ou não.
	//Se não houve colisão então verdadeiro, logo o método overlaps negado diz que não houve colisão,
	//logo retorna falso
	public boolean overlaps(Rectangle other) {
		
		//4 casos a considerar
		//this rect left of other rect
		//this rect right of other rect
		//this rect above of other rect
		//this rect below other rect
		
		boolean noOverlap =
				this.x + this.width < other.x ||
				other.x + other.width < this.x ||
				this.y + this.height < other.y ||
				other.y + other.height < this.x;
		
		return !noOverlap;
	}
}
