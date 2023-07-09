package tamagochi.states;

import tamagochi.Tamagochi;
import tamagochi.Food;

public class DeadState implements TamagochiState {

	@Override
	public void sleep(Tamagochi t) {
		System.out.print(t.getName() + "Está morto!");
		
	}

	@Override
	public void play(Tamagochi t) {
		System.out.print(t.getName() + "Está morto!");
		
	}

	@Override
	public void feed(Tamagochi t, Food f) {
		System.out.print(t.getName() + "Está morto!");
		
	}

	@Override
	public void clean(Tamagochi t) {
		System.out.print(t.getName() + "Está morto!");
		
	}
}