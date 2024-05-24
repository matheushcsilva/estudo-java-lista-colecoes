package exercicios.parte3.modelos;

import exercicios.parte3.interfaces.Forma;

public class Quadrado implements Forma {
    @Override
    public double calcularArea(int lado) {
        return lado*lado;
    }
}
