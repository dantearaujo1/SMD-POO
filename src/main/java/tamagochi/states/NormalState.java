package tamagochi.states;

import tamagochi.Tamagochi;
import tamagochi.Food;

public class NormalState implements TamagochiState {

	@Override
	public void sleep(Tamagochi t) {
		int health = t.getHealth();
		int hunger = t.getHunger();
		int poop = t.getPoop();
		t.setHealth(health + 1);
		t.setHunger(hunger + 1);
		t.setPoop(poop + 1);
		System.out.print(t.getName() + " teve uma soneca tranquila!");
	}

	@Override
	public void play(Tamagochi t) {
		int hunger = t.getHunger();
		int poop = t.getPoop();
		int happy = t.getHappiness();
		t.setHappiness(hunger + 1);
		t.setHunger(hunger + 1);
		t.setPoop(poop + 1);
		System.out.print(t.getName() + " Brincou com todos os seus colegas!");

	}

	@Override
	public void feed(Tamagochi t, Food f) {int health = t.getHealth();
		int hunger = t.getHunger();
		int poop = t.getPoop();
		int happy = t.getHappiness();
		if (t.favoriteFood.getName() == f.getName()) {
			t.setHealth(health + 3);
			t.setHunger(hunger - 3);
			t.setPoop(poop + 2);
			t.setHappiness(happy + 2);
			System.out.println(t.getName() + ": Nada vai cair tão bem quanto meu prato favorito: " + f.getName());
		}
		else {
			t.setHealth(health + 1);
			t.setHunger(hunger - 1);
			t.setPoop(poop + 1);
			t.setHappiness(happy + 1);
			System.out.println(t.getName() + ": Ja tava na hora, vou comer um belo pratão de " + f.getName());
		}
	}

	@Override
	public void clean(Tamagochi t) {
		int health = t.getHealth();
		int hunger = t.getHunger();
		int poop = t.getPoop();
		int happy = t.getHappiness();
		t.setHealth(health + 1);
		t.setHunger(hunger - 1);
		t.setPoop(poop - 1);
		t.setHappiness(happy + 1);
		System.out.println(t.getName() + ": Lava, lava, lava .....");

	}

}
