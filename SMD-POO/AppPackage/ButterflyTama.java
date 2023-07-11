package AppPackage;

public class ButterflyTama extends Tamagotchi {
    ButterflyTama(String nome){
    	super(nome);
      setFood("fruta");
      this.health = new Meter(70,-5);
      this.happiness = new Meter(80,0);
      this.hunger = new Meter(0,-5);
      this.tiredness = new Meter(0,-2);
      this.poop = new Meter(0,-10);
    }

    public void characteristic(){
        System.out.println("Som das asas de " + this.getName() + "*flap flap*");
        this.state.showState((Tamagotchi) this);
    }
}
