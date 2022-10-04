
package Parte2;

public class Triangle {
    static int base;
    static int altura;
    
    public Triangle(double base, double altura){      
    }
    
    public static String calcularArea(double base, double altura){
        return String.valueOf(base*altura / 2);
        
    }
    
    public static String calcularPerimetro(double base, double altura){
        return String.valueOf(base + altura + calcularHipotenusa());
        
    }
    
    public static double calcularHipotenusa() {
        return Math.pow(base*base + altura * altura, 0.5);
    }
    
    public static String determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa())&&(altura == calcularHipotenusa()))
            return "equilátero";
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            return "escaleno";
        else
            return "isósceles";
    }
}
