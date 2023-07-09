package AppPackage.states;

import AppPackage.Tamagotchi;
import AppPackage.Meter;

public class HungryState implements TamagotchiState {

	public void sleep(Tamagotchi t) {
		Meter happy = t.getHappinessMeter();
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		happy.ModPercentage(1.0f);
		hunger.ModPercentage(1.0f);
		health.ModPercentage(2.0f);
		System.out.println(t.getName() + "Demorou muito para dormir pois sua barriga estava roncando de fome!");
	}

	public void play(Tamagotchi t) {
		Meter happy = t.getHappinessMeter();
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		health.ModPercentage(-1.0f);
		happy.ModPercentage(1.0f);
		hunger.ModPercentage(2.0f);
		System.out.println(t.getName() + "Não conseguiu brincar direito! Sua fome não permitiu");
	}

	public void feed(Tamagotchi t, String f) {
		Meter health = t.getHealthMeter();
		Meter hunger = t.getHungerMeter();
		Meter poop = t.getPoopMeter();
		Meter happy = t.getHappinessMeter();
		System.out.println(t.getName() + ": Yumi Yumi, vou comer tudo!");
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
	}

	public void clean(Tamagotchi t) {
		Meter poop = t.getPoopMeter();
		poop.ModPercentage(1.0f);
		System.out.println(t.getName() + ": Eu queria mesmo era uma comidinha!");
	}
	
	

}