package AppPackage.states;

import AppPackage.Tamagotchi;

public class DeadState implements TamagotchiState {

	@Override
	public void sleep(Tamagotchi t) {
		System.out.print(t.getName() + "Está morto!");
		
	}

	@Override
	public void play(Tamagotchi t) {
		System.out.print(t.getName() + "Está morto!");
		
	}

	@Override
	public void feed(Tamagotchi t, String f) {
		System.out.print(t.getName() + "Está morto!");
		
	}

	@Override
	public void clean(Tamagotchi t) {
		System.out.print(t.getName() + "Está morto!");
		
	}
}