
package Ejercicio18;

public class Ejercicio18 {

    public static void main(String[] args) {
        // TODO code application logic here
        VentanaPrincipal miventana = new VentanaPrincipal();
        miventana.setVisible(true);
    }
    
    static double SalarioBruto, PorcentajeRetencion;
    
    public static String programa(String nombre, int codigo, double horas, double valorhora, double retencion){
        SalarioBruto = horas * valorhora;
        PorcentajeRetencion = SalarioBruto * (retencion/100);
        
        return "Su código es" + codigo + "\nSu nombre es: " + nombre + "\n Su salario bruto es: " + SalarioBruto + "\nSu porcentaje de retención es: " + PorcentajeRetencion;
            
    }
    
}
