package AppPackage;

public class CatTama extends Tamagotchi {
    CatTama(String nome){
    	super(nome);
      setFood("peixe");
      this.health = new Meter(100,-10);
      this.happiness = new Meter(80,-5);
      this.hunger = new Meter(0,0);
      this.tiredness = new Meter(0,8);
      this.poop = new Meter(0,-5);
    }

    public void characteristic(){
        System.out.println("Miau, é isso ai!");
        this.state.showState((Tamagotchi) this);
    }
}
