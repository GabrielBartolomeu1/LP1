public class Onibus extends Veiculo{

    public Onibus(String modelo, String marca, int anoFabricacao) {
        super(modelo, marca, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("Ônibus acelerando...");
    }

    @Override
    public void freiar() {
        System.out.println("Ônibus freando...");
    }

    @Override
    public void buzinar() {
        System.out.println("Ônibus: Honk honk!");
    }
}
