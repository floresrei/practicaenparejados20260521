import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] articulos = new String[3][3];

        System.out.println("--- Ingreso de Nombres de Artículos (Matriz 3x3) ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Fila " + i + ", Columna " + j + ": ");
                articulos[i][j] = sc.nextLine();
            }
        }

        System.out.println("\n--- Contenido de la Matriz con Filas Invertidas ---");
        for (int i = 2; i >= 0; i--) { // Empieza desde la última fila
            for (int j = 0; j < 3; j++) {
                System.out.print(articulos[i][j] + "\t| ");
            }
            System.out.println();
        }
        sc.close();
    }
}