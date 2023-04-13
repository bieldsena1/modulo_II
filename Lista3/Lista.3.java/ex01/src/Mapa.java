import java.util.ArrayList;

public class Mapa {
    private String nome;
    private int altura;
    private int largura;
    private ArrayList<Inimigo> inimigos;
    private ArrayList<Heroi> herois;

    public Mapa(String nome, int altura, int largura) {
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
        this.inimigos = new ArrayList<>();
        this.herois = new ArrayList<>();
    }
    public void addInimigo(Inimigo inimigo) {
        inimigos.add(inimigo);
    }
    public void addHeroi(Heroi heroi) {
        herois.add(heroi);
    }
    public Inimigo getInimigoMaiorAtaque() {
        Inimigo inimigoMaiorAtaque = null;
        int maiorAtaque = Integer.MIN_VALUE;
        for (Inimigo inimigo : inimigos) {
            if (inimigo.getAtaque() > maiorAtaque) {
                maiorAtaque = inimigo.getAtaque();
                inimigoMaiorAtaque = inimigo;
            }
        }
        return inimigoMaiorAtaque;
    }
}