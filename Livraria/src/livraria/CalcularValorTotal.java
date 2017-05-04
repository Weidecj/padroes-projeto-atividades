package livraria;

import livraria.produtos.*;

public class CalcularValorTotal {
    public double calcularPreco(Livraria livraria, ValorPagoPorProduto valor){
        double valorProduto = valor.calcularValor(livraria);
        return valorProduto;
    }
}
