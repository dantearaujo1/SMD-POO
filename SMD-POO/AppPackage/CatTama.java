package AppPackage;

public class CatTama extends Tamagotchi {
    CatTama(String nome){
    	super(nome);
      setFood("peixe");
      this.health = new Meter(100,-1);
      this.happiness = new Meter(80,-0.5f);
      this.hunger = new Meter(0,0);
      this.tiredness = new Meter(0,0.8f);
      this.poop = new Meter(0,-0.5f);
    }

    public void characteristic(){
        System.out.println("Miau, é isso ai!");
        this.state.showState((Tamagotchi) this);
    }
}
