public class Usuario {
    public static void main(String[] args) throws Exception {
    
        smartTv Smart = new smartTv();

        System.out.println("Tv Ligada ? " + Smart.ligada);
        System.out.println("Canal atual: " + Smart.canal);
        System.out.println("volume atual: " + Smart.volume);
        
        Smart.ligar();
        System.out.println("Novo status - Tv Ligada ? " + Smart.ligada);

        Smart.diminuirVolume();
        Smart.diminuirVolume();
        Smart.diminuirVolume();
        System.out.println("volume atual: " + Smart.volume);

        Smart.mudarCanal(13);
        System.out.println("Canal atualizado: " + Smart.canal);

        Smart.DiminuirCanal();
        Smart.DiminuirCanal();
        Smart.DiminuirCanal();
        Smart.DiminuirCanal();
        System.out.println("Canal atualizado: " + Smart.canal);

        Smart.desligar();
        System.out.println("Novo status - Tv Ligada ? " + Smart.ligada);

    }
}
