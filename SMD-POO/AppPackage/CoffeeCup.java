package AppPackage;

public class CoffeeCup extends Acessory {
    CoffeeCup(){
        this.hungermodifier = 0.8f;
        this.healthmodifier = -0.2f;
        this.happinessmodifier = 1.5f;
    }

    @Override
    public void apply(Tamagotchi t) {
      double hungerBonus = t.getHungerMeter().getBonus();
      double healthBonus = t.getHealthMeter().getBonus();
      double happinessBonus = t.getHappinessMeter().getBonus();
      t.getHappinessMeter().setBonusmod((float)happinessBonus + this.poopmodifier) ;
      t.getHealthMeter().setBonusmod((float)healthBonus + this.healthmodifier) ;
      t.getHungerMeter().setBonusmod((float)hungerBonus + this.healthmodifier) ;
    }
    @Override
    public void remove(Tamagotchi t) {
      double hungerBonus = t.getHungerMeter().getBonus();
      double healthBonus = t.getHealthMeter().getBonus();
      double happinessBonus = t.getHappinessMeter().getBonus();
      t.getHappinessMeter().setBonusmod((float)happinessBonus - this.poopmodifier) ;
      t.getHealthMeter().setBonusmod((float)healthBonus - this.healthmodifier) ;
      t.getHungerMeter().setBonusmod((float)hungerBonus - this.healthmodifier) ;
    }
}
