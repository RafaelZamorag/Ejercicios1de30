import java.util.Scanner;

public class Ejercicio4 {
    /*Programa que obtenga el área de un círculo, a partir de datos proporcionados por
el usuario. */
public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    int Radio;
    System.out.println("Ingrese el Radio Del circulo:");
    Radio = lector.nextInt();
    double Area = Math.PI * Math.pow(Radio,Radio);
    System.out.println("El Area del circulo es:" + Area);

    
}
}
