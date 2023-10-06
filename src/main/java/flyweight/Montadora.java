package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Montadora {
    private List<Filial> filiais = new ArrayList<>();

    public void construir(String nomeFilial, String cidadeFilial, String nomeVeiculo, String caracteristicaVeiculo) {
        Veiculo veiculo = VeiculoFactory.getVeiculo(nomeVeiculo, caracteristicaVeiculo);
        Filial filial = new Filial(nomeFilial, cidadeFilial, veiculo);
        filiais.add(filial);
    }

    public List<String> criarFiliais() {
        List<String> saida = new ArrayList<String>();
        for (Filial filial : this.filiais) {
            saida.add(filial.dadosFilial());
        }
        return saida;
    }
}
