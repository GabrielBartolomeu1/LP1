import java.util.Scanner;

public class IdadeEmDias {
    public static void exercicio7() {
        Scanner scanner = new Scanner(System.in);
        String exeplo = """
                Digite sua idade em anos, meses e dias.
                Exemplo: 17 anos
                         9 meses
                         24 dias
                """;
        System.out.println(exeplo);

        System.out.println("Ano: ");
        int ano = scanner.nextInt();

        System.out.println("Meses: ");
        int meses = scanner.nextInt();

        System.out.println("Dias: ");
        int dias = scanner.nextInt();

        int anoEmDias = ano * 365;
        int mesesEmDias = meses * 30;
        int totalDias = anoEmDias + mesesEmDias + dias;
        System.out.println("Voce ja viveu: " + totalDias + "dias.");
    }
}
