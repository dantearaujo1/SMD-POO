package AppPackage.states;

import AppPackage.Tamagotchi;
import AppPackage.Meter;

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
		hunger.ModPercentage(1.0f);
		poop.ModPercentage(1.0f);
		happy.ModPercentage(1.0f);
		System.out.println(t.getName() + " Brincou com todos os seus colegas!");

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
		hunger.ModPercentage(-1.0f);
		poop.ModPercentage(-1.0f);
		happy.ModPercentage(1.0f);
		System.out.println(t.getName() + ": Lava, lava, lava .....");

	}

}
