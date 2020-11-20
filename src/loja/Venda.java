package loja;

import java.util.ArrayList;
import java.util.List;
import strategy.CalcDescontoPorcentagem;
import strategy.CalcDescontoReais;
import strategy.CalcularPrecoDesc;

public class Venda {

    private List<ItemVenda> itens = new ArrayList<>();

    private int tipoDesconto;
    private double desconto = 0;

    CalcularPrecoDesc calcDesc;

    public void add(ItemVenda item) {
        itens.add(item);
    }

    public double getValorTotalBruto() {
        double res = 0;
        for (ItemVenda item : itens) {
            res += item.getPrecoUnit() * item.getQtdade();
        }
        return res;
    }

    public double getValorTotalAPagar() {
        return getValorTotalBruto();
    }

    public double pagar() {
        
        if (tipoDesconto == 1){
            calcDesc = new CalcDescontoPorcentagem();
        } else if(tipoDesconto == 2) {
            calcDesc = new CalcDescontoReais();
        }        
        return calcDesc.calcularPreco(this, desconto);
    }

    public void setTipoDesconto(int tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    

}
