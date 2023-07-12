package AppPackage;

public class DuckTama extends Tamagotchi {
    DuckTama(String nome){
    	super(nome);
      setFood("uva");
      this.health = new Meter(100,-0.5f);
      this.happiness = new Meter(90,0);
      this.hunger = new Meter(0,1);
      this.tiredness = new Meter(0,-0.6f);
      this.poop = new Meter(0,-0.5f);
    }

    public void characteristic(){
        System.out.println("Quack! Psyayay!");
        this.state.showState((Tamagotchi) this);
    }
}
