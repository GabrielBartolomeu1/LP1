import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Ex88 {
    public static void ex88Vetor() {
        Random random = new Random();
        int[] lista = random.ints(1, 51).distinct().limit(20).toArray();
        System.out.println("Lista: " + Arrays.toString(lista));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar na lista: ");
        int numero = scanner.nextInt();

        int[] novaLista = new int[19];
        int novaListaIndex = 0;
        boolean encontrar = false;

        for (int numeros:lista) {
            if (numero == numeros) {
                encontrar = true;
            }
        }

        if (encontrar) {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] != numero) {
                    novaLista[novaListaIndex] = lista[i];
                    novaListaIndex++;
                }
            }
            System.out.println("Nova Lista: " + Arrays.toString(novaLista));
        } else {
            System.out.println("O número não pode ser encontrado na lista");
        }
    }

    public static void ex88Array() {
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        while (lista.size() < 20) {
            int numero = random.nextInt(50) + 1;
            if (!lista.contains(numero)) {
                lista.add(numero);
            }
        }
        System.out.println("Lista: " + lista.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar na lista: ");
        int numero = scanner.nextInt();

        ArrayList<Integer> novaLista = new ArrayList<>();
        int novaListaIndex = 0;
        boolean encontrado = false;

        for (int numeros:lista) {
            if (numero == numeros) {
                encontrado = true;
            }
        }

        if (encontrado) {
            for (int i = 0; i < lista.size(); i++) {
                if (numero != lista.get(i)) {
                    novaLista.add(lista.get(i));
                }
            }
            System.out.println("Nova Lista " + novaLista.toString());
        } else {
            System.out.println("O número não está na lista");
        }
    }
}
