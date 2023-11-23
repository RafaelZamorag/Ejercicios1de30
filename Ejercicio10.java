import java.util.Scanner;

public class Ejercicio10 {
    /*Hallar el área de un triángulo*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo: ");
        double base=leer.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        double altura=leer.nextDouble();
        double area=(base*altura/2);
        System.out.println("El area del triangulo es: " + area);
    }
}
