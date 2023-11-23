import java.util.Scanner;

public class Ejercicio12 {
    /* 12.Introducir tres números por teclado, hallar el promedio de los tres números, la suma
y desplegar del primer número el doble, del segundo número el triple y del tercer
número el cuadrado.*/
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresa los 3 numeros: ");
    int numero1=leer.nextInt();
    int numero2=leer.nextInt();
    int numero3=leer.nextInt();
    double media=(numero1+numero2+numero3/3);
    double suma=numero1+numero2+numero3;
    int double1 = numero1*2;
    int triple2 = numero2*3;
    int square3 = numero3*numero3;
    System.out.println("El promedio de los 3 numeros es:" + media);
    System.out.println("El suma de los 3 numeros es:" + suma );
    System.out.println("El doble del primer numero es:" + double1);
    System.out.println("El triple del segundo numero es:" + triple2);
    System.out.println("El cuadrado del tercer numero es:" + square3);

}
}
