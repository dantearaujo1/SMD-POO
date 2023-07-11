package AppPackage;

import AppPackage.states.NormalState;

public class DogTama extends Tamagotchi {
    DogTama(String nome){
    	super(nome);
      setFood("carne");
      this.health = new Meter(100,0);
      this.happiness = new Meter(100,0.5f);
      this.hunger = new Meter(0,0);
      this.tiredness = new Meter(0,0);
      this.poop = new Meter(0,0);
    }

    public void characteristic(){
        System.out.println(this.getName() + " : Au Au!");
        this.state.showState((Tamagotchi) this);
    }
}
