public class Principal_2 {

    public static void main(String[] args) {

        Aluno_2 a1 = new Aluno_2();
        Aluno_2 a2 = new Aluno_2();

        Disciplina d1 = new Disciplina();
        Disciplina d2 = new Disciplina();

        a1.nome = "Lucas";
        a1.matricula = 829456;
        a1.disciplinaMatriculada = d1;

        a2.nome = "Mariana";
        a2.matricula = 687954;
        a2.disciplinaMatriculada = d2;

        d1.nome = "Lógica de programação";
        d1.cargaHoraria = 240;

        d2.nome = "Programação Orientada a Objetos";
        d2.cargaHoraria = 360;

        System.out.println(
                "\nNome: " +a1.nome +
                "\nMatrícula: "+ a1.matricula +
                "\nNome da disciplina: " +a1.disciplinaMatriculada.nome+
                "\nCarga horária: " + a1.disciplinaMatriculada.cargaHoraria
        );

        System.out.println(
                "\nNome: " + a2.nome +
                "\nMatrícula: " + a2.matricula +
                "\nNome da disciplina: " + a2.disciplinaMatriculada.nome +
                "\nCarga horária: " + a2.disciplinaMatriculada.cargaHoraria);

    }
}