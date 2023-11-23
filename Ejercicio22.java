import java.util.Scanner;

public class Ejercicio22 {
    /*Introducir un número real, mostrar la parte entera y la parte decimal del número. */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el numero real:");
        double numeroReal=leer.nextDouble();
        int parteEntera=(int) numeroReal;
        double parteDecimal = numeroReal-parteEntera;
        System.out.println("La parte entera del numero es:" + parteEntera);
        System.out.println("La parte decimal del numero es:" + parteDecimal);

        
    }
}
