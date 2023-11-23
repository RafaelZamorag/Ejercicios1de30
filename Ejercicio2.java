import java.util.Scanner;

public class Ejercicio2 {
    /*Programa que pida al usuario que ingrese un texto e imprima el mensaje “El texto
ingresado es :” junto al texto ingresado */
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese su nombre: ");
    String nom=leer.nextLine();
    System.out.println("El texto ingresado es: " + nom);

}
}
