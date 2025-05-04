import java.util.*;

public class Barraca extends Federaçao implements StocksFinaisDiariosBarracas, VendasVoluntarios {

    int voluntario;
    int stock;
    double vendas;

    private static final int numero_min_funcionarios = 2;

    enum Classificacao{
        Bronze, Prata, Ouro
    }


    public Barraca(int voluntario, int stock, double vendas){
        this.voluntario=voluntario;
        this.stock=stock;
        this.vendas=vendas;
    }

    public int getVoluntario() {
        return voluntario;
    }

    public void setVoluntario(int voluntario) {
        this.voluntario = voluntario;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Barraca{" +
                "voluntario=" + voluntario +
                ", stock=" + stock +
                ", vendas=" + vendas +
                '}';
    }

    @Override
    public Classificacao calcularStocksFinaisDiariosBarracas() {
        if(stock>100) {
            return Classificacao.Bronze;
        }
        if(stock>=50 && stock<=100){
            return Classificacao.Prata;
        }
        else {
            return Classificacao.Ouro;
        }

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
