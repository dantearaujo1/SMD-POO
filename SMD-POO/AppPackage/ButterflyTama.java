package AppPackage;

public class ButterflyTama extends Tamagotchi {
    ButterflyTama(String nome){
        this.name = nome;
        setFood("fruta");
    }

    void characteristic(){
        System.out.println(", *flap*");
    }
}
