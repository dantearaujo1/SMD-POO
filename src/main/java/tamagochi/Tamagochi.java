package tamagochi;

import java.util.ArrayList;

import tamagochi.states.TamagochiState;

public abstract class Tamagochi {

    private String                   name;
    private Integer                  health;
    private Integer                  happiness;
    private Integer                  hunger;
    private Integer                  poop;
    private Player                   owner;
    private TamagochiState           state;

    public Food                      favoriteFood;
    public ArrayList<TamagochiState> tamagochiState;
    public ArrayList<Player>         player;
    public ArrayList<Accessory>      accessory;
    public ArrayList<Food>           food;

	public abstract void feed(Food food);

	public abstract void sleep();

	public abstract void clean();

	public abstract void play();

	public String getName() {
	  return name;
	}

	public Integer getHealth() {
	  return health;
	}

	public Integer getHappiness() {
	  return happiness;
	}

	public Integer getHunger() {
	  return hunger;
	}

	public Integer getPoop() {
	  return poop;
	}
	public void setName(String name) {
	  this.name =  name;
	}

	public void setHealth(Integer health) {
	  if (health < 0 ) {
		  this.health = 0;
	  }
	  this.health = health;
	}

	public void setHappiness(int happiness) {
	  if (happiness < 0 ) {
		  this.happiness = 0;
	  }
	  this.happiness = happiness;
	}

	public void setHunger(int hunger) {
	  if (hunger < 0 ) {
		  this.hunger = 0;
	  }
	  this.hunger = hunger;
	}

	public void setPoop(int poop) {
	  if (poop < 0 ) {
		  this.poop = 0;
	  }
	  this.poop = poop;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public TamagochiState getState() {
		return state;
	}

	public void setState(TamagochiState state) {
		this.state = state;
	}

}