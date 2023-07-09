package AppPackage;

public class App{
    public static void main(String args[]){
        Player joao = new Player("joao");
        joao.adoptTama("butterfly", "cerejinha");
        int id = joao.findTama("cerejinha");
        Tamagotchi t = joao.tamagotchis.get(id);
        t.setFood("uva");
        joao.feed("cerejinha", "uva");
        Acessory bola_de_ouro = new Ball();
        joao.tamagotchis.get(0).addAcessory(bola_de_ouro);
        joao.playAll();
        joao.feedAll("fruta");
    }
}

