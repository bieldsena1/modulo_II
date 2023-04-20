public class Main {
    public static void main(String[] args) {
        Inimigo inimigo1 = new Inimigo(180, 55, 90, "Jax");
        Inimigo inimigo2 = new Inimigo(60, 20, 50, "Lulu");
        Heroi heroi1 = new Heroi(70, 5, 60);
        Mapa mapa1 = new Mapa("Sumunners rift", 700, 800);

        mapa1.inimigos.add(inimigo1);
        mapa1.inimigos.add(inimigo2);

        System.out.println(inimigo1.getAtaque());
        inimigo1.setAtaque(5);
        System.out.println(inimigo1.getAtaque());
        System.out.println("Defesa do " + inimigo1.nome + " é " + inimigo1.getDefesa());
        Inimigo maiorAtaque = mapa1.getInimigoMaiorAtaque();
        System.out.println(maiorAtaque.getAtaque());

        mapa1.setNome("Sumunners rift");
        System.out.println(mapa1.getNome());

        heroi1.getPontos();
        System.out.println(heroi1.getPontos());
        heroi1.setPontos(100); // Alteração dos pontos.
        System.out.println(heroi1.getPontos());
    }
}