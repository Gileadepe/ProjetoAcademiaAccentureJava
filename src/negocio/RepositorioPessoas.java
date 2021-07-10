package negocio;

import dados.RepositorioException;

import java.util.List;

public interface RepositorioPessoas {

    public void inserirAluno(Aluno x) throws RepositorioException;
    public void inserirProfessor(Professor x) throws RepositorioException;
    public Aluno procurarAluno(String numCPF) throws Exception;
    public List<Aluno> listAlunos() throws Exception;
    public Professor procurarProfessor(String numCPF) throws Exception;
    public List<Professor> listProfessores() throws Exception;
    public void removerAluno(String numCPF) throws Exception;
    public void removerProfessor(String numCPF) throws Exception;
}
