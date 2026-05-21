import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matriz = new double[3][3];

        System.out.println("--- Ingreso de Valores para Matriz 3x3 ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor en [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\n--- Matriz Transpuesta ---");
        // Para transponer, invertimos el orden de iteración (j, luego i)
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}