import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex81 {
    public static void ex81Vetor() {
        int[] Q = new int[20];
        Random random = new Random();
        for (int i = 0; i < Q.length; i++) {
            Q[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(Q));

        int menor = 100;
        int menorPosicao = 0;
        for (int i = 0; i < Q.length; i++) {
            if (Q[i] < menor) {
                menor = Q[i];
                menorPosicao = i+1;
            }
        }
        System.out.println("O maior valor de Q é: " + menor + " na posição " + menorPosicao);
    }

    public static void ex81Array() {
        ArrayList<Integer> Q = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            Q.add(random.nextInt(101));
        }
        System.out.println(Q.toString());

        int menor = 100;
        int menorPosicao = 0;
        for (int i = 0; i < Q.size(); i++) {
            if (Q.get(i) < menor) {
                menor = Q.get(i);
                menorPosicao = i+1;
            }
        }
        System.out.println("O maior número é: " + menor + " na posição " + menorPosicao);

    }
}
