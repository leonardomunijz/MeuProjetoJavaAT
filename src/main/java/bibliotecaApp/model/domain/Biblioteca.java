package bibliotecaApp.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private String nome;
	private String localizacao;
	private int anoInicialFuncionamento;
	private Funcionario funcionario;
	private List<Livro> livros;

	public Biblioteca() {
		this.setNome("Biblioteca XYZ");
		this.setLocalizacao("Rio de Janeiro, RJ");
		this.setAnoInicialFuncionamento(2024);
		this.setFuncionario(new Funcionario());
		this.setLivros(new ArrayList<Livro>());
	}

	@Override
	public String toString() {
		return "Nome da Biblioteca: " + getNome() + "; Localização: " + getLocalizacao() + "; Funcionário: " + getFuncionario() + "; Livros: " + getLivros();
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