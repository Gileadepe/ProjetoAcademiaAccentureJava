package negocio;

public interface RepositorioPessoas {

    public void inserir(Pessoa x);

    public Pessoa procurarString(String numCpf);

    public void remover(String numCpf);
}
