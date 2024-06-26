package bibliotecaApp.model.domain;

public class LivrosEsportes {

	private String titulo;
	private String autor;
	private int	anoPublicacao;
	private String genero;
	private boolean disponibilidade;

	public LivrosEsportes(){
		this.setTitulo("A Arte de Correr na Chuva");
		this.setAutor("Garth Stein");
		this.setAnoPublicacao(2008);
		this.setGenero("Fic��o / Drama / Esportes");
		this.setDisponibilidade(true);
	}

	@Override
	public String toString() {
		return "Titulo do Livro: " + getTitulo() + "; Autor: " + getAutor() + "; Ano de Publica��o: " + getAnoPublicacao() + "; G�nero: " + getGenero();
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
}