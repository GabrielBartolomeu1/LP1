public class Moto extends Veiculo {
    public Moto(String modelo, String marca, int anoFabricacao) {
        super(modelo, marca, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando...");
    }
    @Override
    public void freiar() {
        System.out.println("Moto freando...");
    }

    @Override
    public void buzinar() {
        System.out.println("Moto: Beep beep!");
    }
}

