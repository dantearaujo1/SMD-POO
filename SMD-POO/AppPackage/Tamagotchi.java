package AppPackage;
import java.util.ArrayList;

import AppPackage.states.NormalState;
import AppPackage.states.TamagotchiState;

public abstract class Tamagotchi {
    String name;
    private Meter health = new Meter();
    private Meter happiness = new Meter();
    private Meter hunger = new Meter();
    private Meter poop = new Meter();
    private Player owner;
    private Food favoriteFood = new Food();
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
//        if(food.equals(this.favoriteFood.getName())){
//            this.hunger.ModPercentage(2.5f);
//            System.out.print(name + ": ");
//            System.out.print("Muito gostoso!");
//            characteristic();
//        }
//        else{
//            this.hunger.ModPercentage(1.0f);
//            System.out.print(name + ": ");
//            System.out.print("Pelo menos mata a fome...");
//            characteristic();
//        }
    }

    public void sleep(){
    	this.state.sleep(this);
//        this.health.ModPercentage(1.5f);
//        System.out.print("Tamagotchi: ZzZzZz...");
    }

    public void clean(){
    	this.state.clean(this);
//        this.poop.ModPercentage(5.0f);
//        System.out.print(name + ": ");
//        System.out.print("Me sinto muito mais limpo!");
//        characteristic();
    }

    public void play(){
    	this.state.play(this);
//        this.happiness.ModPercentage(1.5f);
//        System.out.print(name + ": ");
//        System.out.print("*Sons de felicidade digital*");
//        characteristic();
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

	public void setOwner(Player ownerplayer) {
		this.owner = ownerplayer;
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

    void deteriorate(){
        this.health.ModPercentage(-0.5f);
        this.hunger.ModPercentage(-1.5f);
        this.poop.ModPercentage(-1.0f);
        this.happiness.ModPercentage(-0.5f);
    }

}
