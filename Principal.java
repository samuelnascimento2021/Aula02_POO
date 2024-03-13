public class Principal {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Victor", 852515, 8, 6, 9, 7, 10);
        Aluno a2 = new Aluno("Paulo", 852516, 7, 9, 6, 10, 5);

        System.out.println("\nNome: " +a1.nome+"\nMatricula: "+a1.matricula+"\nNota Mat: "+a1.nota_mat+"\nNota Port: "+a1.nota_por+"\nNota Fis: "+a1.nota_fis+"\nNota Geo: "+a1.nota_geo+"\nNota Quim: "+a1.nota_quim);

        System.out.println("\nMédia das notas: " + a1.calcularMedia());
        System.out.println(a1.situacaoAluno());

        System.out.println("\nNome: " +a2.nome+"\nMatricula: "+a2.matricula+"\nNota Mat: "+a2.nota_mat+"\nNota Port: "+a2.nota_por+"\nNota Fis: "+a2.nota_fis+"\nNota Geo: "+a2.nota_geo+"\nNota Quim: "+a2.nota_quim);

        System.out.println("\nMédia das notas: " + a2.calcularMedia());
        System.out.println(a2.situacaoAluno());

    }
}