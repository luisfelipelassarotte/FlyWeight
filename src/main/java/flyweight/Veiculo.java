package flyweight;

public class Veiculo {

    private String nome;
    private String caracteristicas;

    public Veiculo(String nome, String caracteristicas) {
        this.nome = nome;
        this.caracteristicas = caracteristicas;
    }

    public String getNome() {
        return nome;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }
}
