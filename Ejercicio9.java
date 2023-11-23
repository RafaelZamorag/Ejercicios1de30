import java.util.Scanner;

public class Ejercicio9 {
   /*Programa que obtenga el IVA sobre una cantidad dada por el usuario.*/ 
   public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de dinero: ");
    double cantidad=leer.nextDouble();
    double IVA  = cantidad * 0.10;
    System.out.println("El iva es: " + cantidad);
   }
}
