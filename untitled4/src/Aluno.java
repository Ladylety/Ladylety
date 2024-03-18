public class Aluno {
    String nome;
    String matricula;
    String cpf;
    String email;

    Aluno(String nome, String matricula, String cpf, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.email = email;
    }

    void estudar(String materia) {
        System.out.println(this.nome + " está estudando " + materia);
    }

    void nota(double nota) {
        if (nota >= 6) {
            System.out.println(this.nome + " Foi aprovado");
        } else {
            System.out.println(this.nome + " Foi reprovado");
        }
    }
}

