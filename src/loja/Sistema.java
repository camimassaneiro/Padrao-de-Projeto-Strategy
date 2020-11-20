package loja;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int escolha;

        Venda v = new Venda();
        v.add(new ItemVenda(10, 100));
        v.add(new ItemVenda(1.2, 500));
        v.add(new ItemVenda(30, 300));

        System.out.println("Informe o tipo de desconto: 1 - porcentagem / 2 - Valor em reais / 3 - Sem desconto");
        int tipo = s.nextInt();
        v.setTipoDesconto(tipo);

        switch (tipo) {
            case 1:
                System.out.println("1 - Manter desconto padrão 15% / 2 - informar novo valor desconto ");
                escolha = s.nextInt();
                if (escolha == 1) {
                    System.out.println(" Valor com desconto de 15% =  " + v.pagar());
                } else {
                    System.out.println("Informe o valor da porcentagem de desconto");
                    double porc = s.nextDouble();
                    v.setDesconto(porc);
                    System.out.println(" Valor com desconto de: " + porc + "% = " + v.pagar());
                }
                break;
            case 2:
                
                System.out.println("1 - Manter desconto padrão R$ 20,00 / 2 - informar novo valor desconto ");
                escolha = s.nextInt();
                if (escolha == 1) {
                    System.out.println(" Valor com desconto de R$20,00 = " + v.pagar());
                } else {
                    System.out.println("Informe o valor do desconto em reais");
                    double desc = s.nextDouble();
                    v.setDesconto(desc);
                    System.out.println( " Valor com desconto de R$" + desc + " = " + v.pagar());
                }
                break;
            case 3: 
                System.out.println("Valor sem desconto " + v.getValorTotalAPagar());
                break;
            default:
                System.out.println("Opção inválida!!!");
        }
    }

}
