import java.util.Scanner;

public class Ejercicio3 {
    /*Programa que obtenga el área de un triángulo, a partir de datos proporcionados por
el usuario.

● Ingresar la base y la altura
● Escribir la fórmula para el área
○ area = (base * altura) / 2
● mostrar el resultado del área */
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese Base");
    double base=leer.nextDouble();
    System.out.println("Ingrese Altura");
    double altura=leer.nextDouble();
    //area=(base*altura)/2;
    double area=base*altura/2;
    System.out.println("El area del triangulo es: " + area);
}
}
