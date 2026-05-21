import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];
        int pares = 0, impares = 0;

        System.out.println("--- Ingreso de Números ---");
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese el número entero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
        sc.close();
    }
}
