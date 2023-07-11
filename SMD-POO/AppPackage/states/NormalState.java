package AppPackage.states;

import AppPackage.Tamagotchi;
import AppPackage.Meter;

import SmellyState;
import HungryState;
import SickState;

public class NormalState implements TamagotchiState {

	@Override
	public void sleep(Tamagotchi t) {
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		Meter poop = t.getPoopMeter();
		health.ModPercentage(1.0f);
		hunger.ModPercentage(1.0f);
		poop.ModPercentage(1.0f);
		System.out.println(t.getName() + " teve uma soneca tranquila!");
	}

	@Override
	public void play(Tamagotchi t) {
		Meter hunger = t.getHungerMeter();
		Meter poop = t.getPoopMeter();
		Meter happy = t.getHappinessMeter();
		hunger.ModPercentage(2.0f);
		poop.ModPercentage(1.0f);
		happy.ModPercentage(1.0f);

		System.out.println(t.getName() + " Brincou com todos os seus colegas!");

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
	}

	@Override
	public void clean(Tamagotchi t) {
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		Meter poop = t.getPoopMeter();
		Meter happy = t.getHappinessMeter();
		health.ModPercentage(1.0f);
		hunger.ModPercentage(1.0f);
		poop.ModPercentage(-1.0f);
		happy.ModPercentage(1.0f);
		System.out.println(t.getName() + ": Lava, lava, lava .....");

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

    if (healthValue <= 0){
      t.state = (new DeadState());
      return;
    }
    if (healthValue <= 20){
      t.state = (new SickState());
      return;
    }

    int max = Math.max(hungerValue,poopValue);
    int max2 = Math.max(max,tirednessValue);
    if (max2 == tirednessValue){
      t.state = (new TiredState());
    }
    if (max2 == hungerValue){
      t.state = (new HungryState());
    }
    else if (max2 == poopValue){
      t.state = (new SmellyState());
    }
  }

}
