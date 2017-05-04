package livraria.produtos;

import livraria.*;

public class RevistasFisicas implements ValorPagoPorProduto{

    @Override
    public double calcularValor(Livraria valor) {
        return valor.getValor() - ((valor.getValor()) * 0.30);
    }
    
}
