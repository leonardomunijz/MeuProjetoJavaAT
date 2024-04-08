package bibliotecaApp;

import bibliotecaApp.controller.FuncionarioController;
import bibliotecaApp.controller.UsuarioController;
import bibliotecaApp.controller.BibliotecaController;
import bibliotecaApp.controller.LivrosAnimaisController;
import bibliotecaApp.controller.LivrosEsportesController;

import spark.Spark;

public class App {

	public static void main(String[] args) {
		
		Spark.port(8080);
		
		Spark.get("/", (req, res) -> {return App.class.getResourceAsStream("/index.html");});

		//USU�RIO
		Spark.get("/usuario/lista", new UsuarioController());
		Spark.get("/usuario/:nome/incluir", FuncionarioController.incluir);
		Spark.get("/usuario/:id/excluir", FuncionarioController.excluir);
		Spark.get("/usuario/:id", FuncionarioController.obter);

		//FUNCION�RIO
		Spark.get("/funcionario/lista", FuncionarioController.obterLista);
		Spark.get("/funcionario/:nome/incluir", FuncionarioController.incluir);
		Spark.get("/funcionario/:id/excluir", FuncionarioController.excluir);
		Spark.get("/funcionario/:id", FuncionarioController.obter);

		Spark.get("/livrosAnimais/lista", new LivrosAnimaisController());
		Spark.get("/livrosEsportes/lista", new LivrosEsportesController());

		Spark.get("/biblioteca/lista", new BibliotecaController());
	}
}