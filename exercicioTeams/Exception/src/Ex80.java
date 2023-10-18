import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Q = new int[20];
        int maiorElemento = Integer.MIN_VALUE;
        int posicaoMaior = -1;

        while (true) {
            try {
                for (int i = 0; i < Q.length; i++) {
                    System.out.print("Digite um número positivo para a posição " + i + ": ");
                    int numero = scanner.nextInt();

                    if (numero > 0) {
                        Q[i] = numero;

                        if (numero > maiorElemento) {
                            maiorElemento = numero;
                            posicaoMaior = i;
                        }
                    } else {
                        System.out.println("Por favor, digite um número positivo.");
                        i--;
                    }
                }

                System.out.println("O maior elemento de Q é " + maiorElemento + " e ocupa a posição " + posicaoMaior + " no vetor.");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Certifique-se de inserir um número inteiro positivo.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
