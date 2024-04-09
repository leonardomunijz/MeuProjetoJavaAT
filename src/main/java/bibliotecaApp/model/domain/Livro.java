package bibliotecaApp.model.domain;

public class Livro {

	private String titulo;
	private String autor;
	private int	anoPublicacao;
	private String genero;
	private boolean disponibilidade;
	private Integer id;

	public Livro(){
		this.setTitulo("As Aventuras de Alice no País das Maravilhas");
		this.setAutor("Lewis Carroll");
		this.setAnoPublicacao(1865);
		this.setGenero("Fantasia / Aventura / Literatura Infantojuvenil");
		this.setDisponibilidade(true);
	}

	public Livro(String titulo){
		this.setTitulo("As Aventuras de Alice no País das Maravilhas");
		this.setAutor("Lewis Carroll");
		this.setAnoPublicacao(1865);
		this.setGenero("Fantasia / Aventura / Literatura Infantojuvenil");
		this.setDisponibilidade(true);
	}

	public Livro(String titulo, String autor, int anoPublicacao, String genero, boolean disponibilidade){
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setAnoPublicacao(anoPublicacao);
		this.setGenero(genero);
		this.setDisponibilidade(disponibilidade);
	}

	@Override
	public String toString() {
		return "Titulo do Livro: " + getTitulo() + "; Autor: " + getAutor() + "; Ano de Publicação: " + getAnoPublicacao() + "; Gênero: " + getGenero();
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}