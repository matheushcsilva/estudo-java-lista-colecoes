package exercicios.parte3;

import exercicios.parte3.interfaces.Forma;
import exercicios.parte3.modelos.*;

import java.util.ArrayList;

public class TestesParte3 {
    public static void main(String[] args) {
        double somaPreco = 0;

        Animal animal = new Cachorro();
        Produtos produto = new Produtos("caneta",1.50);
        Produtos produto1 = new Produtos("Borracha",1.70);
        Produtos produto2 = new Produtos("Lápis",1.10);

        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();

        ContaBancaria contaBancaria = new ContaBancaria("123123",5500);
        ContaBancaria contaBancaria1 =new ContaBancaria("312321",2650.98);
        ContaBancaria contaBancaria2 = new ContaBancaria("456456",7930.10);

        if(animal instanceof Cachorro ){
            Cachorro cachorro = (Cachorro) animal;
        }else {
            System.out.println("Objeto não é um Cachorro");
        }

        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);

//        for(Integer item:arrayList){
//            System.out.println(item);
//        }

        ArrayList<Produtos> arrayProdutos = new ArrayList<>();
        arrayProdutos.add(produto);
        arrayProdutos.add(produto1);
        arrayProdutos.add(produto2);

        for (Produtos item:arrayProdutos){
            somaPreco += produto.getPreco();
        }
        double media = somaPreco/arrayProdutos.size();
        //System.out.println(media);

        ArrayList<Forma> arrayForma = new ArrayList<>();
        arrayForma.add(circulo);
        arrayForma.add(quadrado);

        for(Forma item:arrayForma){
           double area = item.calcularArea(3);
            System.out.println(STR."A área é \{area} m²");
        }

        ArrayList<ContaBancaria> arrayContas = new ArrayList<>();
        arrayContas.add(contaBancaria);
        arrayContas.add(contaBancaria1);
        arrayContas.add(contaBancaria2);

        double maiorSaldo=0;
        String c ="";
        for (ContaBancaria conta: arrayContas){
            if (conta.getSaldo()> maiorSaldo){
                maiorSaldo = conta.getSaldo();
                c = conta.getNumeroConta();
            }
        }
        System.out.println(STR."O maior saldo é \{maiorSaldo}, da conta \{c}");
    }
}
