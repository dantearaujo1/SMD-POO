package AppPackage.states;

import AppPackage.Tamagotchi;
import AppPackage.Meter;

public class SmellyState implements TamagotchiState {

	public void sleep(Tamagotchi t) {
		// TODO Auto-generated method stub

    this.checkStatus(t);
	}

	public void play(Tamagotchi t) {
		// TODO Auto-generated method stub

    this.checkStatus(t);
	}

	public void feed(Tamagotchi t, String f) {
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		Meter poop = t.getPoopMeter();
		Meter happy = t.getHappinessMeter();
		Meter tiredness = t.getTirednessMeter();
    String awnser = "";

		if (t.getFavoriteFood().getName() == f) {
			health.ModPercentage(2.0f);
			hunger.ModPercentage(-2.0f);
			poop.ModPercentage(1.0f);
			happy.ModPercentage(0.5f);
			awnser = t.getName() + ": O cheiro da comida ainda consegue ser bom mesmo comigo fedendo!";
		}
		else {
			health.ModPercentage(1.0f);
			hunger.ModPercentage(-1.0f);
			poop.ModPercentage(2.0f);
			happy.ModPercentage(-0.5f);
			awnser = t.getName() + ": Nem o cheiro da comida supera o cheiro que eu to, preciso de um banho!";
		}
    this.checkStatus(t);
    System.out.println(awnser);
	}

	public void clean(Tamagotchi t) {
		Meter hunger = t.getHungerMeter();
		Meter poop = t.getPoopMeter();
		Meter happy = t.getHappinessMeter();
		Meter tiredness = t.getTirednessMeter();
    tiredness.ModPercentage(1.0f);
		hunger.ModPercentage(1.0f);
		poop.ModPercentage(-2.0f);
		happy.ModPercentage(1.5f);
    this.checkStatus(t);
    System.out.println(t.getName() + ": Graças, não to mais todo cagado!");
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

    if (hungerValue >= 100 || poopValue >= 100 || tirednessValue >= 100){
      health.ModPercentage(-0.5f);
    }

    hungerValue = hunger.getPercentage();
    poopValue = poop.getPercentage();
    healthValue = health.getPercentage();
    tirednessValue = tiredness.getPercentage();

    if (healthValue <= 1){
      t.state = (new DeadState(t));
      return;
    }
    if (healthValue <= 21){
      t.state = (new SickState());
      return;
    }

    if (poopValue < 80){
      t.state = new NormalState();
    }
    int max = Math.max(hungerValue,poopValue);
    int max2 = Math.max(max,tirednessValue);
    if (max2 == hungerValue && max2 >= 80){
      t.state = (new HungryState());
    }
    else if (max2 == tirednessValue && max2 >= 80){
      t.state = (new TiredState());
    }
    else if (max2 == poopValue && max2 >= 80){
      // t.state = (new SmellyState());
      // ((TiredState)t.state).checkStatus(t);
    }

  }

}

