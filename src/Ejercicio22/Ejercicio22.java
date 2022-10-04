
package Ejercicio22;

public class Ejercicio22 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaPrincipal5 miventana5 = new VentanaPrincipal5();
        miventana5.setVisible(true);
    }    

    static double salario;
    
    public static String programa(String nombre, int basico, double horastrabajadas){
        salario = basico * horastrabajadas;
        if (salario > 450000){
            return "Su nombre es: " + nombre + "\nSu salario es de: " + salario;
        } else {
            return nombre;
            
        }
                   
    }
}
