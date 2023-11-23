import java.util.Scanner;

public class Ejercicio28 {
    /*Programa que muestre en pantalla una cuenta atrás de números tomando en
cuenta el número leído de teclado (ej. 7,6,5,4,3,2,1,0).*/
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresa un numero:");
    int numero=leer.nextInt();
    for(int i=numero;i>=0;i--){
        System.out.println(i);
    }
}
}
