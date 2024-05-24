package exercicios.parte2.modelos;

public class ProdutoPerecivel extends Produto{
    public String dataValidade;

    public ProdutoPerecivel(String nome, double preco) {
        super(nome, preco);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "nome= '" + getNome() + '\'' +
                ", preco= R$" + getPreco() +
                ", dataValidade= '" + dataValidade + '\'' +
                '}';
    }
}