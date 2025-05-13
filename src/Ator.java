import java.util.Objects;

public abstract class Ator extends Federaçao {
    private String nome;
    private int numero;
    private String curso;
    private int password;

    public Ator(String nome, int numero, String curso, int password) {
        this.nome = nome;
        this.numero = numero;
        this.curso = curso;
        this.password = password;
    }

    public int getNumero() {
        return numero;
    }

    public int getPassword() {
        return password;
    }

    public String getCurso() {
        return curso;
    }

    public String getNome() {
        return nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString() + nome + curso + numero + password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ator ator = (Ator) o;
        return numero == ator.numero && password == ator.password && Objects.equals(nome, ator.nome) && Objects.equals(curso, ator.curso);
    }

}