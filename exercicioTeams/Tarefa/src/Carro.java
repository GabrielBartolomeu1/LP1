public class Carro extends Veiculo {
    public Carro(String modelo, String marca, int anoFabricacao) {
        super(modelo, marca, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    @Override
    public void freiar() {
        System.out.println("Carro freando...");
    }

    @Override
    public void buzinar() {
        System.out.println("Carro: Beep beep!");
    }
}