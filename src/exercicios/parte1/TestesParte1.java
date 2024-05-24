package exercicios.parte1;

import exercicios.parte1.modelos.Pessoa;

import java.util.ArrayList;

public class TestesParte1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa.setNome("Matheus");
        pessoa.setIdade(26);
        pessoa2.setNome("Aline");
        pessoa2.setIdade(30);
        pessoa3.setNome("Luiza");
        pessoa3.setIdade(2);

        ArrayList<Pessoa> arrayList = new ArrayList<>();
        arrayList.add(pessoa);
        arrayList.add(pessoa2);
        arrayList.add(pessoa3);

        System.out.println(arrayList.size());
        System.out.println(arrayList.toString());
        System.out.println(arrayList.getFirst().getNome());
    }

}
