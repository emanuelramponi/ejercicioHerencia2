package com.emr.producto;

public class Producto {
    private String nombre;
    private double precio;


    public Producto(){}

    public Producto(String nombre){
        this();
        this.nombre = nombre;
    }

    public Producto(String nombre, double precio){
        this(nombre);
        this.precio = precio;
    }

    public String getNombre(){ return this.nombre;}
    public double getPrecio(){ return this.precio;}

    public void setNombre(String nombre) { this.nombre = nombre;}
    public void setPrecio(double precio) { this.precio = precio;}

    public String getProducto(){
        return getNombre() +  " " + getPrecio();
    }
}
