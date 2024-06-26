package desafio.modelos;

public class Compras implements Comparable<Compras>{
    private String descricao;
    private double valor;

    public Compras(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return STR."Produto: \{descricao}, valor: R$\{valor}";
    }

    @Override
    public int compareTo(Compras o) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(o.valor));
    }
}
