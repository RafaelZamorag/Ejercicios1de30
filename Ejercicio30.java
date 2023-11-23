import java.util.Scanner;

public class Ejercicio30 {
    /* Que permita leer el valor correspondiente a una distancia en kilómetros y las
visualice expresadas en metros.*/
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese la distancia en kilometros:");
    float kilometros=leer.nextFloat();
    float metros=kilometros*1000;
    System.out.println("La distancia en metros es de:" + metros);

}
    
}
