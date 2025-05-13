import java.util.ArrayList;
import java.util.List;

public class Barraca extends Federaçao implements VendasVoluntarios {

    private String nomebarraca;
    private List<Ator> voluntarios;
    private List<StockProdutoDia> stockProdutoDias;
    private double vendas;

    private static final int numero_min_funcionarios = 2;

    enum Classificacao{
        Bronze, Prata, Ouro
    }

    public Barraca() {
    }

    public void adicionarStocks(StockProdutoDia s){
        if (s != null) {
            stockProdutoDias.add(s);
        }
    }


    public void adicionarVoluntario(Ator v) {
        if (v != null) {
            voluntarios.add(v);
        }
    }

    public Barraca(String nomebarraca, double vendas, List<Ator> voluntarios, List<StockProdutoDia> stockProdutoDias){
        this.nomebarraca=nomebarraca;
        this.voluntarios=new ArrayList<>();
        this.stockProdutoDias = new ArrayList<>();
    }

    public String getNomebarraca() {
        return nomebarraca;
    }

    public List<Ator> getVoluntarios() {
        return voluntarios;
    }

    public List<StockProdutoDia> getStocks() {
        return stockProdutoDias;
    }

    public double getVendas() {
        return vendas;
    }

    public void setNomebarraca(String nomebarraca) {
        this.nomebarraca = nomebarraca;
    }

    public void setVoluntarios(List<Ator> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public void setStocks(List<StockProdutoDia> stockProdutoDias) {
        this.stockProdutoDias = stockProdutoDias;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        return "Barraca:" +nomebarraca+ ", Voluntarios" +voluntarios;

    }

    @Override
    public Classificacao calcularVendasVoluntarios() {
        if(vendas<500){
            return Classificacao.Bronze;
        }
        if(vendas>=500 && vendas<=100){
            return Classificacao.Prata;
        }
        else {
            return Classificacao.Ouro;
        }
    }
}
