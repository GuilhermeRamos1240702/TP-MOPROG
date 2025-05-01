public class Barraca extends Federaçao {

    int voluntario;

    private static final int numero_min_funcionarios = 2;

    public Barraca(int voluntario){
        this.voluntario=voluntario;
    }

    public int getVoluntario() {
        return voluntario;
    }

    public void setVoluntario(int voluntario) {
        this.voluntario = voluntario;
    }
}
