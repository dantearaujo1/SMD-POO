package AppPackage;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

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
    public Map<String,Acessory> things = new HashMap<>();
    public TamagotchiState state;

    public abstract void characteristic();

    public Tamagotchi(String name) {
    	this.name = name;
    	this.state = new NormalState();
    }

    public void feed(String food){
    	this.state.feed(this,food);
    }

    public void sleep(){
      this.state.sleep(this);
    }

    public void clean(){
    	this.state.clean(this);
    }

    public void play(){
    	this.state.play(this);
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
      things.put(a.getClass().getSimpleName(),a);
      a.apply(this);
    }

    void removeAcessory(Acessory a){
      Acessory using = things.get(a.getClass().getSimpleName());
      using.remove(this);
    }

}
