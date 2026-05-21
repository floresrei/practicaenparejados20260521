import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];
        int suma = 0;

        System.out.println("--- Ingreso de Números ---");
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese el número entero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        double promedio = (double) suma / 12;
        System.out.println("\nEl promedio de los números ingresados es: " + promedio);
        sc.close();
    }
}
