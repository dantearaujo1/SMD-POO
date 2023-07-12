package AppPackage.states;

import AppPackage.Tamagotchi;
import AppPackage.Meter;

public class TiredState implements TamagotchiState {

  public TiredState(){
    System.out.println("Seu mascote está muito cansado, cuide bem dele!");
  }
	public void sleep(Tamagotchi t) {
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		Meter happy = t.getHappinessMeter();
		Meter tiredness = t.getTirednessMeter();
    tiredness.ModPercentage(-3.5f);
		health.ModPercentage(2.0f);
		hunger.ModPercentage(1.0f);
    happy.ModPercentage(1.5f);
		System.out.println(t.getName() + " descansou para ver se melhora!");
    this.checkStatus(t);

	}

	public void play(Tamagotchi t) {
		// TODO Auto-generated method stub
		System.out.println(t.getName() + " não consegue nem se manter em pé para brincar");
		Meter tiredness = t.getTirednessMeter();
    tiredness.ModPercentage(1.0f);
    this.checkStatus(t);
	}

	public void feed(Tamagotchi t, String f) {
		// TODO Auto-generated method stub
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		Meter poop = t.getPoopMeter();
		Meter happy = t.getHappinessMeter();
		Meter tiredness = t.getTirednessMeter();
    tiredness.ModPercentage(-1.0f);
		if (t.getFavoriteFood().getName() == f) {
			health.ModPercentage(1.0f);
			hunger.ModPercentage(-2.0f);
			poop.ModPercentage(1.0f);
			happy.ModPercentage(1.0f);
			System.out.println(t.getName() + ": Queria mesmo era descansar! ");
		}
		else {
			health.ModPercentage(1.0f);
			hunger.ModPercentage(-1.0f);
			poop.ModPercentage(1.0f);
			happy.ModPercentage(0.5f);
			System.out.println(t.getName() + ": Daria tudo por uma boa soneca!" + f);
		}
    this.checkStatus(t);

	}

	public void clean(Tamagotchi t) {
		Meter hunger = t.getHungerMeter();
		Meter poop = t.getPoopMeter();
		Meter happy = t.getHappinessMeter();
		Meter tiredness = t.getTirednessMeter();
    tiredness.ModPercentage(1.0f);
		hunger.ModPercentage(0.5f);
		poop.ModPercentage(-1.0f);
		happy.ModPercentage(-1.0f);
		System.out.println(t.getName() + ": Eu to cansado e não sujo, me deixa dormir!");
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
      health.ModPercentage(-2.0f);
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
