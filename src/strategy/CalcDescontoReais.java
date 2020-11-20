package strategy;

import loja.Venda;

/**
 *
 * @author camil
 */
public class CalcDescontoReais implements CalcularPrecoDesc {

    @Override
    public double calcularPreco(Venda venda, double desconto) {

        double valorComDesc = venda.getValorTotalAPagar();
        
        if (venda.getValorTotalBruto() >= 300.00) {
            if (desconto == 0){
                valorComDesc = venda.getValorTotalAPagar() - 20.00;
            } else {
                valorComDesc = venda.getValorTotalAPagar() - desconto;
            }
        }
        return valorComDesc;
    }

}
