public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Trap the fato nós fez em 5", 80, 10000, "trap");
        Musica musica2 = new Musica("Trap the fato", 90, 150000, "trap");
        Album album1 = new Album("Trap the fato");
        album1.musicas.add(musica1);
        album1.musicas.add(musica2);

        Musica menorDuracao = album1.getMusicaMenorDuracao();
        Musica popularidade = album1.getMusicaMaiorPopularidade();

        System.out.println(menorDuracao.getDuracaoEmSegundo());
        System.out.println(popularidade.getPopularidade());
    }
}