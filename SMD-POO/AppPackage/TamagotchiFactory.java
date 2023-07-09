package AppPackage;

public class TamagotchiFactory {
    static int count = 0;

    Tamagotchi create(String type, String name){
        count++;
        if(type.equals("duck")){
            DuckTama quack = new DuckTama(name);
            return quack;
        }
        else if(type.equals("dog")){
            DogTama woof = new DogTama(name);
            return woof;
        }
        else if(type.equals("cat")){
            CatTama meow = new CatTama(name);
            return meow;
        }
        else if(type.equals("butterfly")){
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
