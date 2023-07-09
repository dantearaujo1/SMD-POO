package AppPackage;
import java.util.ArrayList;

import AppPackage.states.NormalState;
import AppPackage.states.TamagotchiState;

public abstract class Tamagotchi {
    String name;
    private Meter health;
    private Meter happiness;
    private Meter hunger;
    private Meter poop;
    private Player owner;
    private Food favoriteFood;
    ArrayList<Acessory> things = new ArrayList<Acessory>();
    TamagotchiState state;

    public void characteristic(){
        
    }
    
    public Tamagotchi(String name) {
    	this.name = name;
    	this.state = new NormalState(); 
    }

    public void feed(String food){
    	this.state.feed(this,food);
        if(food.equals(this.favoriteFood.getName())){
            this.hunger.ModPercentage(2.5f);
            System.out.print("Tamagotchi: Muito gostoso!");
            characteristic();
        }
        else{
            this.hunger.ModPercentage(1.0f);
            System.out.print("Tamagotchi: Pelo menos mata a fome...");
        }
    }

    public void sleep(){
    	this.state.sleep(this);
        this.health.ModPercentage(1.5f);
        System.out.print("Tamagotchi: ZzZzZz...");
    }

    public void clean(){
    	this.state.clean(this);
        this.poop.ModPercentage(5.0f);
        System.out.print("Tamagotchi: Me sinto muito mais limpo!");
        characteristic();
    }

    public void play(){
    	this.state.play(this);
        this.happiness.ModPercentage(1.5f);
        System.out.print("Tamagotchi: *Sons de felicidade digital*");
        characteristic();
    }

    public Meter getHealthMeter(){
        return this.health;
    }

    public Meter getHungerMeter(){
        return this.hunger;
    }

    public Meter getHappinessMeter(){
        return this.happiness;
    }

    public Meter getPoopMeter(){
        return this.poop;
    }

    public Player getOwner(){
        return this.owner;
    }	
	public String getName() {
		return this.name; 
	}
	public Food getFavoriteFood() {
		return this.favoriteFood; 
	}
    public void setName(String name) {
	  this.name =  name;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}
    protected void setFood(String comida){
        this.favoriteFood.setName(comida);
    }

    void addAcessory(Acessory a){
        this.things.add(a);
        this.health.setBonusmod(a.getHealthMod());
        this.hunger.setBonusmod(a.getHungerMod());
        this.poop.setBonusmod(a.getPoopMod());
        this.happiness.setBonusmod(a.getHappinessMod());
    }

}
