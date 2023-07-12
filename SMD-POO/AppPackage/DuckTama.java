package AppPackage;

public class DuckTama extends Tamagotchi {
    DuckTama(String nome){
    	super(nome);
        setFood("uva");
    }

    public void characteristic(){
        System.out.println(", Quack!");
    }
}
