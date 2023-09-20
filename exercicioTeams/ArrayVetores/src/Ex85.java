import java.util.ArrayList;
import java.util.Random;

public class Ex85 {
    public static void ex85Vetor() {
        Random random = new Random();
        double tempoMinimo = 0;
        double tempoMaximo = 40;
        double menor = 100;
        double maior = 0;
        double soma = 0;
        double[] tempo = new double[365];

        for (int i = 0; i < tempo.length; i++) {
            tempo[i] = random.nextDouble(tempoMaximo - tempoMinimo) + tempoMinimo;
            if (tempo[i] < menor) {
                menor = tempo[i];
            }
            if (tempo[i] > maior) {
                maior = tempo[i];
            }
            soma+= tempo[i];

        }

        double media = soma/365;
        int mediaInferior = 0;

        for (int i = 0; i < tempo.length; i++) {
            if (tempo[i] < media) {

                mediaInferior++;
            }
        }
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Temperatura media: " + media);
        System.out.println("#Dias abaixo da media: " + mediaInferior);
    }

    public static void ex85Array() {
        Random random = new Random();
        double tempoMinimo = 0;
        double tempoMaximo = 40;
        double menor = 100;
        double maior = 0;
        double soma = 0;
        ArrayList<Double> tempo = new ArrayList<>();

        for (int i = 0; i < 365; i++) {
            tempo.add(random.nextDouble(tempoMaximo - tempoMinimo) + tempoMinimo);
            if (tempo.get(i) < menor) {
                menor = tempo.get(i);
            }
            if (tempo.get(i)> maior) {
                maior = tempo.get(i);
            }
            soma+= tempo.get(i);
        }

        double media = soma/365;
        int inferiorMedia = 0;

        for (int i = 0; i < tempo.size(); i++) {
            if (tempo.get(i) < media) {
                inferiorMedia++;
            }
        }
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Temperatura media: " + media);
        System.out.println("#Dias abaixo da media: " + inferiorMedia);
    }
}
