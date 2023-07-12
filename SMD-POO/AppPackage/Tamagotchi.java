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

    public void addAcessory(Acessory a){
      String name = a.getClass().getSimpleName();
      if (!things.containsKey(name)){
        things.put(name,a);
        a.apply(this);
        System.out.println("Adicionando: " + a.getClass().getSimpleName() );
      }
      else{
        System.out.println(this.getName() + " ja tem esse acessório!");
      }
    }

    public void removeAcessory(Acessory a){
      if (things.containsKey(name)){
        Acessory using = things.get(a.getClass().getSimpleName());
        using.remove(this);
        System.out.println("Removendo: " + a.getClass().getSimpleName() );
      }
      else{
        System.out.println(this.getName() + "não tem esse acessório ainda!");
      }
    }

    public void deteriorate(){
        this.happiness.ModPercentage(-0.8f);
        this.tiredness.ModPercentage(0.4f);
        this.poop.ModPercentage(0.2f);
        this.health.ModPercentage(-0.1f);
        this.hunger.ModPercentage(0.3f);
    }

}
