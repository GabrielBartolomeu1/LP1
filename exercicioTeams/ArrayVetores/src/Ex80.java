import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex80 {
    public static void ex80Vetor() {
        int Q[] = new int[20];
        Random random = new Random();
        for (int i = 0; i < Q.length; i++) {
            Q[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(Q));

        int maior = 0;
        int maiorPosicao = 0;
        for (int i = 0; i < Q.length; i++) {
            if (Q[i] > maior) {
                maior = Q[i];
                maiorPosicao = i+1;
            }
        }
        System.out.println("O maior número é: " + maior + " na posição " + maiorPosicao);
    }

    public static void ex80Array() {
        ArrayList<Integer> Q = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            Q.add(random.nextInt(101));
        }
        System.out.println(Q.toString());

        int maior = 0;
        int maiorPosicao = 0;
        for (int i = 0; i < Q.size(); i++) {
            if (Q.get(i) > maior) {
                maior = Q.get(i);
                maiorPosicao = i+1;
            }
        }
        System.out.println("O maior número é: " + maior + " na posição " + maiorPosicao);

    }
}
