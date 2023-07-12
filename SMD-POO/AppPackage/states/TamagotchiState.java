package AppPackage.states;

import AppPackage.Tamagotchi;


public interface TamagotchiState {

	public void sleep(Tamagotchi t);

	public void play(Tamagotchi t);

	public void feed( Tamagotchi t, String f);

	public void clean( Tamagotchi t);

  default public void showState(Tamagotchi t){
    String title = t.getName().toUpperCase() + " current status";
    int titleSize = title.length();

    System.out.println("=".repeat(titleSize+4));
    System.out.println("| " + title + " |");
    System.out.println("=".repeat(titleSize+4));
    System.out.printf("Health: %d\n",t.getHealthMeter().getPercentage() );
    System.out.printf("Happiness: %d\n",t.getHappinessMeter().getPercentage() );
    System.out.printf("Poop: %d\n",t.getPoopMeter().getPercentage() );
    System.out.printf("Tiredness: %d\n",t.getTirednessMeter().getPercentage() );
    System.out.printf("Hunger: %d\n",t.getHungerMeter().getPercentage() );
    System.out.printf("State: %s\n",this.getClass().getSimpleName() );
    System.out.println("=".repeat(titleSize+4));
  }

}
