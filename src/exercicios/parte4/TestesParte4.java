package exercicios.parte4;

import exercicios.parte4.modulos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestesParte4 {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("The Matrix");
        Titulo titulo1 = new Titulo("The Shinning");
        Titulo titulo2 = new Titulo("Stephen King's IT");

        List<Integer> arrayInt = new ArrayList<>();

        arrayInt.add(1);
        arrayInt.add(3);
        arrayInt.add(5);
        arrayInt.add(7);
        arrayInt.add(9);
        arrayInt.add(2);
        arrayInt.add(4);
        arrayInt.add(6);
        arrayInt.add(8);

        System.out.println(arrayInt);
        Collections.sort(arrayInt);
        System.out.println(arrayInt);

        List<Titulo> arrayTitulo = new ArrayList<>();
        arrayTitulo.add(titulo);
        arrayTitulo.add(titulo2);
        arrayTitulo.add(titulo1);

        System.out.println(arrayTitulo);
        Collections.sort(arrayTitulo);
        System.out.println(arrayTitulo);

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("a");
        arrayList.add("b");
        linkedList.add("c");
        linkedList.add("d");

        System.out.println(STR."ArrayList: \{arrayList}");
        System.out.println(STR."LinkedList: \{linkedList}");

        List<String> listaPolimorfica;
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("a");
        listaPolimorfica.add("b");
        System.out.println(listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("c");
        listaPolimorfica.add("d");
        System.out.println(listaPolimorfica);


    }
}
