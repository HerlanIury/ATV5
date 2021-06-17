import java.util.Arrays;

public class Estudante extends Pessoa {

    private int numCursos;
    private String[] cursos;
    private int[] notas;

    public Estudante(String nome, String endereco) {
        super(nome, endereco);
    }

    public int getNumCursos() {
        return numCursos;
    }

    public void setNumCursos(int numCursos) {
        this.numCursos = numCursos;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "notas=" + Arrays.toString(notas) +
                ", nome='" + nome + '\'' +
                ", endereço='" + endereço + '\'' +
                '}';
    }
}
