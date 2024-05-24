package desafio;

import desafio.modelos.Cartao;
import desafio.modelos.Compras;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o limite do cartão a ser criado: ");
        double limite = leitura.nextDouble();
        Cartao cartao = new Cartao(limite);

        String textOperacoes = """
                
                Qual operação deseja realizar?
          
                1 - Verificar o limite disponível do cartao;
                2 - Realizar uma compra;
                3 - Imprimir extrato;
                0 - Sair;
                
                """;

        int operacao=3;
        while (operacao != 0){
            System.out.println(textOperacoes);
            System.out.print("Deseja realizar qual operação? ");
            operacao = leitura.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println(STR."Seu saldo disponível é de R$ \{cartao.getSaldo()}");
                    break;
                case 2:
                    System.out.println("Digite a descricao da compra: ");
                    String descricao = leitura.next();

                    System.out.println("Digite o valor da compra: ");
                    double valor = leitura.nextDouble();

                    Compras compra = new Compras(descricao,valor);
                    boolean compraRealizada = cartao.lancaCompra(compra);

                    if(compraRealizada){
                        System.out.println("Compra realizada com sucesso");
                        break;
                    }else {
                        System.out.println("Saldo insuficiente para compra");
                    }
                case 3:
                    System.out.println("""
                            Extrato de compras
                            """);
                    System.out.println("Descricao - Valor");
                    for (Compras c: cartao.getCompras()){
                        System.out.println(STR."\{c.getDescricao()} - R$\{c.getValor()}");
                    }
                    System.out.println("");
                    System.out.println(STR."Valor disponível no cartão = \{cartao.getSaldo()}");
                    break;
                case 4:
                    break;
            }
        }

    }
}
