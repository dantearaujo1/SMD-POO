package AppPackage;

public abstract class Acessory {
    protected float healthmodifier = 0.0f;
    protected float happinessmodifier = 0.0f;
    protected float poopmodifier = 0.0f;
    protected float hungermodifier = 0.0f;

    float getHealthMod(){
        return this.healthmodifier;
    }

    float getHappinessMod(){
        return this.happinessmodifier;
    }

    float getPoopMod(){
        return this.poopmodifier;
    }

    float getHungerMod(){
        return this.hungermodifier;
    }
}
