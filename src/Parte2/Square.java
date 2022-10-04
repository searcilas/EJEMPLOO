
package Parte2;


public class Square {
    static int lado;
    
    Square(int lado) {
        this.lado = lado;
        
    }
    
    public static String calcularArea(int lado){
        return String.valueOf(lado*lado);
        
    }
    
    public static String calcularPerimetro(int lado) {
        return String.valueOf(4*lado);
    }
}
