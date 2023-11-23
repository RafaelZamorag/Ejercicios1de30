import java.util.Scanner;

public class Ejercicio15{
    /*Algoritmo que determine si una persona es mayor o menor de edad*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        int edad=leer.nextInt();
        if (edad>=18) {
            System.out.println("Es mayor");
            
        } else {
            System.out.println("Es menor");
            
        }
    }
}
   