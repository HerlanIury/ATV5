import java.util.List;

public class Curso {

    private String nome;
    private Professor professor;
    private List<Estudante> estudantes;

    public Curso(Professor professor, List<Estudante> estudantes, String nome) {
        this.professor = professor;
        this.estudantes = estudantes;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public String getAlunos() {
        String resposta = "";
        if (!estudantes.isEmpty()) {
            for (Estudante estudante : estudantes) {
                resposta += estudante.getNome() + "\n";
            }
        }
        return "\n" + resposta;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", professor=" + professor +
                ", estudantes=" + estudantes +
                '}';
    }
}
