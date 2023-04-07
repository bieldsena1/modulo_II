public class Aluno{
    String nome;
    String cpf;
    Boolean estaMatriculado;

    public  void matricularAluno(string nomeArquivo){
        if(this.estaMatriculado == true){
            System.out.println("Aluno já está matriculado");
            return
        }
        int endereco = Arquivos.AbrirArquivo(nomeArquivo, Arquivos.ACRESCENTAR)

        Arquivos.escrever_linha(this.nome);
        Arquivos.escrever_linha(this.cpf);
        Arquivos.fechar_arquivo(endereco);
        
    }
}