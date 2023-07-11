package AppPackage;

public class ButterflyTama extends Tamagotchi {
    ButterflyTama(String nome){
    	super(nome);
      setFood("fruta");
      this.health = new Meter(70,-0.5f);
      this.happiness = new Meter(80,0);
      this.hunger = new Meter(0,-0.5f);
      this.tiredness = new Meter(0,-0.2f);
      this.poop = new Meter(0,-0.1f);
    }

    public void characteristic(){
        System.out.println("Som das asas de " + this.getName() + "*flap flap*");
        this.state.showState((Tamagotchi) this);
    }
}
