package AppPackage;

public class TamagotchiFactory {
    static int count = 0;

    static Tamagotchi create(String type, String name){
        Tamagotchi t = null;
        if(type.equals("duck")){
            t = new DuckTama(name);
        }
        else if(type.equals("dog")){
            t = new DogTama(name);
        }
        else if(type.equals("cat")){
            t = new CatTama(name);
        }
        else if(type.equals("butterfly")){
            t = new ButterflyTama(name);
        }
        else {
			System.out.println("Tama Invalido!");
			return null;
        }
        count++;
		System.out.printf("Ja nasceram um total de %d Mascotes Digitais no seu Mundo!\n", count);
		return t;
    }
}
