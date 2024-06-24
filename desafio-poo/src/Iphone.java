import java.util.Random;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
  private boolean ligacaoAtendida = false;
  private boolean reprodutorAberto = false; 
  private boolean navegadorAberto = false;
  private Random random = new Random();

  public boolean isLigacaoAtendida() {
    return ligacaoAtendida;
  }
  @Override
  public void abrirNavegador() {
    navegadorAberto = true;
    System.out.println("Navegador aberto pelo Iphone");
  }
  @Override
  public void fecharNavegador() {
    navegadorAberto = false;
    System.out.println("Navegador fechado pelo Iphone");
  }
  @Override
  public void abrirReprodutor() {
    reprodutorAberto = true;
    System.out.println("Reprodutor aberto pelo Iphone");
  }
  @Override
  public void fecharReprodutor() {
    reprodutorAberto = false;
    System.out.println("Reprodutor fechado pelo Iphone");
  }
  @Override
  public boolean isReprodutorAberto() {
    return reprodutorAberto;
  }

  @Override
  public boolean isNavegadorAberto() {
    return navegadorAberto;
  }
  @Override
  public void atender() {
    System.out.println("Atendendo pelo Iphone");
    ligacaoAtendida = true;
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando Correio de Voz pelo Iphone");
    
  }

  @Override
  public void ligar(String numero) {
    System.out.println("Ligando pelo Iphone para o número: " + numero);
    
    ligacaoAtendida = random.nextBoolean();

    // Verifica se a ligação foi atendida
    if (ligacaoAtendida) {
      System.out.println("Ligação atendida.");
    } else {
      iniciarCorreioVoz();
    }
  }

  @Override
  public void adicionarNovaAba() {
    if(!isNavegadorAberto()){
      abrirNavegador();
    }
    System.out.println("Adicionando nova aba pelo Iphone");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página pelo Iphone");
    
  }

  @Override
  public void exibirPagina(String url) {
    System.out.println("Exibindo página [" + url + "] pelo Iphone");
    
  }

  @Override
  public void pausar() {
    System.out.println("Pausando música pelo Iphone");
    
  }

  @Override
  public void selecionarMusica(String musica) {
    if (!isReprodutorAberto()) {
      abrirReprodutor();
    }
    System.out.println("Selecionando música pelo Iphone");
    
  }

  @Override
  public void tocar() {
    if (!isReprodutorAberto()) {
      abrirReprodutor();
    }
    System.out.println("Tocando música pelo Iphone");
  }
}
