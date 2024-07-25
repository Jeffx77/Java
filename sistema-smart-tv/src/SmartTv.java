public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novocanal){
        canal = novocanal;
        System.out.println("Trocando de Canal :" + canal);

    }

    public void aumentarCanal(){
         canal++;
         System.out.println("Aumentando Canal :" + canal);

    }

    public void diminuirCanal(){
        canal++;
        System.out.println("Diminuindo Canal :" + canal);

   }


    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para :" + volume);
        // volume +!
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para :" + volume);
        // volume -1
    }

    public  void ligar (){
        ligada=true;
        System.out.println("Tv ligada!");
    }
    public void desligar (){
        ligada=false;
        System.out.println("Tv Desligada!");

    }

}
