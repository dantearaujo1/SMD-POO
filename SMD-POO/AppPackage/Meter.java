package AppPackage;

public class Meter {
    private int percentage;
    private float bonusmod;

    Meter(){
        this.percentage = 100;
        this.bonusmod = 0.0f;
    }

    Meter(int perc, float mod){
      this.percentage = perc;
    	this.setBonusmod(mod);
    }

    public void ModPercentage(float mod){
        this.percentage += (int)(((float)(10))*(mod + this.bonusmod));
        if(this.percentage > 100){
            this.percentage = 100;
        }
        if(this.percentage < 0){
            this.percentage = 0;
        }
    }

    public int getPercentage(){
        return this.percentage;
    }
    public float getBonus(){
        return this.bonusmod;
    }

    public void setBonusmod(float bonus){
        this.bonusmod = bonus;
    }
    public void setPercentage(int percentage){
      if (percentage <= 0){
        this.percentage = 0;
        return;
      }
      this.percentage = percentage;
    }
}
