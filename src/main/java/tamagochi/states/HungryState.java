package tamagochi.states;

import tamagochi.Tamagochi;
import tamagochi.Food;

public class HungryState implements TamagochiState {

	public void sleep(Tamagochi t) {
		int happy = t.getHappiness();
		int health = t.getHealth();
		int hunger = t.getHunger();
		t.setHealth(health + 1);
		t.setHappiness(happy + 1);
		t.setHunger(hunger + 2);
		System.out.println(t.getName() + "Demorou muito para dormir pois sua barriga estava roncando de fome!");
	}

	public void play(Tamagochi t) {
		int happy = t.getHappiness();
		int health = t.getHealth();
		int hunger = t.getHunger();
		t.setHealth(health - 1);
		t.setHappiness(happy + 1);
		t.setHunger(hunger + 2);
		System.out.println(t.getName() + "Não conseguiu brincar direito! Sua fome não permitiu");
	}

	public void feed(Tamagochi t, Food f) {
		int health = t.getHealth();
		int hunger = t.getHunger();
		int poop = t.getPoop();
		int happy = t.getHappiness();
		System.out.println(t.getName() + ": Yumi Yumi, vou comer tudo!");
		if (t.favoriteFood.getName() == f.getName()) {
			t.setHealth(health + 3);
			t.setHunger(hunger - 3);
			t.setPoop(poop + 2);
			t.setHappiness(happy + 2);
		}
		else {
			t.setHealth(health + 1);
			t.setPoop(poop + 2);
			t.setHappiness(happy + 1);
		}
	}

	public void clean(Tamagochi t) {
		int poop = t.getPoop();
		t.setPoop(poop + 1);
		System.out.println(t.getName() + ": Eu queria mesmo era uma comidinha!");
	}
	
	

}