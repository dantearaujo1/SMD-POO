package AppPackage;

public class CatTama extends Tamagotchi {
    CatTama(String nome){
        super.name = nome;
        super.setFood("peixe");
    }

    void characteristic(){
        System.out.println(", Miau!");
    }
}
