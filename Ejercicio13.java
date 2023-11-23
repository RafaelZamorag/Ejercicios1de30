import java.util.Scanner;

public class Ejercicio13 {
   /*Introducir tres números por teclado mostrar los últimos dígitos de cada número.*/
   public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese 3 numeros: ");
    int numero1=leer.nextInt();
    int numero2=leer.nextInt();
    int numero3=leer.nextInt();
    int ultimoDigito1=numero1 % 10;
    int ultimoDigito2=numero2 % 10;
    int ultimoDigito3=numero3 % 10;
    System.out.println("El ultimo digito del primer numero es:" + ultimoDigito1);
    System.out.println("EL ultimo digito del segundo numero es:" + ultimoDigito2);
    System.out.println("El ultimo digito del tercer numero es:" + ultimoDigito3);
   } 
}
