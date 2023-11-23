import java.util.Scanner;

public class Ejercicio27 {
    /*Que el usuario de su género y su nombre, dependiendo de su género imprimir en
pantalla Bienvenido “nombre”, Bienvenida “nombre”, y si en dado caso se pone otra */
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese su genero:");
    String genero=leer.nextLine();
    if (genero.equals("Masculino")) 
    {
        System.out.println("Bienvenido");
        
    } else if( genero.equals("Femenino")){
        System.out.println("Bienvenida");
        
    }else{
        System.out.println("No se como saludarte.");
    }
}
}
