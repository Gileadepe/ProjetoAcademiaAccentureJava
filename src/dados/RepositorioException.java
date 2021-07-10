package dados;

public class RepositorioException extends Exception {

    private static final long serialVersionUID = 1L;

    public RepositorioException(){
        super("Já exisite um cadastro com esse CPF!");
    }
}
