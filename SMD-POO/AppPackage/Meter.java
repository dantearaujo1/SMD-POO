package AppPackage;

public class Meter {
    private int percentage;
    private float bonusmod;

    Meter(){
        this.percentage = 100;
        this.bonusmod = 0.0f;
    }

    void ModPercentage(float mod){
        this.percentage += (int)(((float)(10))*(mod + this.bonusmod));
        if(this.percentage > 100){
            this.percentage = 100;
        }
        if(this.percentage < 0){
            this.percentage = 0;
        }
    }

    int getPercentage(){
        return this.percentage;
    }

    void setBonusmod(float bonus){
        this.bonusmod = bonus;
    }
}