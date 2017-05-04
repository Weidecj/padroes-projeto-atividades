package livraria.produtos;
import Livraria.*;

import livraria.Livraria;

/**
 *
 * @author 00715111213
 */
public class JogosTabuleiro implements ValorPagoPorProduto{

    @Override
    public double calcularValor(Livraria valor) {
        return valor.getValor() - ((valor.getValor()) * 0.30);
    }
    
}
