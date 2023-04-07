import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas participantes: ");
        int pessoas;
        pessoas = input.nextInt();
        double salario, somaSalario = 0, maiorSalario = 0;
        int numFilhos, somaFilhos = 0;

        for (int i = 1; i <= pessoas; i++) {
            System.out.println("Digite o salário do habitante " + i + ":");
            salario = input.nextDouble();
            System.out.println("Digite o número de filhos do habitante " + i + ":");
            numFilhos = input.nextInt();

            somaSalario += salario;
            somaFilhos += numFilhos;
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
        }

        double mediaSalario = somaSalario / pessoas;
        double mediaFilhos = (double) somaFilhos / pessoas;

        System.out.println("A média do salário da população é: " + mediaSalario);
        System.out.println("A média do número de filhos por habitante é: " + mediaFilhos);
        System.out.println("O maior salário entre os habitantes é: " + maiorSalario);
    }
}