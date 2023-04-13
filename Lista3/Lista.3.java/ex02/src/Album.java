import java.util.ArrayList;

public class Album {
    String nome;
    String nomeArtista;
    ArrayList<Musica> musicas = new ArrayList<>();

    public Album(String nome, String nomeArtista, ArrayList<Musica> musicas) {
        this.nome = nome;
        this.nomeArtista = nomeArtista;
        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    // Função para saber a música com a maior popularidade do álbum
    public Musica getMusicaMaiorPopularidade() {
        Musica musicaMaiorPopularidade = null;
        int popularidadeMaxima = Integer.MIN_VALUE;
        for (Musica musica : musicas) {
            if (musica.getPopularidade() > popularidadeMaxima) {
                popularidadeMaxima = musica.getPopularidade();
                musicaMaiorPopularidade = musica;
            }
        }
        return musicaMaiorPopularidade;
    }

    // Função para saber a música com a menor duração do álbum
    public Musica getMusicaMenorDuracao() {
        Musica musicaMenorDuracao = null;
        int duracaoMinima = Integer.MAX_VALUE;
        for (Musica musica : musicas) {
            if (musica.getDuracaoEmSegundos() < duracaoMinima) {
                duracaoMinima = musica.getDuracaoEmSegundos();
                musicaMenorDuracao = musica;
            }
        }
        return musicaMenorDuracao;
    }
}