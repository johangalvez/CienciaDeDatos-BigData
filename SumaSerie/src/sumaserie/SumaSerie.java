/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaserie;

/**
 *
 * @author Administrador
 */
public class SumaSerie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x, i, tot, sumando;
        x=2;
        tot=0;
        sumando=2;
        while (x<1800)
        {
            tot=tot+x;
            if (sumando==2)
            {
                sumando=3;
              
            }
            else
            {
                sumando=2;
            }
            System.out.print(x+",");
            x=x+sumando;
        }
        System.out.println("\nEl total es "+tot);
        
    }
    
}
