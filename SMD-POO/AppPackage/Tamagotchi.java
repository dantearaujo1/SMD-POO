package AppPackage;
import java.util.ArrayList;

public abstract class Tamagotchi {
    String name;
    private Meter health;
    private Meter happiness;
    private Meter hunger;
    private Meter poop;
    private String owner;
    private Food favouritefood;
    ArrayList<Acessory> things = new ArrayList<Acessory>();
    TamagotchiState state;

    void characteristic(){
        
    }

    void feed(String food){
        if(food.equals(this.favouritefood.getName())){
            this.hunger.ModPercentage(2.5f);
            System.out.print("Tamagotchi: Muito gostoso!");
            characteristic();
        }
        else{
            this.hunger.ModPercentage(1.0f);
            System.out.print("Tamagotchi: Pelo menos mata a fome...");
        }
    }

    void sleep(){
        this.health.ModPercentage(1.5f);
        System.out.print("Tamagotchi: ZzZzZz...");
    }

    void clean(){
        this.poop.ModPercentage(5.0f);
        System.out.print("Tamagotchi: Me sinto muito mais limpo!");
        characteristic();
    }

    void play(){
        this.happiness.ModPercentage(1.5f);
        System.out.print("Tamagotchi: *Sons de felicidade digital*");
        characteristic();
    }

    Meter getHealthMeter(){
        return this.health;
    }

    Meter getHungerMeter(){
        return this.hunger;
    }

    Meter getHappinnessMeter(){
        return this.happiness;
    }

    Meter getPoopMeter(){
        return this.poop;
    }

    String getOwner(){
        return this.owner;
    }

    void addAcessory(Acessory a){
        this.things.add(a);
        this.health.setBonusmod(a.getHealthMod());
        this.hunger.setBonusmod(a.getHungerMod());
        this.poop.setBonusmod(a.getPoopMod());
        this.happiness.setBonusmod(a.getHappinessMod());
    }

    protected void setFood(String comida){
        this.favouritefood.setName(comida);
    }
}
