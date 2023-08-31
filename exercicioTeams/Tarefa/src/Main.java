import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Sedan", "Toyota", 2022);
        Moto moto1 = new Moto("Esportiva", "Honda", 2021);
        Caminhao caminhao1 = new Caminhao("Caminhão Grande", "Volvo", 2020);
        Bicicleta bicicleta = new Bicicleta(" downhil", "SCOTT", 2022);
        Onibus onibus = new Onibus("Marcopolo Paradiso"," Marcopolo", 2023 );
        Trem trem = new Trem("TGV ", "SNCF", 2014);
        Helicoptero helicoptero = new Helicoptero("Bell 407", "Bell Helicopter", 2020);
        Aviao aviao = new Aviao("Boeing 747", "Boeing", 2013);
        Barco barco = new Barco("Bayliner", "VR5 Bowrider", 2018);
        Trator trator = new Trator("Kubota M7-171", "Kubota", 2023);

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro1);
        veiculos.add(moto1);
        veiculos.add(caminhao1);
        veiculos.add(bicicleta);
        veiculos.add(onibus);
        veiculos.add(trem);
        veiculos.add(helicoptero);
        veiculos.add(aviao);
        veiculos.add(barco);
        veiculos.add(trator);

        for (Veiculo veiculo : veiculos) {
            System.out.println("\nFunções " + veiculo.getModelo() + "\n");
            veiculo.exibirInfo();
            veiculo.acelerar();
            veiculo.freiar();
            veiculo.buzinar();
                }
            }
        }
