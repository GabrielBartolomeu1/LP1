import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
public class Ex91 {
    public static void ex91Vetor() {
        Random random = new Random();
        int[] vetor = new int[50];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(50) + 1;
        }

        System.out.println("Lista: " + Arrays.toString(vetor));
        boolean repetido = false;
        boolean[] posRepetidas = new boolean[50];
        int numerosRepetidos = 0;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    posRepetidas[i] = true;
                    numerosRepetidos++;
                    break;
                }
            }
        }

        if (numerosRepetidos > 0) {
            System.out.println("Números repetidos e suas posições");
            for (int i = 0; i < vetor.length; i++) {
                if (posRepetidas[i]) {
                    System.out.println("Número: " + vetor[i] + ", Posição: " + (i + 1));
                }

            }
        } else {
            System.out.println("Não há números repetidos.");
        }
    }
    public static void ex91Array() {
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            lista.add(random.nextInt(50) + 1);
        }

        System.out.println("Lista: " + lista);
        boolean repetido = false;
        ArrayList<Boolean> posRepetidas = new ArrayList<>();
        int numerosRepetidos = 0;

        for (int i = 0; i < lista.size(); i++) {
            posRepetidas.add(false);
        }

        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (lista.get(i).equals(lista.get(j))) {
                    posRepetidas.set(i, true);
                    numerosRepetidos++;
                    break;
                }
            }
        }

        if (numerosRepetidos > 0) {
            System.out.println("Números repetidos e suas posições");
            for (int i = 0; i < lista.size(); i++) {
                if (posRepetidas.get(i)) {
                    System.out.println("Número: " + lista.get(i) + ", Posição: " + (i + 1));
                }
            }
        } else {
            System.out.println("Não há números repetidos.");
        }
    }

}
