
package Ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {
        // TODO code application logic here
        VentanaPrincipal3 miventana3 = new VentanaPrincipal3();
        miventana3.setVisible(true);
    }
    
    public static String programa(double NumeroA, double NumeroB){
        
        if (NumeroA > NumeroB){
            return NumeroA + " es mayor que " + NumeroB;      
        }
        else if (NumeroA == NumeroB){
            return NumeroA + " es igual que " + NumeroB;
        }
        else{
            return NumeroA + " es menor que " + NumeroB;
        }
    }
}

