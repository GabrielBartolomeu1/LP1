public class Helicoptero extends Veiculo {
    public Helicoptero(String modelo, String marca, int anoFabricacao) {
        super(modelo, marca, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("Helicóptero decolando...");
    }

    @Override
    public void freiar() {
        System.out.println("Helicóptero pousando...");
    }

    @Override
    public void buzinar() {
        System.out.println("Helicóptero: Som das hélices!");
    }
}

