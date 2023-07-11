package AppPackage;

public abstract class Acessory {
    protected float healthmodifier = 0.0f;
    protected float happinessmodifier = 0.0f;
    protected float poopmodifier = 0.0f;
    protected float hungermodifier = 0.0f;

    public abstract void apply(Tamagotchi t);
    public abstract void remove(Tamagotchi t);

}
