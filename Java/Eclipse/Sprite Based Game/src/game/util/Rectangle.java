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
	
	
	//M�todo utiliza o Separating Axis Theorem para verificar se n�o h� colisao, depois nega o valor
	//para retornar se houve colis�o ou n�o.
	//Se n�o houve colis�o ent�o verdadeiro, logo o m�todo overlaps negado diz que n�o houve colis�o,
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
