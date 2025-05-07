import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Barraca extends Federaçao implements VendasVoluntarios {

    private String nomebarraca;
    private List<Atores> voluntarios;
    private double vendas;

    private static final int numero_min_funcionarios = 2;

    enum Classificacao{
        Bronze, Prata, Ouro
    }

    public void adicionarVoluntario(Atores v) {
        if (v != null) {
            voluntarios.add(v);
        }
    }

    public Barraca(String nomebarraca, double vendas, List<Atores> voluntarios){
        this.nomebarraca=nomebarraca;
        this.voluntarios=new ArrayList<>();
    }

    public String getNomebarraca() {
        return nomebarraca;
    }

    public List<Atores> getVoluntarios() {
        return voluntarios;
    }

    public double getVendas() {
        return vendas;
    }

    public void setNomebarraca(String nomebarraca) {
        this.nomebarraca = nomebarraca;
    }

    public void setVoluntarios(List<Atores> voluntarios) {
        this.voluntarios = voluntarios;
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
