package AppPackage;

public class DuckTama extends Tamagotchi {
    DuckTama(String nome){
        this.name = nome;
        setFood("uva");
    }

    void characteristic(){
        System.out.println(", Quack!");
    }
}
