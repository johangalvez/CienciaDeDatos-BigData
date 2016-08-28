package primercarro;
public class carro {
    public carro(){
    //Constructor
    System.out.println("Se construye el Objeto");
    
    }
    //metodos
    public void encender(){
        System.out.println("\nEstoy encendiendo");
    }
    public void frenar(){
        System.out.println("\nEstoy frenando");
        
    }
    public void parar(){
        System.out.println("\nNo tengo gasolina");
    }
    public void girar(int grados){
        System.out.println("\nGirando "+grados+" grados");
    }
    
}
