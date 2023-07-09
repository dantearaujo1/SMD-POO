package AppPackage;

public class DogTama extends Tamagotchi {
    DogTama(String nome){
    	super(nome);
        setFood("carne");
    }

    public void characteristic(){
        System.out.println(", Au!");
    }
}
