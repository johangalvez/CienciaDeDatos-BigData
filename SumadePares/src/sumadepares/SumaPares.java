/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumadepares;

/**
 *
 * @author Alumno
 */
public class SumaPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma, numeroPar;
        suma=0;
        numeroPar=2;
        while (numeroPar<1000){
            suma+=numeroPar;
            numeroPar+=2;
        }
        System.out.println(suma);
        
    }
    
}
