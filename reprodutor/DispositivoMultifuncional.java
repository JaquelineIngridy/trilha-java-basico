package reprodutor;

interface IReprodutor {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

interface IAparelho {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

interface INavegador {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

public class DispositivoMultifuncional implements IReprodutor, IAparelho, INavegador {
    
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }


    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public static void main(String[] args) {
        DispositivoMultifuncional dispositivo = new DispositivoMultifuncional();

        System.out.println("Testando Reprodutor Musical:");
        dispositivo.selecionarMusica("Fortnight");
        dispositivo.tocar();
        dispositivo.pausar();

        System.out.println("\nTestando Aparelho Telefônico:");
        dispositivo.ligar("123-4567");
        dispositivo.atender();
        dispositivo.iniciarCorreioVoz();

        System.out.println("\nTestando Navegador na Internet:");
        dispositivo.exibirPagina("http://Youtube.com");
        dispositivo.adicionarNovaAba();
        dispositivo.atualizarPagina();
    }
}
