import java.util.Arrays;

public class Professor extends Pessoa {

    public Professor(String nome, String endereço) {
        super(nome, endereço);
    }

    private int numCursos;
    private String[] cursos;

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

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", endereço='" + endereço + '\'' +
                ", cursos=" + Arrays.toString(cursos) +
                '}';
    }
}
