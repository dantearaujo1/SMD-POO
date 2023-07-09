package AppPackage;

public class CatTama extends Tamagotchi {
    CatTama(String nome){
    	super(nome);
        setFood("peixe");
    }

    public void characteristic(){
        System.out.println(", Miau!");
    }
}
