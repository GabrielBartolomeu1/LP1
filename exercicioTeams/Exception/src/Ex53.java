import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        while (true) {
            try {
                System.out.print("Digite um valor N maior que zero: ");
                N = scanner.nextInt();

                if (N <= 0) {
                    System.out.println("Por favor, digite um valor maior que zero.");
                } else {
                    System.out.println("Valores inteiros entre 1 e " + N + ":");
                    for (int i = 1; i <= N; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Certifique-se de inserir um número inteiro maior que zero.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}