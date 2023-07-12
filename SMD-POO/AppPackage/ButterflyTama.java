package AppPackage;

public class ButterflyTama extends Tamagotchi {
    ButterflyTama(String nome){
    	super(nome);
        setFood("fruta");
    }

    public void characteristic(){
        System.out.println(", *flap*");
    }
}
