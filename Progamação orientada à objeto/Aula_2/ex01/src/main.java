
public class main {
    public static string saberCategoriaPorIdade(int idade) {
        String categoria;

        if (idade >= 5 && idade <=7){
            categoria = "Infantil A";
        }else if (idade >=8 && idade <=10){
            categoria = "Infatil B";
        }else if (idade >=11 && idade <= 13){
            categoria = "Juvenil A";
        }else if (idade >=14 && idade <= 17){
            categoria = "Juvenil B";
        } else if (idade >= 18) {
            categoria = "Adulto";
        }else {
            categoria = "Idade inválida";
        }
        return categoria
    }
    public static void main(string[] args)`{
        int idade = 16;
        String categoria = obterCategoria(idade);
        System.out.println("O nadador com idade " + idade + " faz parte da categoria " + categoria);
    }
}
