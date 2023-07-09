import tamagochi.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("SMD-POO");
		System.out.println("Super Mascotes Digitais - Pets Otimistas e Otimizados");
		Player p = new Player("Dante");
		Tamagochi t = new DogTama("Fido");
		p.adoptTamagochi(t);
		p.feed(new Food("miojo"));

	}

}
