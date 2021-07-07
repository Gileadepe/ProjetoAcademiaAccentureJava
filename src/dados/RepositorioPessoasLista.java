package dados;

import negocio.Pessoa;
import negocio.RepositorioPessoas;
import java.util.ArrayList;
import java.util.List;

public class RepositorioPessoasLista implements RepositorioPessoas {
    private List<Pessoa> pessoas;

    public void RepositorioPessoasLista(){

    }

    public RepositorioPessoasLista() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public List getPessoas() {

        return pessoas;
    }

    public void setPessoas(List pessoas) {

        this.pessoas = pessoas;
    }

    @Override
    public void inserir(Pessoa x) {
        pessoas.add(x);

    }

    @Override
    public Pessoa procurarString(String numCpf) {
        Pessoa procurada = null;
        for (Pessoa pessoa: pessoas){
            if (pessoa.getCpf().equals(numCpf))
                procurada = pessoa;

        }
        return procurada;
    }

    @Override
    public void remover(String numCpf) {
        int posicao = -1;
        for (Pessoa pessoa: pessoas){
            if (pessoa.getCpf().equals(numCpf)){
                posicao = pessoas.indexOf(pessoa);
                break;
            }
        }
        if (posicao != -1)
            pessoas.remove(posicao);

    }

    public List<Pessoa> listarPessoas(){

        return this.pessoas;
    }
}
