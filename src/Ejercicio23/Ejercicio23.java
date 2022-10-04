
package Ejercicio23;

public class Ejercicio23 {

    public static void main(String[] args) {
        // TODO code application logic here
        VentanaPrincipal6 miventana6 = new VentanaPrincipal6();
        miventana6.setVisible(true);
    }
    
    public static String programa(double A, double B, double C){
        double sll[];
        double pat = (Math.pow(B, 2) - (4*A*C));
        if (pat >= 0){
        
            if(pat == 0){
                double s = ((-B) - (4 * A * C )) / (2 * A);
                return "La solución es: " + s;
            
            } else {
                double s1 = ((-B) + Math.sqrt(Math.pow(B, 2) - (4*A*C))) / (2*A);
                double s2 = ((-B) - Math.sqrt(Math.pow(B, 2) - (4*A*C))) / (2*A);
            
                return "Las soluciones son: " + s1 + " y " + s2;          
            }
        
        } else {
            return "No hay solución";
            
        }
    }
}

    