public class Professor extends Pessoa{
    private double salario;

    public Professor(String nome, String cpf, int idade, double salario) {
        super(nome, cpf, idade);
        this.salario = salario;
    }

    public Professor() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\n Professor |" +
                "\n Nome: "+this.getNome()+
                "\n CPF: "+this.getCpf()+
                "\n Idade: "+this.getIdade()+
                "\n Salário: "+ salario ;
    }
}
