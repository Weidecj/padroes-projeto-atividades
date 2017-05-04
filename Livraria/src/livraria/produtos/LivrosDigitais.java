package livraria.produtos;

import livraria.*;

public class LivrosDigitais implements ValorPagoPorProduto{

    @Override
    public double calcularValor(Livraria valor) {
        return valor.getValor() - ((valor.getValor()) * 0.15);
    }
    
}
