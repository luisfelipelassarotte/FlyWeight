package flyweight;

public class Filial {
    private String nome;
    private String cidade;
    private Veiculo tipoVeiculo;

    public Filial(String nome, String cidade, Veiculo tipoVeiculo) {
        this.nome = nome;
        this.cidade = cidade;
        this.tipoVeiculo = tipoVeiculo;
    }

    public String dadosFilial() {
        return "Veiculo{" +
                "nome ='" + this.nome + '\'' +
                " da cidade de ='" + this.cidade + '\'' +
                " tem um veiculo '" + tipoVeiculo.getCaracteristicas() + '\'' +
                " com o nome de '" + tipoVeiculo.getNome() + '\'' +
                '}';
    }
}
