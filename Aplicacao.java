import java.util.Arrays;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {

        Estudante estudante1 = new Estudante("Fulano", "Rua Professor dos Alunos, 123");
        Estudante estudante2 = new Estudante("Beltrano", "Rua Avenida Professor José dos Anjos, 464");
        Estudante estudante3 = new Estudante("Sicrano", "Rua Teste de Software, 555");
        Estudante estudante4 = new Estudante("Belchior", "Rua Engenheiro de Arquitetura, 464");

        Professor professor1 = new Professor("Girafales", "Rua do Papagaio");
        Professor professor2 = new Professor("Godines", "Rua do Cachorro Louco");


        professor1.setCursos(new String[] {"Java", "C++"});
        professor2.setCursos(new String[] {"PHP", "Python"});

        Curso java = new Curso(professor1, Arrays.asList(estudante1, estudante2, estudante3), "Java");
        Curso php = new Curso(professor2, Arrays.asList(estudante1, estudante4), "PHP");
        Curso python = new Curso(professor1, Arrays.asList(estudante1, estudante2, estudante3, estudante4), "Python");

        Curso[] cursos = {java, php, python};

        for (Curso curso : cursos) {
            System.out.println(curso);
        }

        System.out.println("\n");
        System.out.println("\n");

        imprimir(Arrays.asList(java, php, python));
    }

    static void imprimir(List<Curso> cursos) {

        for (Curso curso : cursos) {
            String listaAlunos = curso.getAlunos();
            System.out.println("Curso: " + curso.getNome());
            System.out.println("Professor: " + curso.getProfessor().getNome());
            System.out.println("Alunos:" + listaAlunos);
        }
    }
}
