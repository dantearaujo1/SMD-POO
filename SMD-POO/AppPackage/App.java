package AppPackage;
import java.io.*;

public class App{
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int op=1; String nome, especie, playername, comida;
        System.out.println("Bem-vindo ao jogo Super Mascotes Digitais: Pets Otimistas e Otimizados!");
        System.out.println("Digite seu nome para continuar:");
        playername = in.readLine();
        Player player= new Player(playername);
        System.out.print("\033[H\033[2J");
        System.out.println("Selecione uma das especies a seguir digitando conforme esta escrito:\n-borboleta\n-pato\n-cachorro\n-gato");
        especie = in.readLine();
        especie = especie.toLowerCase();
        System.out.print("\033[H\033[2J");
        System.out.println("Digite agora o nome do bichinho:");
        nome = in.readLine();
        player.adoptTama(especie, nome);

        System.out.print("\033[H\033[2J");
        System.out.println("Parabens, " + player.getName() + ", voce acaba de adotar " + nome + "\n\n");
        System.out.println("Otimo, agora irei explicar algumas coisas...\n1-O bichinho tem 4 atributos essenciais para que possa continuar vivendo\n2-Para recupera-los, pois eles se esgotam periodicamente, voce deve despender energia\n3-Voce tambem recarrega energia periodicamente(a cada turno)\n4-Caso esteja achando facil, pode adotar mais bichinhos");
        System.out.println("Pressione enter para começar");
        in.readLine();
        System.out.print("\033[H\033[2J");
        while(op != 0){
            System.out.println("Selecione a opcao desejada:\n1-Alimentar\n2-Brincar\n3-Colocar para dormir\n4-Limpar\n5-Adotar um novo bichinho\n6-Ver Status\n7-Accesórios\n0-Sair");
            op = Integer.parseInt(in.readLine());
            if(op==1){
                System.out.println("Digite o nome da comida que sera dada(Qualquer uma mas pense que ele deve ter comida favorita!):");
                comida = in.readLine();
                comida = comida.toLowerCase();
                System.out.println("Agora digite o nome do bichinho em que sera realizada a acao ou 'todos' caso seja em todos (gasta mais energia):");
                nome = in.readLine();
                nome = nome.toLowerCase();
                if(nome.equals("todos")){
                    player.feedAll(comida);
                }
                else{
                    player.feed(nome, comida);
                }
            }
            else if(op == 2){
                System.out.println("Agora digite o nome do bichinho em que sera realizada a acao ou 'todos' caso seja em todos (gasta mais energia):");
                nome = in.readLine();
                if(nome.equals("todos")){
                    player.playAll();
                }
                else{
                    player.play(nome);
                }
            }
            else if(op == 3){
                System.out.println("Agora digite o nome do bichinho em que sera realizada a acao ou 'todos' caso seja em todos (gasta mais energia):");
                nome = in.readLine();
                if(nome.equals("todos")){
                    player.putToSleepAll();
                }
                else{
                    player.putToSleep(nome);
                }
            }
            else if(op == 4){
                System.out.println("Agora digite o nome do bichinho em que sera realizada a acao ou 'todos' caso seja em todos (gasta mais energia):");
                nome = in.readLine();
                if(nome.equals("todos")){
                    player.cleanAll();
                }
                else{
                    player.clean(nome);
                }
            }
            else if(op == 5){
                System.out.println("Selecione uma das especies a seguir digitando conforme esta escrito:\n-borboleta\n-pato\n-cachorro\n-gato");
                especie = in.readLine();
                System.out.println("Digite agora o nome do bichinho:");
                nome = in.readLine();
                player.adoptTama(especie, nome);
                System.out.println("Parabens, " + player.getName() + ", voce acaba de adotar " + nome + "\nExistem um total de " + TamagotchiFactory.count + "bichinhos em jogo!\n");
            }
            else if(op == 6){
                System.out.println("Digite agora o nome do bichinho para ver o status");
                nome = in.readLine();
                player.show(nome);
            }
            else if(op == 7){
                System.out.println("Digite agora o nome do bichinho para o processo");
                nome = in.readLine();
                String opera = "";
                boolean sair = false;
                while ( sair == false ){
                  System.out.println("O que vc deseja?\n1 - Adicionar\n2 - Remover\n");
                  opera = in.readLine();
                  if(opera.toLowerCase().equals("adicionar") ||  opera.toLowerCase().equals("1")){
                    sair = true;
                    opera = "1";
                  }
                  else if(opera.toLowerCase().equals("remover") || opera.toLowerCase().equals("2")){
                    sair = true;
                    opera = "2";
                  }
                  else{
                    System.out.println("Opção Inválida");
                  }
                }
                Acessory aObj = null;
                System.out.println("Digite o nome do acessório\n-Privada\n-Bola\n-Cafeína\n-Biotônico");
                String  acessorio = in.readLine();
                if(acessorio.toLowerCase().equals("privada")){
                  aObj = new Toilet();
                }
                else if(acessorio.toLowerCase().equals("bola")){
                  aObj = new Ball();
                }
                else if(acessorio.toLowerCase().equals("cafeina") || acessorio.toLowerCase().equals("cafeína")){
                  aObj = new CoffeeCup();
                }
                else if(acessorio.toLowerCase().equals("biotonico") || acessorio.toLowerCase().equals("biotônico")){
                  aObj = new Biotonic();
                }
                else{
                  System.out.println("Você digitou um acessório inválido, aperte enter para voltar ao menu");
                  in.readLine();
                }
                if(aObj != null){
                  if (opera.equals("1")){
                    player.addAcessory(nome,aObj);
                  }
                  else{
                    player.removeAcessory(nome,aObj);
                  }
                }
            }
            else{
                return;
            }
            player.reenergize();
        }
    }
}

