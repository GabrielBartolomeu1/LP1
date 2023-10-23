import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        String menu =
                """
                Digite a opção do exercicío que deseja visualizar:
                1 - Exercicio 1
                2 - Exercicio 5
                3 - Exercicio 6
                4 - Exercicio 7
                5 - Exercicio 12
                6 - Sair
                """;

        while (opcao != 6){
            System.out.println(menu);
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> InversorDeValores.exercicio1();
                case 2 -> AntecessorDoNumero.exercicio5();
                case 3 -> AreaRetangulo.exercicio6();
                case 4 -> IdadeEmDias.exercicio7();
                case 5 -> ConversaoFahrenheitParaCelsius.exercicio12();
            }

        }
    }
}