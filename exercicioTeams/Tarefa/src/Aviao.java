public class Aviao extends Veiculo {
    public Aviao(String modelo, String marca, int anoFabricacao) {
        super(modelo, marca, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("Avião decolando...");
    }

    @Override
    public void freiar() {
        System.out.println("Avião pousando...");
    }

    @Override
    public void buzinar() {
        System.out.println("Avião: Som das turbinas!");
    }
}
