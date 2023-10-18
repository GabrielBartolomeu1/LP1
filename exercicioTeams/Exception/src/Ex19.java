import java.util.InputMismatchException;
import java.util.Scanner;

    public class Ex19 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            double valor1, valor2;

            while (true) {
                try {
                    System.out.print("Digite o primeiro valor: ");
                    valor1 = scanner.nextDouble();
                    System.out.print("Digite o segundo valor (diferente do primeiro): ");
                    valor2 = scanner.nextDouble();

                    if (valor1 == valor2) {
                        System.out.println("Os valores são iguais. Por favor, insira valores diferentes.");
                    } else {
                        double maiorValor = Math.max(valor1, valor2);
                        System.out.println("O maior valor é: " + maiorValor);
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Certifique-se de inserir valores numéricos.");
                    scanner.nextLine();
                }
            }

            scanner.close();
        }
    }