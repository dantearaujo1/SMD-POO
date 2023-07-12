package AppPackage;

public class Ball extends Acessory {
    Ball(){
        super.healthmodifier = 0.15f;
        super.happinessmodifier = 0.20f;
    }

    @Override
    public void remove(Tamagotchi t) {
      double healthBonus = t.getHealthMeter().getBonus();
      double happinessBonus = t.getHappinessMeter().getBonus();
      t.getHappinessMeter().setBonusmod((float)happinessBonus - this.poopmodifier) ;
      t.getHealthMeter().setBonusmod((float)healthBonus - this.healthmodifier) ;
    }
    @Override
    public void apply(Tamagotchi t) {
      double healthBonus = t.getHealthMeter().getBonus();
      double happinessBonus = t.getHappinessMeter().getBonus();
      t.getHappinessMeter().setBonusmod((float)happinessBonus + this.poopmodifier) ;
      t.getHealthMeter().setBonusmod((float)healthBonus + this.healthmodifier) ;
    }
}
