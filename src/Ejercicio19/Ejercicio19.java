
package Ejercicio19;

public class Ejercicio19 {

    public static void main(String[] args) {
        // TODO code application logic here
        VentanaPrincipal2 miventana2 = new VentanaPrincipal2();
        miventana2.setVisible(true);
    }
    
    static double perimetro, altura, area;
    
    public static String programa(double lado){
        perimetro = lado * 3;
        altura = (lado/2) * Math.sqrt(3);
        area = Math.sqrt(3) * Math.pow(lado,2)/4;
        
        return "El perímetro es: " + perimetro + "\nLa altura es: " + altura + "\nEl área es: " + area;
                
    }
}
