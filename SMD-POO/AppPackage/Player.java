package AppPackage;
import java.util.ArrayList;

public class Player {
    private String name;
    protected Meter energy = new Meter();
    ArrayList<Tamagotchi> tamagotchis = new ArrayList<Tamagotchi>();

    Player(String nome){
        this.name = nome;
    }

    String getName(){
        return this.name;
    }

    private boolean checkEnergy(int needed){
        if(this.energy.getPercentage() - needed <= 0){
            System.out.println("Você tentou algo, mas caiu de exaustao...");
            return false;
        }
        else if(this.energy.getPercentage() - needed <= 30){
            System.out.println("Você anda exausto mas...");
        }
        return true;
    }

    void adoptTama(String type, String nome){
        Tamagotchi temp = TamagotchiFactory.create(type, nome);
        temp.setOwner(this);
        this.tamagotchis.add(temp);
    }

    public int findTama(String nome){
        for(int i = 0; i < this.tamagotchis.size(); i++){
            if(this.tamagotchis.get(i).getName().equals(nome)){
                return i;
            }
        }
        return -1;
    }

    void play(String nome){
        int indice = findTama(nome);
        if(indice >= 0){
            if(checkEnergy(25)){
                this.tamagotchis.get(indice).play();
                this.energy.ModPercentage(-2.5f);
            }
        }
    }

    void playAll(){
        for(int i = 0; i < this.tamagotchis.size(); i++){
            if(checkEnergy(25)){
                this.tamagotchis.get(i).play();
                this.energy.ModPercentage(-2.5f);
            }
        }
    }

    void feed(String nome, String comida){
        int indice = findTama(nome);
        if(indice >= 0){
            if(checkEnergy(5)){
                this.tamagotchis.get(indice).feed(comida);
                this.energy.ModPercentage(-0.5f);
            }
        }
    }

    void feedAll(String comida){
        for(int i = 0; i < this.tamagotchis.size(); i++){
            if(checkEnergy(5)){
                this.tamagotchis.get(i).feed(comida);
                this.energy.ModPercentage(-0.5f);
            }
        }
    }

    void clean(String nome){
        int indice = findTama(nome);
        if(indice >= 0){
            if(checkEnergy(10)){
                this.tamagotchis.get(indice).clean();
                this.energy.ModPercentage(-1.0f);
            }
        }
    }

    void cleanAll(){
        for(int i = 0; i < this.tamagotchis.size(); i++){
            if(checkEnergy(10)){
                this.tamagotchis.get(i).clean();
                this.energy.ModPercentage(-1.0f);
            }
        }
    }

    void putToSleep(String nome){
        int indice = findTama(nome);
        if(indice >= 0){
            if(checkEnergy(5)){
                this.tamagotchis.get(indice).sleep();
                this.energy.ModPercentage(-0.5f);
            }
        }
    }

    void putToSleepAll(){
        for(int i = 0; i < this.tamagotchis.size(); i++){
            if(checkEnergy(5)){
                this.tamagotchis.get(i).sleep();
                this.energy.ModPercentage(-0.5f);
            }
        }
    }

    void reenergize(){
        this.energy.ModPercentage(1.5f);
    }

    void deteriorateTama(){
        for(int i = 0; i < this.tamagotchis.size(); i++){
            // this.tamagotchis.get(i).deteriorate();
        }
    }
}
