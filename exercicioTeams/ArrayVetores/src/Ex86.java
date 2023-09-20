import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
public class Ex86 {
    public static void ex86Vetor() {
        Random random = new Random();
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
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
    }

    public static void ex86Array() {
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
    }
}
