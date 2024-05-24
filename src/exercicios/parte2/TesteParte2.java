package exercicios.parte2;

import exercicios.parte2.modelos.Produto;
import exercicios.parte2.modelos.ProdutoPerecivel;

import java.util.ArrayList;
import java.util.Date;

public class TesteParte2 {
    public static void main(String[] args) {

        Produto produto =new Produto("caneta",1.30);
        Produto produto1 = new Produto("Borracha",1.50);
        Produto produto2 = new Produto("Lápis",0.90);
        ProdutoPerecivel fruta = new ProdutoPerecivel("Maça",3.00);
        Date data  = new Date();

        ArrayList<Produto> arrayProduto = new ArrayList<>();
        arrayProduto.add(produto);
        arrayProduto.add(produto1);
        arrayProduto.add(produto2);

        fruta.setDataValidade(String.valueOf(data));

        System.out.println(fruta.toString());
    }
}
