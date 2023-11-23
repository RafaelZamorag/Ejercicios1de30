import java.util.Scanner;

public class Ejercicio17 {
    /*Algoritmo que determine el número mayor de 2 leídos*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros:");
        int numero1=leer.nextInt();
        int numero2=leer.nextInt();
        int max = Math.max(numero1,numero2);
        System.out.println("El numero mas grande es:" + max);

    }
}
