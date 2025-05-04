import java.util.Objects;

public class Atores extends Federaçao {
    String nome;
    int numero;
    String curso;
    int password;

    public Atores(String nome, int numero, String curso, int password) {
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
        Atores atores = (Atores) o;
        return numero == atores.numero && password == atores.password && Objects.equals(nome, atores.nome) && Objects.equals(curso, atores.curso);
    }

}