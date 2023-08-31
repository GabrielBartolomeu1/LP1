public class Barco extends Veiculo {
    public Barco(String modelo, String marca, int anoFabricacao) {
        super(modelo, marca, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("Barco acelerando...");
    }

    @Override
    public void freiar() {
        System.out.println("Barco freando...");
    }

    @Override
    public void buzinar() {
        System.out.println("Barco: Buzina de barco!");
    }
}
