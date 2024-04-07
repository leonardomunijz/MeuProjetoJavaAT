package bibliotecaApp.model.domain;

import java.util.List;

public class Biblioteca {

	private String nome;
	private String localizacao;
	private int anoInicialFuncionamento;
	private Funcionario funcionario;
	private List<Livro> livros;

	@Override
	public String toString() {
		return "Biblioteca " + nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public int getAnoInicialFuncionamento() {
		return anoInicialFuncionamento;
	}
	public void setAnoInicialFuncionamento(int anoInicialFuncionamento) {
		this.anoInicialFuncionamento = anoInicialFuncionamento;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
}