package AppPackage.states;

import AppPackage.Tamagotchi;


public interface TamagotchiState {

	public void sleep(Tamagotchi t);

	public void play(Tamagotchi t);

	public void feed( Tamagotchi t, String f);

	public void clean( Tamagotchi t);

}