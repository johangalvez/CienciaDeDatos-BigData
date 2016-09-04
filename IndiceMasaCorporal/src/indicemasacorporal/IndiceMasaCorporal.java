/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indicemasacorporal;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class IndiceMasaCorporal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i, numeropersonas;
        Scanner entrada=new Scanner(System.in);
        
        persona[] personam=new persona[20];
        numeropersonas=1;
        for (i=0;i<numeropersonas;i++)
        {
            persona personax=new persona();
            System.out.print("Ingrese Nombre:");
            personax.Nombre=entrada.next();
            System.out.print("Ingrese Sexo:");
            personax.Sexo=entrada.next();
            System.out.print("Ingrese Edad:");
            personax.Edad=entrada.nextInt();
            System.out.print("Ingrese Talla:");
            personax.Talla=entrada.nextDouble();
            System.out.print("Ingrese Peso:");
            personax.Peso=entrada.nextDouble();
            personax.IMC=personax.Peso / Math.pow(personax.Talla, 2);
            personam[i]=personax;
            System.out.println("El IMC de " + personax.Nombre + " es de :"+personax.IMC);
        }
        
    }
    
}
