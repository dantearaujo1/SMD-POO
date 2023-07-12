package AppPackage.states;

import AppPackage.Tamagotchi;
import AppPackage.Meter;

public class HungryState implements TamagotchiState {

  public HungryState(){
    System.out.println("Seu mascote está com fome!");
  }

	public void sleep(Tamagotchi t) {
		Meter happy = t.getHappinessMeter();
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		Meter tiredness = t.getTirednessMeter();
    tiredness.ModPercentage(-1.0f);
		happy.ModPercentage(1.0f);
		hunger.ModPercentage(1.0f);
		health.ModPercentage(2.0f);
		System.out.println(t.getName() + "demorou muito para dormir pois sua barriga estava roncando de fome!");
    this.checkStatus(t);
	}

	public void play(Tamagotchi t) {
		Meter happy = t.getHappinessMeter();
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		Meter tiredness = t.getTirednessMeter();
    tiredness.ModPercentage(3.0f);
		health.ModPercentage(-1.0f);
		happy.ModPercentage(1.0f);
		hunger.ModPercentage(2.0f);
		System.out.println(t.getName() + " não conseguiu brincar direito! Sua fome não permitiu");
    this.checkStatus(t);
	}

	public void feed(Tamagotchi t, String f) {
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		Meter poop = t.getPoopMeter();
		Meter happy = t.getHappinessMeter();
		if (t.getFavoriteFood().getName() == f) {
			poop.ModPercentage(3.0f);
			hunger.ModPercentage(-3.0f);
			happy.ModPercentage(2.0f);
			health.ModPercentage(2.0f);
		}
		else {
			poop.ModPercentage(1.0f);
			hunger.ModPercentage(-1.0f);
			health.ModPercentage(2.0f);
			happy.ModPercentage(1.0f);
		}
    System.out.println(t.getName() + ": Yumi Yumi, vou comer tudo!");
    this.checkStatus(t);
	}

	public void clean(Tamagotchi t) {
		Meter poop = t.getPoopMeter();
    Meter tiredness = t.getTirednessMeter();
		poop.ModPercentage(1.0f);
    tiredness.ModPercentage(1.5f);
		System.out.println(t.getName() + ": Eu queria mesmo era uma comidinha!");
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

    if (hungerValue >= 100 || poopValue >= 100 || tirednessValue >= 100){
      health.ModPercentage(-1.7f);
    }

    hungerValue = hunger.getPercentage();
    poopValue = poop.getPercentage();
    healthValue = health.getPercentage();
    tirednessValue = tiredness.getPercentage();

    if (healthValue <= 1){
      t.state = (new DeadState(t));
      return;
    }
    if (healthValue <= 51){
      t.state = (new SickState());
      return;
    }

    if (hungerValue < 80){
      t.state = new NormalState();
    }

    int max = Math.max(hungerValue,poopValue);
    int max2 = Math.max(max,tirednessValue);
    if (max2 == hungerValue && max2 >= 80){
      return;
      // t.state = (new HungryState());
    }
    if (max == tirednessValue && max >= 80){
      t.state = (new TiredState());
    }
    else if (max == poopValue && max >= 80){
      t.state = (new SmellyState());
    }

  }


}
