import java.util.Scanner;

public class Ejercicio29 {
    /*Crear una función que permita calcular el cubo de un número real (float) */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        float numeroUno=leer.nextFloat();
        for(float i=numeroUno;i>=0;i--){
            System.out.println(i);
        }
    }
}
