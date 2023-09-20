import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Ex90 {
    public static void ex90Vetor() {
        Random random = new Random();
        int[] lista = new int[30];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < lista.length; i++) {
            lista[i] = random.nextInt(30) + 1;
        }

        System.out.println("Lista: " + Arrays.toString(lista));
        System.out.println("Digite um número para buscar na lista: ");
        int numero = scanner.nextInt();
        int numeroContador = 0;

        for (int i = 0; i < lista.length; i++) {
            if (numero == lista[i]) {
                numeroContador++;
            }
        }
        System.out.println("O número " + numero + " aparece " + numeroContador + " vezes na lista");
    }

    public static void ex90Array() {
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (lista.size() < 30) {
            lista.add(random.nextInt(30) + 1);
        }

        System.out.println("Lista: " + lista.toString());
        System.out.println("Digite um número para buscar na lista: ");
        int numero = scanner.nextInt();
        int numeroContador = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (numero == lista.get(i)) {
                numeroContador++;
            }
        }
        System.out.println("O número " + numero + " aparece " + numeroContador + " vezes na lista");
    }
}
