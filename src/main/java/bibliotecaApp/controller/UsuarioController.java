package bibliotecaApp.controller;

import bibliotecaApp.model.domain.Usuario;
import spark.Request;
import spark.Response;
import spark.Route;

public class UsuarioController implements Route {

	@Override
	public String handle(Request request, Response response) throws Exception {

		StringBuilder html = new StringBuilder();

		Usuario usuario = new Usuario();
		
		html.append(usuario);
		
		html.append("Voltar, <a href='/'>" + usuario.getNome() + "?</a>");
		
		return html.toString();
	}
}