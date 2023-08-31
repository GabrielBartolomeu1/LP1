public class Veiculo {
    private String modelo;
    private String marca;
    private int anoFabricacao;

    public Veiculo(String modelo, String marca, int anoFabricacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    public void acelerar(){
    }

    public void freiar(){
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void buzinar(){
    }
    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
    }
}
