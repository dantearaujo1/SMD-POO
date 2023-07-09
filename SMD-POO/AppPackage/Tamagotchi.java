package AppPackage;
import java.util.ArrayList;

public abstract class Tamagotchi {
    String name;
    private Meter health = new Meter();
    private Meter happiness = new Meter();
    private Meter hunger = new Meter();
    private Meter poop = new Meter();
    protected String owner;
    private Food favouritefood = new Food();
    ArrayList<Acessory> things = new ArrayList<Acessory>();
    TamagotchiState state = new TamagotchiState();

    void characteristic(){
        
    }

    void feed(String food){
        if(food.equals(this.favouritefood.getName())){
            this.hunger.ModPercentage(2.5f);
            System.out.print(name + ": ");
            System.out.print("Muito gostoso!");
            characteristic();
        }
        else{
            this.hunger.ModPercentage(1.0f);
            System.out.print(name + ": ");
            System.out.print("Pelo menos mata a fome...");
            characteristic();
        }
    }

    void sleep(){
        this.health.ModPercentage(2.0f);
        System.out.print(name + ": ");
        System.out.print("ZzZzZz...");
    }

    void clean(){
        this.poop.ModPercentage(5.0f);
        System.out.print(name + ": ");
        System.out.print("Me sinto muito mais limpo!");
        characteristic();
    }

    void play(){
        this.happiness.ModPercentage(1.5f);
        System.out.print(name + ": ");
        System.out.print("*Sons de felicidade digital*");
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
