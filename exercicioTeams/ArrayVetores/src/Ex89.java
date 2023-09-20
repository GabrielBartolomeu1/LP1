import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
public class Ex89 {
    public static void ex89Vetor() {
        Random random = new Random();
        int[] v1 = new int[15];
        int[] v2 = new int[15];

        for (int i = 0; i < v1.length; i++) {
            int numeroVetor1 = random.nextInt(20) + 1;
            int numeroVetor2 = random.nextInt(20) + 1;
            v1[i] = numeroVetor1;
            v2[i] = numeroVetor2;
        }

        System.out.println("Vetor 1: " + Arrays.toString(v1));
        System.out.println("Vetor 2: " + Arrays.toString(v2));

        int igualValorPosicao = 0;

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] == v2[i]) {
                igualValorPosicao++;
            }
        }
        System.out.println("V1 e V2 têm mesmos números nas mesmas posições:" + igualValorPosicao + "vezes");
    }

    public static void ex89Array() {
        Random random = new Random();
        ArrayList<Integer> vetor1 = new ArrayList<>();
        ArrayList<Integer> vetor2 = new ArrayList<>();

        while (vetor1.size() < 15){
            int numv1 = random.nextInt(20) + 1;
            int numv2 = random.nextInt(20) + 1;
            vetor1.add(numv1);
            vetor2.add(numv2);
        }

        System.out.println("Vetor 1: " + vetor1.toString());
        System.out.println("Vetor 2: " + vetor2.toString());
        int igualValorPosicao = 0;

        for (int i = 0; i < vetor1.size(); i++) {
            if (vetor1.get(i) == vetor2.get(i)) {
                igualValorPosicao++;
            }
        }
        System.out.println("Quantidade de vezes que V1 e V2 têm mesmos números nas mesmas posições:" + igualValorPosicao);
    }
}
