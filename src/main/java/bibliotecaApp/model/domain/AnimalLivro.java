package bibliotecaApp.model.domain;

public class AnimalLivro extends Livro {

	private String especie;
	private String habitat;
	private String dieta;
	
	@Override
	public String toString() {
		return super.toString() + "; Animal: " + especie;
	}

	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getDieta() {
		return dieta;
	}
	public void setDieta(String dieta) {
		this.dieta = dieta;
	}
}
