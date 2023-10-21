
package com.mycompany.examenoctu;

public class circulo extends FiguraGeometrica {
    private  double radio;
    private static final double pi=3.14159265359;

    public circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return pi * radio;
    }

    

    

    


    
    
    
}
