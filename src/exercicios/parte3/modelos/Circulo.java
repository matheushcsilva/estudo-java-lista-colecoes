package exercicios.parte3.modelos;

import exercicios.parte3.interfaces.Forma;

public class Circulo implements Forma {

    @Override
    public double calcularArea(int lado) {
        return Math.PI* lado*lado;
    }
}
