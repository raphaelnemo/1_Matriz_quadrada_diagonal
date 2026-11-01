import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz: ");
        int n = scanner.nextInt();
        int[][] mat = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.printf("Digite o " + (j+1) + "º valor da matriz");
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Diagonal da matriz:");
        for (int i = 0; i < n; i++) {
            System.out.println(mat[i][i] + "");

        }
        System.out.println(); // quebra de linha

        int countNegativos = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (mat[i][j] < 0) {
                    countNegativos++;
                }
            }
        }
        System.out.println("Quantidade de negativos = " + countNegativos);

        }
    }