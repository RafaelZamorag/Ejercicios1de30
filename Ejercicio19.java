import java.util.Scanner;

public class Ejercicio19 {
    /*Introducir el sueldo básico de un empleado por teclado, hallar el total ganado
considerando que debe introducir el monto por horas extras, considerar un
descuento del 20%. Desplegar el sueldo básico, el total del descuento y el total
ganado. */
public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   System.out.println("Ingrese el sueldo basico del empleado:");
   double salarioBasico=leer.nextDouble();
   System.out.println("Numero de horas trabajadas:");
   int numhorastrabajadas=leer.nextInt();
   System.out.println("Cantidad de horas extras trabajadas:");
   double totalDelSalario = salarioBasico+(numhorastrabajadas);
   double descuento = totalDelSalario*0.2;
   double ganacias = totalDelSalario-descuento;
   System.out.println("Salario basico:" + salarioBasico);
   System.out.println("Numero de horas trabajadas:" + numhorastrabajadas);
   System.out.println("Total del Salario:" + totalDelSalario);
   System.out.println("Descuento:" + descuento);
   System.out.println("Total de ganancias:" + ganacias);
}
}
