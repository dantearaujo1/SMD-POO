package tamagochi.states;

import tamagochi.Tamagochi;
import tamagochi.Food;

public interface TamagochiState {

	public void sleep(Tamagochi t);

	public void play(Tamagochi t);

	public void feed( Tamagochi t, Food f);

	public void clean( Tamagochi t);

}