package livraria.produtos;

import livraria.*;

public class VideoGamesFisicos implements ValorPagoPorProduto{

    @Override
    public double calcularValor(Livraria valor) {
        return valor.getValor() - ((valor.getValor()) * 0);
    }
    
}
