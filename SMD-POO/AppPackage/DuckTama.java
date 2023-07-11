package AppPackage;

public class DuckTama extends Tamagotchi {
    DuckTama(String nome){
    	super(nome);
      setFood("uva");
      this.health = new Meter(100,-5);
      this.happiness = new Meter(90,0);
      this.hunger = new Meter(0,10);
      this.tiredness = new Meter(0,-6);
      this.poop = new Meter(0,-5);
    }

    public void characteristic(){
        System.out.println("Quack! Psyayay!");
        this.state.showState((Tamagotchi) this);
    }
}
