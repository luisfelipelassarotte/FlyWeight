package flyweight;

import java.util.HashMap;
import java.util.Map;

public class VeiculoFactory {
    private static Map<String, Veiculo> veiculos = new HashMap<>();

    public static Veiculo getVeiculo(String nome, String caracteristicas) {
        Veiculo veiculo = veiculos.get(nome);
        if (veiculo == null) {
            veiculo = new Veiculo(nome, caracteristicas);
            veiculos.put(nome, veiculo);
        }
        return veiculo;
    }

    public static int getTotalVeiculos() {
        return veiculos.size();
    }
}
