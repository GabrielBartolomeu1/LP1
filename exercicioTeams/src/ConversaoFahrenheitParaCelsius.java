import java.util.Scanner;

public class ConversaoFahrenheitParaCelsius {
    public static void exercicio12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double temperaturaEmFahrenheit = scanner.nextDouble();
        double temperaturaEmCelsius = ((temperaturaEmFahrenheit - 32) * 5) / 9;
        System.out.println("A temperatura em Celsius é: " + temperaturaEmCelsius);
    }
}
