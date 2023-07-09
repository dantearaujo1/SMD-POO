package tamagochi;
import java.util.List;

public abstract class Accessory {

	protected Integer healthModifier;

	protected Integer happinessModifier;

	protected Integer hungerModifier;

	protected Integer poopModifier;

	public List<Tamagochi> tamagochi;

  public void getModifier(String name) {
  }

}