import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("--- Ingreso de 10 Números ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        double mayor = numeros[0];
        double menor = numeros[0];

        for (int i = 1; i < 10; i++) {
            if (numeros[i] > mayor) mayor = numeros[i];
            if (numeros[i] < menor) menor = numeros[i];
        }

        System.out.println("\nEl número mayor ingresado es: " + mayor);
        System.out.println("El número menor ingresado es: " + menor);
        sc.close();
    }
}