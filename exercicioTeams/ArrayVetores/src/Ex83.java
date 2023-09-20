import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex83 {
    public static void ex83Vetor(){
        int[] lista = new int[20];
        int[] listaInvertida = new int[20];
        Random random = new Random();

        int indexInversa = 19;
        for (int i = 0; i < lista.length; i++) {
            lista[i] = random.nextInt(101);
            listaInvertida[indexInversa - i] = lista[i];
        }

        System.out.println("Vetor: " + Arrays.toString(lista));
        System.out.println("Vetor invertido: " + Arrays.toString(listaInvertida));
    }

    public static void ex83Array() {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaInvertida = new ArrayList<>();
        Random random = new Random();

        int indexInversa = 19;
        for (int i = 0; i < 20; i++) {
            lista.add(random.nextInt(101));
            listaInvertida.add(0, lista.get(i));
        }
        System.out.println("vetor normal: " + lista.toString());
        System.out.println("vetor inverso: " + listaInvertida.toString());
    }
}
