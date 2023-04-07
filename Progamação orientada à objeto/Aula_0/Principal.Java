public class Principal{
    public static void matricularAluno(Aluno aluno){
        int endereco = Arquivos.AbrirArquivo("alunos.txt", Arquivos.ACRESCENTAR)

        Arquivos.escrever_linha(aluno.nome);
        Arquivos.escrever_linha(aluno.cpf);
        Arquivos.fechar_arquivo(endereco);
        
    }
     public static void main(String[] args){
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Matheus";

        if(aluno1.estaMatriculado){
            System.out.println("Aluno já está matriculado");
        }else{

        }
    }
}