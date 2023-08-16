import java.util.Scanner;

public class AntecessorDoNumero {
    public static void exercicio5() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = leitura.nextInt();
        System.out.println("O seu antecessor é: " + (numero - 1));
    }
}
