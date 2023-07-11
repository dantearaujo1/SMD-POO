package AppPackage;

public class Toilet extends Acessory {
    Toilet(){
        this.poopmodifier = 2.0f;
    }

    @Override
    public void apply(Tamagotchi t) {
      double current_bonus = t.getPoopMeter().getBonus();
      t.getPoopMeter().setBonusmod((float)current_bonus + this.poopmodifier) ;
    }
    @Override
    public void remove(Tamagotchi t) {
      double current_bonus = t.getPoopMeter().getBonus();
      t.getPoopMeter().setBonusmod((float)current_bonus - this.poopmodifier) ;
    }
}
