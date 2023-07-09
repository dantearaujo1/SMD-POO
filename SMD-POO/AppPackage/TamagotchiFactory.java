package AppPackage;

public class TamagotchiFactory {
    static int count = 0;

    static Tamagotchi create(String type, String name){
        count++;
        if(type.equals("pato")){
            DuckTama quack = new DuckTama(name);
            return quack;
        }
        else if(type.equals("cachorro")){
            DogTama woof = new DogTama(name);
            return woof;
        }
        else if(type.equals("gato")){
            CatTama meow = new CatTama(name);
            return meow;
        }
        else if(type.equals("borboleta")){
            ButterflyTama flap = new ButterflyTama(name);
            return flap;
        }
        else{
            System.out.println("Tama Invalido!");
            count--;
            return null;
        }
    }
}
