package prodhijos;

public class Limpieza {
    private String componentes;
    private double litros;

    public Limpieza(){ super();}

    public Limpieza(String componentes){
        this();
        this.componentes = componentes;
    }

    public Limpieza(String componentes, double litros){
        this(componentes);
        this.litros = litros;
    }


    public void setComponentes(String componentes){ this.componentes = componentes;}
    public void setLitros(double litros){ this.litros = litros;}

    public String getComponentes(){return this.componentes;}
    public double getLitros(){return this.litros;}

    @Override
    public String toString(){ 
        return "Componentes: " + getComponentes() +
                "\nLitros: " + getLitros();
    }
}


