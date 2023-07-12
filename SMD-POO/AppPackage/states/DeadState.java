package AppPackage.states;

import AppPackage.Tamagotchi;

public class DeadState implements TamagotchiState {

  public DeadState(Tamagotchi t){
    t.getHealthMeter().setPercentage(0);
    t.getHungerMeter().setPercentage(0);
    t.getPoopMeter().setPercentage(0);
    t.getHappinessMeter().setPercentage(0);
    t.getTirednessMeter().setPercentage(0);
  }
	@Override
	public void sleep(Tamagotchi t) {
		System.out.print(t.getName() + " está morto!");

	}

	@Override
	public void play(Tamagotchi t) {
		System.out.print(t.getName() + " está morto!");

	}

	@Override
	public void feed(Tamagotchi t, String f) {
		System.out.print(t.getName() + " está morto!");

	}

	@Override
	public void clean(Tamagotchi t) {
		System.out.print(t.getName() + " está morto!");
	}
}
