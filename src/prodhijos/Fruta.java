package prodhijos;
import com.emr.producto.Producto;

public class Fruta extends Producto {
    private double peso;
    private String color;
    
    public Fruta(){
        super();
    }

    public Fruta(double peso){
        this();
        this.peso = peso;
    }

    public Fruta(double peso, String color){
        this(peso);
        this.color = color;
    }

    public double getPeso(){ return this.peso;}
    public String getColor() { return this.color;}

    public void setPeso(double peso){this.peso = peso;}
    public void setColor(String color) {this.color = color;}




    public String getFruta(){ 
        return "Peso: " + getPeso() + "\nColor: " + getColor(); 
    }
  

    


}
