package bibliotecaApp.model.domain;

public class Funcionario {
	
	private Integer id;

	private String nome;
	private String cargo;
	private float salario;
	
	public Funcionario() {
		this.setNome("Elberth Moraes");
		this.setCargo("Professor");
		this.setSalario(999);
	}
	
	public Funcionario(String nome) {
		this();
		this.setNome(nome);
	}	

	@Override
	public String toString() {
		return String.format("%d: %s - %s - %.2f", id, nome, cargo, salario);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}