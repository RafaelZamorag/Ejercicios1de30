import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {
    /* 23.Juego del Rojo-amarillo-verde. El programa genera tres dígitos aleatorios distintos
entre 0 y 9. A estos dígitos se les asignan las posiciones 1, 2 y 3. El objetivo del
juego es adivinar los dígitos así como sus posiciones correctas en el menor número
de intentos posibles. Para cada intento, el jugador proporciona tres dígitos para las
posiciones 1, 2, y 3. El programa responde con una pista que consta de rojo,
amarillo y verde. Si un dígito adivinado está en la posición correcta la respuesta es
verde. Si el digito adivinado está en posición incorrecta, la respuesta es amarillo. Si
el dígito para una posición dada no coincide con ninguno de los tres dígitos, la
respuesta es rojo.*/
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();
        int[] Digitos = new int[3];
        for(int i = 0;i < 3;i++){
            Digitos[i] = random.nextInt(10);
        }
        System.out.println("Binvenido al juego del Rojo-amarillo-verde");
        System.out.println("Intente adivinar los digitos de la mejor forma correcta");

        int intentos = 0;
        boolean adivinado = false;

        while (!adivinado) {
            System.out.print("Ingresa tus tres dígitos separados por espacios (0-9): ");
            int[] intento = new int[3];
            for (int i = 0; i < 3; i++) {
                intento[i] = random.nextInt();
            }

            intentos++;

            List<String> pistas = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                if (intento[i] == Digitos[i]) {
                    pistas.add("verde");
                } else if (Arrays.stream(Digitos).anyMatch(d -> d == intento[10])) {
                    pistas.add("amarillo");
                } else {
                    pistas.add("rojo");
                }
            }

            System.out.println("Pistas: " + String.join(", ", pistas));

            if (pistas.stream().allMatch(p -> p.equals("verde"))) {
                adivinado = true;
                System.out.println("¡Felicidades, adivinaste los dígitos en " + intentos + " intentos!");
            }
        }

        System.out.println("Gracias por jugar.");
    }
}