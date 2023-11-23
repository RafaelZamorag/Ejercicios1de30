public class Ejercicio21 {
    /* Intercambiar los valores de dos variables A y B.*/
    public static void main(String[] args) {
        int A=20;
        int B=35;
        System.out.println("Antes de intercambiar: A = " + A + "B = " + B);
        int temporal=A;
        A=B;
        B=temporal;
        System.out.println("Despues del intercambio: A = " + A + "B = " + B);
    }
}
