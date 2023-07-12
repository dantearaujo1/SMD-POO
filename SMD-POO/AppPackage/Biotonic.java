package AppPackage;

public class Biotonic extends Acessory {
    Biotonic(){
        this.healthmodifier = 1.5f;
        this.hungermodifier = 1.2f;
    }
    @Override
    public void apply(Tamagotchi t) {
      double hungerBonus = t.getHungerMeter().getBonus();
      double healthBonus = t.getHealthMeter().getBonus();
      t.getHealthMeter().setBonusmod((float)healthBonus + this.healthmodifier) ;
      t.getHungerMeter().setBonusmod((float)hungerBonus + this.healthmodifier) ;
    }
    @Override
    public void remove(Tamagotchi t) {
      double hungerBonus = t.getHungerMeter().getBonus();
      double healthBonus = t.getHealthMeter().getBonus();
      t.getHealthMeter().setBonusmod((float)healthBonus - this.healthmodifier) ;
      t.getHungerMeter().setBonusmod((float)hungerBonus - this.healthmodifier) ;
    }
}
