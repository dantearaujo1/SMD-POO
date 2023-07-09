package AppPackage;
import java.util.ArrayList;

public class Player {
    private String name;
    protected Meter energy;
    private TamagotchiFactory generator;
    ArrayList<Tamagotchi> tamagotchis;

    void adoptTama(String type, String nome){
        Tamagotchi temp = generator.create(type, nome);
        temp.owner = this.name;
        this.tamagotchis.add(temp);
    }

    private int findTama(String nome){
        for(int i = 0; i < this.tamagotchis.size(); i++){
            if(this.tamagotchis.get(i).name.equals(nome)){
                return i;
            }
        }
        return -1;
    }

    void play(String nome){
        int indice = findTama(nome);
        if(indice >= 0){
            this.tamagotchis.get(indice).play();
            this.energy.ModPercentage(-0.5f);
        }
    }

    void playAll(){
        for(int i = 0; i < this.tamagotchis.size(); i++){
            this.tamagotchis.get(i).play();
            this.energy.ModPercentage(-0.5f);
        }
    }

    void feed(String nome, String comida){
        int indice = findTama(nome);
        if(indice >= 0){
            this.tamagotchis.get(indice).feed(comida);
            this.energy.ModPercentage(-0.5f);
        }
    }

    void feedAll(String comida){
        for(int i = 0; i < this.tamagotchis.size(); i++){
            this.tamagotchis.get(i).feed(comida);
            this.energy.ModPercentage(-0.5f);
        }
    }

    void clean(String nome){
        int indice = findTama(nome);
        if(indice >= 0){
            this.tamagotchis.get(indice).clean();
            this.energy.ModPercentage(-0.5f);
        }
    }

    void cleanAll(){
        for(int i = 0; i < this.tamagotchis.size(); i++){
            this.tamagotchis.get(i).clean();
            this.energy.ModPercentage(-0.5f);
        }
    }

    void putToSleep(String nome){
        int indice = findTama(nome);
        if(indice >= 0){
            this.tamagotchis.get(indice).sleep();
            this.energy.ModPercentage(-0.5f);
        }
    }

    void putToSleepAll(){
        for(int i = 0; i < this.tamagotchis.size(); i++){
            this.tamagotchis.get(i).sleep();
            this.energy.ModPercentage(-0.5f);
        }
    }
}