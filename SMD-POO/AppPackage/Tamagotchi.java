package AppPackage;
import java.util.ArrayList;

import AppPackage.states.NormalState;
import AppPackage.states.TamagotchiState;

public abstract class Tamagotchi {
    private String name;
    protected Meter health = new Meter();
    protected Meter happiness = new Meter();
    protected Meter hunger = new Meter();
    protected Meter poop = new Meter();
    protected Meter tiredness = new Meter();
    private Player owner;
    private Food favoriteFood = new Food();
    public ArrayList<Acessory> things = new ArrayList<Acessory>();
    public TamagotchiState state;

    public void characteristic(){

    }

    public Tamagotchi(String name) {
    	this.name = name;
    	this.state = new NormalState();
    }

    public void feed(String food){
    	this.state.feed(this,food);
      characteristic();
    }

    public void sleep(){
      this.state.sleep(this);
      characteristic();
    }

    public void clean(){
    	this.state.clean(this);
      characteristic();
    }

    public void play(){
    	this.state.play(this);
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
    public Meter getTirednessMeter(){
        return this.tiredness;
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

    // void deteriorate(){
    //     this.health.ModPercentage(-0.5f);
    //     this.hunger.ModPercentage(-1.5f);
    //     this.poop.ModPercentage(-1.0f);
    //     this.happiness.ModPercentage(-0.5f);
    // }

}
