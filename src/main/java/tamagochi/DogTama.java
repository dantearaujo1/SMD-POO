package tamagochi;

import tamagochi.states.*;

public class DogTama extends Tamagochi {
	
	public DogTama(String name) {
		this.setHealth(10);
		this.setHappiness(10);
		this.setHunger(0);
		this.setPoop(0);
		this.setState(new NormalState());
		this.setName(name);
		this.favoriteFood = new Food("miojo");
	}

	@Override
	public void feed(Food food) {
		this.getState().feed(this,food);
		
	}

	@Override
	public void sleep() {
		this.getState().sleep(this);
	}

	@Override
	public void clean() {
		this.getState().clean(this);
		
	}

	@Override
	public void play() {
		this.getState().play(this);
	}
	
}