public interface NavegadorInternet {
  public void abrirNavegador();
  public void fecharNavegador();
  public void exibirPagina(String url);
  public void adicionarNovaAba();
  public void atualizarPagina();
  public boolean isNavegadorAberto();
}
