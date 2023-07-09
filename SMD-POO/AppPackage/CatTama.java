package AppPackage;

public class CatTama extends Tamagotchi {
    CatTama(String nome){
        this.name = nome;
        setFood("peixe");
    }

    void characteristic(){
        System.out.println(", Miau!");
    }
}
