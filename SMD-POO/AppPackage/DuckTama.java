package AppPackage;

public class DuckTama extends Tamagotchi {
    DuckTama(String nome){
        super.name = nome;
        super.setFood("uva");
    }

    void characteristic(){
        System.out.println(", Quack!");
    }
}
