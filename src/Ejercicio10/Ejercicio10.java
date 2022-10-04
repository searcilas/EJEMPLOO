package Ejercicio10;

public class Ejercicio10 {

    public static void main(String[] args) {
        // TODO code application logic here
        VentanaPrincipal4 miventana4 = new VentanaPrincipal4();
        miventana4.setVisible(true);
    }
    
    static double PAGMAT;
    
    public static String programa(int NI, String NOM, double PAT, int EST){
        PAGMAT = 50000;
        
        if ((PAT > 2000000) && (EST > 3 )){
            PAGMAT = PAGMAT + 0.03 * PAT;
            //return "El estudiante con número de inscripción " + NI + " y nombre " + NOM + " debe pagar: $" + PAGMAT;
        }
        return "El estudiante con número de inscripción " + NI + " y nombre " + NOM + " debe pagar: $" + PAGMAT;
    }
    
}
