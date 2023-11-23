import java.util.Scanner;

public class Ejercicio5 {
   /*Programa que pida los datos necesarios y muestre en pantalla el área de un rombo */
   public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese la diagonal mayor: ");
    double diagonalMayor=leer.nextDouble();
    System.out.println("Ingrese la diagonal menor: ");
    double diagonalMenor=leer.nextDouble();
    double area=(diagonalMayor*diagonalMenor)/2;
    System.out.println("El area del rombo es: " + area);


    

   } 
}
