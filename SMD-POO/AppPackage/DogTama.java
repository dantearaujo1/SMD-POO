package AppPackage;

public class DogTama extends Tamagotchi {
    DogTama(String nome){
        this.name = nome;
        setFood("carne");
    }

    void characteristic(){
        System.out.println(", Au!");
    }
}
