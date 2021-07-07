package negocio;

public class Aluno extends Pessoa {
    private Curso curso;

    public Aluno(String nome, String cpf, int idade, Curso curso) {
        super(nome, cpf, idade);
        this.curso = curso;
    }

    public Aluno(String nome, String cpf) {

        super(nome, cpf);
    }

    public Aluno() {
    }


    public Curso getCurso() {

        return curso;
    }

    public void setCurso(Curso curso) {

        this.curso = curso;
    }

    @Override
    public String toString() {
        return "\n negocio.Aluno | " +
                "\n Nome: "+this.getNome()+
                "\n CPF: "+this.getCpf()+
                "\n Idade: "+this.getIdade()+
                "\n "+ curso;
    }
}
