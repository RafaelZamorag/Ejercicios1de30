import java.util.Scanner;

public class Ejercicio11 {
    /*Hallar el área de un rectángulo*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo: ");
        int base=leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        int altura=leer.nextInt();
        double area=(base*altura/2);
        System.out.println("El area del rectangulo es: " + area);
    }
}
