
package Parte2;

public class Rectangle {
    static int base;
    static int altura;
    
    Rectangle(int base, int altura){
        this.base = base;
        this.altura = altura;
        
    }
    
    public static String calcularArea(int base, int altura){
        return String.valueOf(base*altura);
    }
    
    public static String calcularPerimetro(int base, int altura) {
        return String.valueOf((2*base) + (2*altura));
    }
}
