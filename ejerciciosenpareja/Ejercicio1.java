import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frutas = new String[10];

        System.out.println("--- Ingreso de Frutas ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la fruta " + (i + 1) + ": ");
            frutas[i] = sc.nextLine();
        }

        System.out.println("\n--- Frutas en Orden Inverso ---");
        for (int i = 9; i >= 0; i--) {
            System.out.println(frutas[i]);
        }
        sc.close();
    }
}