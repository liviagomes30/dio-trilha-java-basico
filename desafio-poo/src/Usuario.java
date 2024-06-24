public class Usuario {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    // Testando funcionalidades de telefone
    System.out.println("Testando funcionalidades de telefone:");
    iphone.ligar("9999-9999");
    iphone.atender();

    // Testando funcionalidades do navegador
    System.out.println("\nTestando funcionalidades do navegador:");
    iphone.abrirNavegador();
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();
    iphone.exibirPagina("http://example.com");
    iphone.fecharNavegador();

    // Testando funcionalidades do reprodutor musical
    System.out.println("\nTestando funcionalidades do reprodutor musical:");
    iphone.abrirReprodutor();
    iphone.selecionarMusica("Song A");
    iphone.tocar();
    iphone.pausar();
    iphone.fecharReprodutor();
  }
}
