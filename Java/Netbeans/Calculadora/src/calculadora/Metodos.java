package calculadora;

public class Metodos {
    
    String a = "", b = "";
    char s;
    int resultado;
    boolean controle;
    
    public String zerarValores(){
        a = "";
        b = "";
        s = ' ';
        resultado = 0;
        controle = false;
        return a;
    }
    
    public String mostrarResultado(){
        if(s == '+')
            resultado = Integer.parseInt(a)+Integer.parseInt(b);
        else if(s == '-')
            resultado = Integer.parseInt(a)-Integer.parseInt(b);
        else if(s == '*')
            resultado = Integer.parseInt(a)*Integer.parseInt(b);
        else if(s == '/')
            resultado = Integer.parseInt(a)/Integer.parseInt(b);
        a = String.valueOf(resultado);
        return String.valueOf(resultado);
    }
    public String mostrarValor(){
        if(!controle)
            return a;
        else
            return b;
    }
    
    public void adicionarValor(int a){
    
        if(controle == false){
            this.a += a;
        }else{
            this.b += a;
        }        
    }
    public void adicionarValor(char s){
        if(!controle)
            controle = true;
        this.b = "";
        this.s = s;
    }
}
