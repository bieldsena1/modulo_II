import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static String categoria(int idade){
        String categoria;

        if (idade >= 5 && idade <=7){
            categoria = "Infantil A";
        }else if (idade >=8 && idade <=10){
            categoria = "Infantil B";
        }else if (idade >=11 && idade <= 13){
            categoria = "Juvenil A";
        }else if (idade >=14 && idade <= 17){
            categoria = "Juvenil B";
        } else if (idade >= 18) {
            categoria = "Adulto";
        }else {
            categoria = "Idade inválida";
        }
        return categoria;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale a idade do nadador: ");
        int idadeNadador = scanner.nextInt();
        String categoria = categoria(idadeNadador);
        System.out.println("O nadador com idade " + idadeNadador + " faz parte da categoria " + categoria);
    }
}