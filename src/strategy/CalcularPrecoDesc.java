
package strategy;

import loja.Venda;

/**
 *
 * @author camil
 */
public interface CalcularPrecoDesc {
    
    public double calcularPreco(Venda venda, double desconto);
}
