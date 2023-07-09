package tamagochi;

import java.util.ArrayList;


public class Player {

	private String name;

	private Integer currentTamagochi;

	public ArrayList<Tamagochi> tamagochis;
	
	public Player(String name) {
		this.setName(name);
		this.tamagochis = new ArrayList<Tamagochi>();
		this.currentTamagochi = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void adoptTamagochi(Tamagochi t) {
		tamagochis.add(t);
		t.setOwner(this);
	}

	public void changeTamagochi(Integer id) {
		id %= tamagochis.size();
	}

	public void play() {
		tamagochis.get(currentTamagochi).play();
	}

	public void playWithAll() {
		for (int i = 0; i < tamagochis.size(); i++) {
			tamagochis.get(i).play();
		}
	}

	public void feed(Food f) {
		Tamagochi t = tamagochis.get(currentTamagochi);
		System.out.println(this.getName() + " está alimentando " + t.getName() + " com: " + f.getName());
		t.feed(f);
	}

	public void feedAll() {
		for (int i = 0; i < tamagochis.size(); i++) {
			tamagochis.get(i).feed(new Food("arroz"));
		}
	}

	public void clean() {
		tamagochis.get(currentTamagochi).clean();
	}

	public void cleanAll() {
		tamagochis.get(currentTamagochi).play();
		for (int i = 0; i < tamagochis.size(); i++) {
			tamagochis.get(i).clean();
		}
	}

	public void putToSleep() {
		tamagochis.get(currentTamagochi).sleep();
	}

	public void putAllToSleep() {
		for (int i = 0; i < tamagochis.size(); i++) {
			tamagochis.get(i).sleep();
		}
	}


}