public class ClasseTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Curso c1 = new Curso(654,"Mecanica");
        Aluno a2 = new Aluno("Gileade","111.222.333-00",30, c1);
        Aluno a3 = new Aluno("Eustáquio","888.999.555-11");
        Curso c2 = new Curso();

        RepositorioPessoasArray r =  new RepositorioPessoasArray(5);

        r.inserir(a2);
        r.inserir(a3);
        Pessoa procurado = r.procurar("111.222.333-00");
        System.out.println("Aluno procurado: "+ procurado.getNome());

        procurado = r.procurar("888.999.555-11");
        if (procurado == null){
            System.out.println("Não existe um aluno com o CPF informado!");
        }else {
            r.remover("888.999.555-11");
            System.out.println("Aluno : "+ procurado.getNome()+ " Removido com sucesso!");
        }


        a1.setNome("João");
        a1.setCpf("256.354.857-00");
        a1.setIdade(25);

        c2.setCodigo(123);
        c2.setNome("Informática");

        System.out.println("Aluno Nome: "+a1.getNome()+" Cpf: "+a1.getCpf()+" Idade: "+a1.getIdade()+
                " Curso > Código "+c1.getCodigo()+ " Nome do Curso: "+c1.getNome());

        System.out.println(a2.toString());
    }
}
