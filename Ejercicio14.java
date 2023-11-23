import java.util.Scanner;

public class Ejercicio14 {
    /*Introducir un número por teclado supone que tiene cuatro dígitos, Desplegar la
suma de los dígitos.*/
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresar un numero de 4 digitos: ");
    int numero=leer.nextInt();
    int suma=0;
    while(numero>0){
        suma+=numero % 10;
        numero/=10;

    }
    System.out.println("La suma de los digitos es:" + suma);

}
}
