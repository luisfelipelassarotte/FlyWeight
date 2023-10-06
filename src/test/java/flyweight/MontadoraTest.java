package flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MontadoraTest {

    @Test
    void deveRetornarFiliais() {
        Montadora montadora = new Montadora();
        montadora.construir("RG Veiculos", "Vassouras", "TORO", "SUV");
        montadora.construir("Fiat Potenza", "Volta Redonda", "Fiorino", "Utilitario");
        montadora.construir("RG Veiculos", "Vassouras", "CRONOS", "Compacto");
        montadora.construir("Fiat Squadra", "Volta Redonda", "ARGO", "Hatch");

        List<String> saida = Arrays.asList(
            "Veiculo{nome ='RG Veiculos' da cidade de ='Vassouras' tem um veiculo 'SUV' com o nome de 'TORO'}",
            "Veiculo{nome ='Fiat Potenza' da cidade de ='Volta Redonda' tem um veiculo 'Utilitario' com o nome de 'Fiorino'}",
            "Veiculo{nome ='Fiat Azzurra' da cidade de ='Vassouras' tem um veiculo 'Compacto' com o nome de 'CRONOS'}",
            "Veiculo{nome ='Fiat Squadra' da cidade de ='Volta Redonda' tem um veiculo 'Hatch' com o nome de 'ARGO'}"
        );

        assertEquals(saida, montadora.criarFiliais());
    }

    @Test
    void deveRetornarQuantidadeDeVeiculos() {
        Montadora montadora = new Montadora();
        montadora.construir("RG Veiculos", "Vassouras", "TORO", "SUV");
        montadora.construir("Fiat Potenza", "Volta Redonda", "Fiorino", "Utilitario");
        montadora.construir("RG Veiculos", "Vassouras", "CRONOS", "Compacto");
        montadora.construir("Fiat Squadra", "Volta Redonda", "TORO", "SUV");

        assertEquals(3, VeiculoFactory.getTotalVeiculos());
    }

}