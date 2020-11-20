package strategy;

import loja.Venda;

/**
 *
 * @author camil
 */
public class CalcDescontoPorcentagem implements CalcularPrecoDesc{

        
    @Override
    public double calcularPreco(Venda venda, double desconto) {
        
       double valorComDesc = venda.getValorTotalAPagar();
       
       if (desconto == 0){
           valorComDesc -= venda.getValorTotalAPagar() * 0.15;           
       } else {
           valorComDesc -= venda.getValorTotalAPagar() * (desconto / 100);
       }
       
       return valorComDesc;       
    }

}
