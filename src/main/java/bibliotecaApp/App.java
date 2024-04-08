package bibliotecaApp;

import bibliotecaApp.controller.FuncionarioController;
import bibliotecaApp.controller.UsuarioController;
import bibliotecaApp.controller.BibliotecaController;
import bibliotecaApp.controller.LivrosAnimaisController;
import bibliotecaApp.controller.LivrosEsportesController;

import spark.Spark;

public class App {

	public static void main(String[] args) {

		System.out.println("--- [INICIALIZADO] App: BibliotecaApp ---");

		Spark.port(8080);

		Spark.get("/", (req, res) -> {return App.class.getResourceAsStream("/index.html");});

		//USU�RIO
		Spark.get("/usuario/lista", new UsuarioController());
		Spark.get("/usuario/:nome/incluir", FuncionarioController.incluir);
		Spark.get("/usuario/:id/excluir", FuncionarioController.excluir);
		Spark.get("/usuario/:id", FuncionarioController.obter);

		//FUNCION�RIO
		Spark.get("/funcionario/lista", new FuncionarioController());
		Spark.get("/funcionario/:nome/incluir", FuncionarioController.incluir);
		Spark.get("/funcionario/:id/excluir", FuncionarioController.excluir);
		Spark.get("/funcionario/:id", FuncionarioController.obter);

		//LIVROS ANIMAIS
		Spark.get("/livrosAnimais/lista", new LivrosAnimaisController());
		Spark.get("/funcionario/:nome/incluir", FuncionarioController.incluir);
		Spark.get("/funcionario/:id/excluir", FuncionarioController.excluir);
		Spark.get("/funcionario/:id", FuncionarioController.obter);

		//LIVROS ESPORTES
		Spark.get("/livrosEsportes/lista", new LivrosEsportesController());
		Spark.get("/funcionario/:nome/incluir", FuncionarioController.incluir);
		Spark.get("/funcionario/:id/excluir", FuncionarioController.excluir);
		Spark.get("/funcionario/:id", FuncionarioController.obter);

		//BIBLIOTECA
		Spark.get("/biblioteca/lista", new BibliotecaController());
		Spark.get("/biblioteca/:nome/incluir", BibliotecaController.incluir);
		Spark.get("/biblioteca/:id/excluir", BibliotecaController.excluir);
		Spark.get("/biblioteca/:id", BibliotecaController.obter);
	}
}