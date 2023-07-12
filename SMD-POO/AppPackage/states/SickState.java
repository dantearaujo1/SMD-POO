package AppPackage.states;

import AppPackage.Tamagotchi;
import AppPackage.Meter;

public class SickState implements TamagotchiState {

  public SickState(){
    System.out.println("Seu mascote adoeceu!");

  }
	public void sleep(Tamagotchi t) {
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		Meter happy = t.getHappinessMeter();
		Meter tiredness = t.getTirednessMeter();
    tiredness.ModPercentage(-3.5f);
		health.ModPercentage(3.0f);
		hunger.ModPercentage(1.0f);
    happy.ModPercentage(0.5f);
		System.out.println(t.getName() + " descansou para ver se melhora!");
    this.checkStatus(t);
	}

	@Override
	public void play(Tamagotchi t) {
		Meter tiredness = t.getTirednessMeter();
    tiredness.ModPercentage(3.5f);
		System.out.println(t.getName() + " está doente, não vai poder brincar");
    this.checkStatus(t);

	}

	@Override
	public void feed(Tamagotchi t, String f) {
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		Meter poop = t.getPoopMeter();
		Meter happy = t.getHappinessMeter();
		if (t.getFavoriteFood().getName() == f) {
			health.ModPercentage(2.0f);
			hunger.ModPercentage(-2.0f);
			poop.ModPercentage(1.0f);
			happy.ModPercentage(0.5f);
			System.out.println(t.getName() + ": Mesmo sendo meu preferido eu não consigo comer bem! ");
		}
		else {
			health.ModPercentage(1.0f);
			hunger.ModPercentage(-1.0f);
			poop.ModPercentage(1.0f);
			happy.ModPercentage(-0.5f);
			System.out.println(t.getName() + ": To sem fome, mas vou comer " + f);
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
		hunger.ModPercentage(0.5f);
		poop.ModPercentage(-0.5f);
		happy.ModPercentage(-1.0f);
		System.out.println(t.getName() + ": Tem certeza que eu preciso tomar banho?");
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
    if (healthValue > 50){
      t.state = (new NormalState());
      return;
    }

  }

}
