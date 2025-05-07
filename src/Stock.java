public class Stock {
    private String nomestock;
    private int quantidade;
    private double preco;

    public Stock(String nomestock, int quantidade, double preco){
        this.nomestock=nomestock;
        this.quantidade=quantidade;
        this.preco=preco;
    }

    public String getNomestock() {
        return nomestock;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setNomestock(String nomestock) {
        this.nomestock = nomestock;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
