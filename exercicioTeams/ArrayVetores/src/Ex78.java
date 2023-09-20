import java.util.ArrayList;
import java.util.Scanner;

public class Ex78 {
    public static void ex78Vetor() {
        String[] nomes = new String[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o" + (i + 1) + "º nome");
            String nomesInput = scanner.next();
            nomes[i] = nomesInput;
        }

        boolean encontrar = false;

        System.out.println("Procure um nome na lista:");
        String nomeBuscar = scanner.next();
        for (String n : nomes) {
            if (nomeBuscar.equals(n)) {
                encontrar = true;
                break;
            }
        }
        if (encontrar) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
    }

    public static void ex78Array() {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o" + (i + 1) + "º nome");
            String nomesInput = scanner.next();
            nomes.add(nomesInput);
        }

        boolean encontrar = false;

        System.out.println("Procure um nome na lista:");
        String nomeBusca = scanner.next();
        for (String n : nomes) {
            if (nomeBusca.equals(n)) {
                encontrar = true;
                break;
            }
        }
        if (encontrar) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NAO ACHEI");
        }
    }
}
