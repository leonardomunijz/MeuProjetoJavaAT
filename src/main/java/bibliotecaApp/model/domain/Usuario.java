package bibliotecaApp.model.domain;

public class Usuario {

	private String nome;
	private String email;
	private int idade;

	public Usuario() {
		this.setNome("Elberth Moraes");
	}
	
	public Usuario(String nome) {
		this.setNome(nome);
	}
	
	@Override
	public String toString() {
		return "A inclusão do usuário " + nome + " foi realizada com sucesso!";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
