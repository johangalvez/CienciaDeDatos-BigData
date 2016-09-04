/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 4;
        int i;
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Mostrar la tabla del :");
        x=entrada.nextInt();
            
        for (i=1; i<=12; i++)
        {
            System.out.println(x + " x " + i + " = "+ x*i);
        }
        
    }
    
    
    
}
