import java.util.Arrays;

public class RepositorioPessoasArray {
    private Pessoa [] pessoas;
    private int indice;

    public RepositorioPessoasArray(int tamanho){
        indice = 0;
        pessoas = new Pessoa[tamanho];
    }

    public RepositorioPessoasArray(Pessoa[] pessoas, int indice) {
        this.pessoas = pessoas;
        this.indice = indice;
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void inserir(Pessoa pessoa){
        pessoas[indice] = pessoa;
        indice = indice + 1;

    }

    public Pessoa procurar(String numCpf){
        Pessoa procurado = null;
        for (int i = 0; i<indice;i++){
            Pessoa aux = this.pessoas[i];
            if(aux.getCpf().equals(numCpf)){
                procurado = aux;
            }
        }

        return procurado;
    }

    public void remover(String numCpf){
        for (int i = 0; i<indice; i++){
            Pessoa aux = this.pessoas[i];
            if (aux.getCpf().equals(numCpf)){

                this.pessoas[i] = this.pessoas[indice - 1];
                this.pessoas[indice - 1] = null;
                indice =  indice - 1;
            }
        }

    }

    @Override
    public String toString() {
        return "RepositorioPessoasArray |" +
                "\n Pessoas: "+ Arrays.toString(pessoas)+
                "\n Indice: "+ indice;
    }
}
