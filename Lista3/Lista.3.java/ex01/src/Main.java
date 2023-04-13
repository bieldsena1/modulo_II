public class Main {
    public static void main(String[] args){
        Inimigo ataque1 = new Inimigo();
        ataque1.ataque = 10;
        Inimigo ataque2 = new Inimigo();
        ataque2.ataque = 12;
        Inimigo ataque3 = new Inimigo();
        ataque3.ataque = 14;

        Mapa mapa = new Mapa();
        mapa.nome = "Summuners Rift";
        mapa.inimigos.add(ataque1);
        mapa.inimigos.add(ataque2);
        mapa.inimigos.add(ataque3);
        Inimigo inimigoMaiorAtaque = mapa.getInimigoMaiorAtaque();

        System.out.println(inimigoMaiorAtaque.ataque);
    }
}
