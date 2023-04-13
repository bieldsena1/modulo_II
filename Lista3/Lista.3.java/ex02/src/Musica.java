import java.util.ArrayList;
public class Musica {
    String nome;
    int duracaoEmSegundos;
    int popularidade;
    String genero;

    public Musica(String nome, int duracaoEmSegundos, int popularidade, String genero) {
        this.nome = nome;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.popularidade = popularidade;
        this.genero = genero;
    }
    public String getNome() {
        return nome;
    }
    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }
    public int getPopularidade() {
        return popularidade;
    }
    public String getGenero() {
        return genero;
    }
}