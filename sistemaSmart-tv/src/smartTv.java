public class smartTv {
   boolean ligada = false;
   int canal = 1;
   int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        System.out.println("Aumentando canal para: "+ canal);
        canal++;
    }
    public void DiminuirCanal(){
        System.out.println("Diminuindo canal para: "+ canal);
        canal--;
    }
    public void aumentarVolume(){
        System.out.println("Aumentando o volume para: " + volume);
        volume++;
    }
    public void diminuirVolume(){
        System.out.println("Diminuindo o volume para: " + volume);
        volume--;
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}

