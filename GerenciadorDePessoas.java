package aula8;

public class GerenciadorDePessoas {
    private Pessoa pessoa1;
    private Pessoa pessoa2;

    public  cadastrarPessoa1(Pessoa pessoa){
        pessoa1.setNome("Mário Giliarde");
        pessoa1.setCpf("1234567489");
        pessoa1.setIdade(36);
    }

    public  cadastrarPessoa2(Pessoa pessoa){
        pessoa2.setNome("Maria dos Anzois");
        pessoa1.setCpf("45613789");
        pessoa1.setIdade(39);
    }

    public atualizarPessoa1(Pessoa pessoa){

    }

    public atualizarPessoa2(Pessoa pessoa){
        
    }

    
    public exibirPessoa1(Pessoa pessoa){
        pessoa1.getNome();
        pessoa1.getCpf();
        pessoa1.getIdade();
    }

    public exibirPessoa2(Pessoa pessoa){
        pessoa1.getNome();
        pessoa1.getCpf();
        pessoa1.getIdade();
}

}
