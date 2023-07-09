package tamagochi;

import tamagochi.DogTama;
import tamagochi.CatTama;
import tamagochi.DuckTama;

public class TamagochiFactory {

  private static Integer count;

  public static Tamagochi create(String type) {
	  if (type == "duck") {
		return new DuckTama("criado");
		count++;
	  }
	  else if (type == "dog") {
		return new DogTama("criado");
		count++;
	  }
	  else if (type == "cat") {
		return new CatTama("criado");
		count++;
	  }
  }
  
  

}