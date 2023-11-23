import java.util.Scanner;

public class Ejercicio6 {
    /* Programa que calcula la media aritmética de tres números cualesquiera dados por
el usuario.*/
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el primer numero: ");
    int numero1=leer.nextInt();
    System.out.println("Ingrese el segundo numero: ");
    int numero2=leer.nextInt();
    System.out.println("Ingrese el tercer numero: ");
    int numero3=leer.nextInt();
    double media=(numero1+numero2+numero3/3);
    System.out.println("Los numeros ingresados son:" + media);
    
}
}
