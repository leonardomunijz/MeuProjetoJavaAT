package bibliotecaApp;

import bibliotecaApp.controller.FuncionarioController;
import bibliotecaApp.controller.UsuarioController;
import spark.Spark;

public class App {

	public static void main(String[] args) {
		
		Spark.port(8080);
		
		Spark.get("/", (req, res) -> {return App.class.getResourceAsStream("/index.html");});

		//USUÁRIO
		Spark.get("/usuario", new UsuarioController());
		
		//FUNCIONÁRIO
		Spark.get("/funcionario/lista", FuncionarioController.obterLista);
		Spark.get("/funcionario/:nome/incluir", FuncionarioController.incluir);
		Spark.get("/funcionario/:id/excluir", FuncionarioController.excluir);
		Spark.get("/funcionario/:id", FuncionarioController.obter);
	}
}