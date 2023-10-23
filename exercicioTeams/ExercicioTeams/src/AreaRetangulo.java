import java.util.Scanner;

public class AreaRetangulo {
    public static void exercicio6() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o comprimento do retangulo: ");
        int comprimento = leitura.nextInt();

        System.out.println("Digite a altura do retangulo: ");
        int altura = leitura.nextInt();;

        System.out.println("A área do retangulo é: " + (comprimento * altura));
    }
}
