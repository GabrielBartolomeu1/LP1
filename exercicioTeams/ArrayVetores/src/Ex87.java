import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex87 {
    public static void ex87Vetor() {
        Random random = new Random();
        int[] vetor = new int[11];

        for (int i = 0; i < 10; i++) {
            vetor[i] = random.nextInt(51);
        }
        System.out.println("Lista Inicial: " + Arrays.toString(vetor));

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 1; j < vetor.length-i; j++) {
                if (vetor[j-1] > vetor[j]) {
                    int aux = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println("Lista Final: " + Arrays.toString(vetor));
        int numero = random.nextInt(51);
        System.out.println("Adição de mais um valor: " + numero);

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 1; j < vetor.length-i; j++) {
                if (vetor[j-1] == 0) {
                    vetor[j-1] = numero;
                }
                if (vetor[j-1] > vetor[j]) {
                    int aux = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println("Lista Final com mais um valor:" + Arrays.toString(vetor));
    }

    public static void ex87Array() {
        Random random = new Random();
        ArrayList<Integer> vetor = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            vetor.add(random.nextInt(51));
        }
        System.out.println("Lista Inicial: " + vetor.toString());

        for (int i = 0; i < vetor.size(); i++) {
            for (int j = 1; j < vetor.size()-i; j++) {
                if (vetor.get(j-1) > vetor.get(j)) {
                    int aux = vetor.get(j-1);
                    vetor.set(j-1, vetor.get(j));
                    vetor.set(j, aux);
                }
            }
        }
        System.out.println("Lista Final: " + vetor.toString());
        int numero = random.nextInt(51);
        System.out.println("Adicionar mais um valor: " + numero);
        vetor.add(numero);
        for (int i = 0; i < vetor.size(); i++) {
            for (int j = 1; j < vetor.size()-i; j++) {
                if (vetor.get(j-1) > vetor.get(j)) {
                    int aux = vetor.get(j-1);
                    vetor.set(j-1, vetor.get(j));
                    vetor.set(j, aux);
                }
            }
        }
        System.out.println("Lista Final com mais um valor:" + vetor.toString());
    }
}
