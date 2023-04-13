public class Inimigo {
    private int ataque;
    private int defesa;
    private int pontos;

    public Inimigo(int ataque, int defesa, int pontos) {
        this.ataque = ataque;
        this.defesa = defesa;
        this.pontos = pontos;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getPontos() {
        return pontos;
    }
}
