package AppPackage;

public class ButterflyTama extends Tamagotchi {
    ButterflyTama(String nome){
        super.name = nome;
        super.setFood("fruta");
    }

    void characteristic(){
        System.out.println(", *flap*");
    }
}
