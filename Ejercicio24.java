import java.util.Scanner;

public class Ejercicio24 {
    /*Programa que de acuerdo a una cantidad de pulgadas ingresadas por teclado,
realice la conversión a centímetros. (1plg=2.54cm). */
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el numero de pulgadas:");
    int numeroDePulgadas=leer.nextInt();
    double centímetros=numeroDePulgadas*2.54;
    System.out.println("El numero de centimetros es:" + centímetros);

}
}
