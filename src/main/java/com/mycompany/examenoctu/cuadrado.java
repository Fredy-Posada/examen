
package com.mycompany.examenoctu;


public  class cuadrado extends FiguraGeometrica{
    private final  double lado;

    public cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
       return lado * lado;
               
    }
    

    
    
  
    
}
