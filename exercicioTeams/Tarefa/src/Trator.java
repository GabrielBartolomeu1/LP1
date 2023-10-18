public class Trator extends Veiculo {
    public Trator(String modelo, String marca, int anoFabricacao) {
        super(modelo, marca, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("Trator em movimento...");
    }

    @Override
    public void freiar() {
        System.out.println("Trator parando...");
    }

    @Override
    public void buzinar() {
        System.out.println("Trator: Apito do trem!");
    }
}
