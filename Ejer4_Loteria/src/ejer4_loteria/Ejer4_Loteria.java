/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4_loteria;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejer4_Loteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random randomGenerator = new Random();
        int[] misnumeros= new int[7];
        int[] numerosloteria= new int[7];
        int i, numero, repite, j;
        Scanner entrada=new Scanner(System.in);
        int aciertos=0;
        String respuesta;
        
        do
        {
        
            //Carga de misnumeros
            for (i=1; i<=6; i++)
            {
                do
                {
                    repite=0;
                    System.out.print(i+") Ingrese número [1..49]:");
                    numero=entrada.nextInt();

                    for (j=0; j<i; j++)
                    {
                        if (numero==misnumeros[j])
                        {
                            repite=1;
                            System.out.println("Número ya existe");
                        }
                    }

                } while(numero<1 || numero>49 || repite==1);
                misnumeros[i]=numero;
                System.out.println(misnumeros[1]+","+misnumeros[2]+","+misnumeros[3]+","+misnumeros[4]+","+misnumeros[5]+","+misnumeros[6]);
            }
            
            //Obtener numerosloteria
            for (i=1; i<=6; i++)
            {
                do
                {
                    repite=0;
                    numero=randomGenerator.nextInt(49);

                    for (j=0; j<i; j++)
                    {
                        if (numero==numerosloteria[j])
                        {
                            repite=1;
                            //System.out.println("Número random ya existe");
                        }
                    }

                } while(numero<1 || numero>49 || repite==1);
                numerosloteria[i]=numero;

            }
            //System.out.println(numerosloteria[1]+","+numerosloteria[2]+","+numerosloteria[3]+","+numerosloteria[4]+","+numerosloteria[5]+","+numerosloteria[6]);


            //ordenamiento de burbuja

            burbuja(misnumeros);
            burbuja(numerosloteria);
            System.out.println("Mis números:"+misnumeros[1]+","+misnumeros[2]+","+misnumeros[3]+","+misnumeros[4]+","+misnumeros[5]+","+misnumeros[6]);
            System.out.println("Lotería    :"+numerosloteria[1]+","+numerosloteria[2]+","+numerosloteria[3]+","+numerosloteria[4]+","+numerosloteria[5]+","+numerosloteria[6]);

            //Buscar aciertos
            
            for (i=1; i<7; i++)
            {
                if (EncontrarEnArreglo(misnumeros[i],numerosloteria))
                {
                    aciertos+=1;

                }
            }

            System.out.println("Tuviste "+aciertos+ " aciertos");
            aciertos=0;
            System.out.print("Quieres volver a jugar?[S/N]");
            respuesta=entrada.next();
            
        }while(respuesta.equals("S"));
                
    }
    
    public static void burbuja (int lista[]){
		int cuentaintercambios=0;
		//Usamos un bucle anidado, saldra cuando este ordenado el array
		for (boolean ordenado=false;!ordenado;){
			for (int i=0;i<lista.length-1;i++){
				if (lista[i]>lista[i+1]){
					//Intercambiamos valores
					int variableauxiliar=lista[i];
					lista[i]=lista[i+1];
					lista[i+1]=variableauxiliar;
					//indicamos que hay un cambio
					cuentaintercambios++;
				}
			}
			//Si no hay intercambios, es que esta ordenado.
			if (cuentaintercambios==0){
				ordenado=true;
			}
			//Inicializamos la variable de nuevo para que empiece a contar de nuevo
			cuentaintercambios=0;
		}
	}
    
    public static boolean EncontrarEnArreglo(int numero, int lista[])
    {
        int i;
        for(i=1; i<7; i++)
        {
            if (numero==lista[i])
            {
                return true;
            }
        }
        
        return false;
    }
    
    
}
