public interface ReprodutorMusical {
  public void abrirReprodutor();
  public void fecharReprodutor();
  public void tocar();
  public void pausar();
  public void selecionarMusica(String musica);
  public boolean isReprodutorAberto(); // Adiciona este método para verificar o estado do reprodutor
}