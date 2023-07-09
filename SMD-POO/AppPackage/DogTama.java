package AppPackage;

public class DogTama extends Tamagotchi {
    DogTama(String nome){
        super.name = nome;
        super.setFood("carne");
    }

    void characteristic(){
        System.out.println(", Au!");
    }
}
