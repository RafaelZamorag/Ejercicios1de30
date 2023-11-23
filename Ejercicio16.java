import java.util.Scanner;

public class Ejercicio16 {
    /*Algoritmo que determine si una persona gano o no un examen matemático */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante:");
        String nombreDelEstudiante = leer.nextLine();
        System.out.println("Ingrese la nota del estudiante");
        int nota = leer.nextInt();
        if (nota>=5) {
            System.out.println("Felicitaciones, " +  "Ganaste el examen");
            
        } else {
            System.out.println("Lo siento, " + "No ganaste el examen");
            
        }

    }
}
