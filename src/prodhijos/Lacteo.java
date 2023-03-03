package prodhijos;

public class Lacteo {
    private int cantidad;
    private int proteinas;

    public Lacteo(int cantidad){
        super();
        this.cantidad = cantidad;
    }
    
    public Lacteo(int cantidad, int proteinas){
        this(cantidad);
        this.proteinas = proteinas;
    }

    public void setCantidad(int cantidad){this.cantidad = cantidad;}
    public void setProteinas(int proteinas){this.proteinas = proteinas;}

    public int getCantidad(){return this.cantidad;}
    public int getProteinas(){return this.proteinas;}
    
    public String getFruta(){
        return "Cantidad: " + getCantidad() + "\nProteinas: " + getProteinas() + "gramos";
    }

    
}
