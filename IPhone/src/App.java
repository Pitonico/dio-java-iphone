import aparelho.IPhone;

public class App {
    public static void main(String[] args)  {
        IPhone iPhone = new IPhone();
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();
    }
}