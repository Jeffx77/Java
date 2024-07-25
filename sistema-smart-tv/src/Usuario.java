public class Usuario {
    public static void main(String[] args) throws Exception {
         SmartTv smartTv = new SmartTv();

         System.out.println("TV Ligada :" + smartTv.ligada);
         System.out.println("Canal Atual :" + smartTv.canal);
         System.out.println("Volume Atual :" + smartTv.volume);

         smartTv.aumentarVolume();
         smartTv.diminuirVolume();

         smartTv.ligar();
         smartTv.desligar();

         smartTv.mudarCanal(10);
         smartTv.aumentarCanal();
         smartTv.diminuirCanal();

    }
}
