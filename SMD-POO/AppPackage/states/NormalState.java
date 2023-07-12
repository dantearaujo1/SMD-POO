package AppPackage.states;

import AppPackage.Tamagotchi;
import AppPackage.Meter;


public class NormalState implements TamagotchiState {

	@Override
	public void sleep(Tamagotchi t) {
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		Meter poop = t.getPoopMeter();
		Meter tiredness = t.getTirednessMeter();
    tiredness.ModPercentage(-2.0f);
		health.ModPercentage(1.0f);
		hunger.ModPercentage(1.0f);
		poop.ModPercentage(1.0f);
		System.out.println(t.getName() + " teve uma soneca tranquila!");
    this.checkStatus(t);
	}

	@Override
	public void play(Tamagotchi t) {
		Meter hunger = t.getHungerMeter();
		Meter poop = t.getPoopMeter();
		Meter happy = t.getHappinessMeter();
		Meter tiredness = t.getTirednessMeter();
		hunger.ModPercentage(2.0f);
		poop.ModPercentage(1.0f);
		happy.ModPercentage(1.0f);
    tiredness.ModPercentage(1.3f);

		System.out.println(t.getName() + " brincou muito!");
    this.checkStatus(t);
	}

	@Override
	public void feed(Tamagotchi t, String f) {
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		Meter poop = t.getPoopMeter();
		Meter happy = t.getHappinessMeter();
		if (t.getFavoriteFood().getName() == f) {
			health.ModPercentage(3.0f);
			hunger.ModPercentage(-3.0f);
			poop.ModPercentage(2.0f);
			happy.ModPercentage(2.0f);
			System.out.println(t.getName() + ": Nada vai cair tão bem quanto meu prato favorito: " + f);
		}
		else {
			health.ModPercentage(1.0f);
			hunger.ModPercentage(-1.0f);
			poop.ModPercentage(1.0f);
			happy.ModPercentage(1.0f);
			System.out.println(t.getName() + ": Ja tava na hora, vou comer um pratim de " + f);
		}
    this.checkStatus(t);
	}

	@Override
	public void clean(Tamagotchi t) {
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		Meter poop = t.getPoopMeter();
		Meter happy = t.getHappinessMeter();
		Meter tiredness = t.getTirednessMeter();
    tiredness.ModPercentage(1.0f);
		health.ModPercentage(1.0f);
		hunger.ModPercentage(1.0f);
		poop.ModPercentage(-1.0f);
		happy.ModPercentage(1.0f);
		System.out.println(t.getName() + ": Lava, lava, lava .....");
    this.checkStatus(t);

	}

  public void checkStatus(Tamagotchi t){
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		Meter poop = t.getPoopMeter();
		Meter tiredness = t.getTirednessMeter();

    int hungerValue = hunger.getPercentage();
    int poopValue = poop.getPercentage();
    int healthValue = health.getPercentage();
    int tirednessValue = tiredness.getPercentage();

    if (healthValue <= 1){
      t.state = (new DeadState(t));
      return;
    }
    if (healthValue <= 21){
      t.state = (new SickState());
      return;
    }

    int max = Math.max(hungerValue,poopValue);
    int max2 = Math.max(max,tirednessValue);
    if (max2 == hungerValue && max2 >= 80){
      t.state = (new HungryState());
    }
    else if (max2 == tirednessValue && max2 >= 80){
      t.state = (new TiredState());
    }
    else if (max2 == poopValue && max2 >= 90){
      t.state = (new SmellyState());
    }

  }


}
