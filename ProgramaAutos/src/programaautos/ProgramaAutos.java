package programaautos;

import java.util.Scanner;

public class ProgramaAutos {

    public static void main(String[] args) {
        // TODO code application logic here
        Autos auto1=new Autos();
        auto1.Marca="Fiat";
        auto1.Modelo="Fiat1";
        auto1.Matricula="ASD123";
        auto1.Color="Rojo";
        auto1.Año=2010;
        auto1.Costo=20000;
        auto1.Impuesto=(12-(2016-auto1.Año))*100;
        int numeroautos;
        System.out.println("El impuesto es :"+auto1.Impuesto);
        
        String marca, modelo, matricula, color;
        int año;
        double costo, impuesto;
        int i;
        Scanner entrada=new Scanner(System.in);
        
        Autos[] autom=new Autos[20];
        numeroautos=1;
        for (i=0;i<numeroautos;i++)
        {
            Autos autox=new Autos();
            System.out.print("Ingrese Marca:");
            marca=entrada.next();
            System.out.print("Ingrese Modelo:");
            modelo=entrada.next();
            System.out.print("Ingrese Matrícula:");
            matricula=entrada.next();
            System.out.print("Ingrese Color:");
            color=entrada.next();
            System.out.print("Ingrese Año:");
            año=entrada.nextInt();
            System.out.print("Ingrese Costo:");
            costo=entrada.nextDouble();
            impuesto=(12-(2016-año))*100;
            autox.Marca=marca;
            autox.Modelo=modelo;
            autox.Matricula=matricula;
            autox.Color=color;
            autox.Año=año;
            autox.Costo=costo;
            autox.Impuesto=impuesto;
            autom[i]=autox;
        }
        System.out.println("El impuesto es :"+autom[0].Impuesto);
        System.out.println("El impuesto es :"+autom[1].Impuesto);
                
    }
    
}
