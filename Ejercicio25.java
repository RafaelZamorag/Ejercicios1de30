import java.util.Scanner;

public class Ejercicio25 {
    /*Programa que de acuerdo a una cantidad de grados centígrados ingresadas por
teclado, realice la conversión a grados fahrenheit. (Multiplica por 9, divide entre 5,
después suma 32). */
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresa la temperatura en grados celsius:");
    double tmpCelsius=leer.nextDouble();
    double tmpfahrenheit=(tmpCelsius*9)/5+32;
    System.out.println("La temperatura en grados fahrenheit:" + tmpfahrenheit);


    
}
}
