import java.util.Scanner;

public class Ejercicio26 {
    /*Realizar el diagrama de flujo para que nos calcule el cuadrado de la hipotenusa de
un triángulo rectángulo, a partir de la longitud de sus dos catetos. */
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese la longitud del lado derecho del triangulo:");
    double ladoDerecho=leer.nextDouble();
    System.out.println("Ingrese la longitud del lado izquierdo del trangulo");
    double ladoIzquierdo=leer.nextDouble();
    double hipotenusaAlCuadrado=ladoDerecho*ladoDerecho + ladoIzquierdo*ladoIzquierdo;
    System.out.println("El cuadrado de la hipotenusa es:" + hipotenusaAlCuadrado);
}
}
