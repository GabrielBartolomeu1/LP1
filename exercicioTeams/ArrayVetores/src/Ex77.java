import java.util.ArrayList;
import java.util.Arrays;

public class Ex77 {
    public static void ex77Vetor() {
        int[] vetor = {5,1,4,2,7,8,3,6};
        for (int i =7; i >=4; i--) {
            int aux = vetor[i];
            vetor[i] = vetor[7-i+1];
            vetor[7-i+1] = aux;
        }
        vetor[2] = vetor[0];
        vetor[vetor[2]] = vetor[vetor[1]];

        System.out.println(Arrays.toString(vetor));
    }

    public static void ex77Array() {
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        vetor.addAll(Arrays.asList(5,1,4,2,7,8,3,6));
        for (int i=7; i>=4; i--) {
            int aux = vetor.get(i);
            vetor.set(i, vetor.get(7-i+1));
            vetor.set(vetor.get(7-i+1), aux);
        }
        vetor.set(2, vetor.get(0));
        vetor.set(vetor.get(2), vetor.get(vetor.get(1)));

        System.out.println(vetor.toString());

    }
}

