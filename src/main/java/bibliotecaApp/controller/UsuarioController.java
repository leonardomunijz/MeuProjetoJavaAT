package bibliotecaApp.controller;

import bibliotecaApp.model.domain.Usuario;
import spark.Request;
import spark.Response;
import spark.Route;

public class UsuarioController implements Route {

	@Override
	public String handle(Request request, Response response) throws Exception {

		StringBuilder html = new StringBuilder();

		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario("Pedro", "pedro@email.com", 28);

		html.append("<!DOCTYPE html>");
		html.append("<html>");
		html.append("<head>");
		html.append("<title>Lista de Usuários</title>");
		html.append("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n" +
				"  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n" +
				"  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n" +
				"  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>");
		html.append("</head>");
		html.append("<body>");
		html.append("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n" +
				"  <div class=\"container\">\n" +
				"    <a class=\"navbar-brand\" href=\"/\">BibliotecaApp</a>\n" +
				"    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
				"      <span class=\"navbar-toggler-icon\"></span>\n" +
				"    </button>\n" +
				"    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n" +
				"      <ul class=\"navbar-nav ml-auto\">\n" +
				"        <li class=\"nav-item\">\n" +
				"          <a class=\"nav-link\" href=\"/\">Home</a>\n" +
				"        </li>\n" +
				"        <li class=\"nav-item active\">\n" +
				"          <a class=\"nav-link\" href=\"/usuario/lista\">Usuários</a>\n" +
				"        </li>\n" +
				"        <li class=\"nav-item\">\n" +
				"          <a class=\"nav-link\" href=\"/funcionario/lista\">Funcionários</a>\n" +
				"        </li>\n" +
				"        <li class=\"nav-item dropdown\">\n" +
				"          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
				"            Livros\n" +
				"          </a>\n" +
				"          <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n" +
				"            <a class=\"dropdown-item\" href=\"/livrosAnimais/lista\">Livros de animais</a>\n" +
				"            <a class=\"dropdown-item\" href=\"/livrosEsportes/lista\">Livros de esportes</a>\n" +
				"            <!-- <a class=\"dropdown-item\" href=\"#\">Livros didáticos</a> -->\n" +
				"          </div>\n" +
				"        </li>\n" +
				"        <li class=\"nav-item\">\n" +
				"          <a class=\"nav-link\" href=\"/biblioteca/lista\">Bibliotecas</a>\n" +
				"        </li>\n" +
				"      </ul>\n" +
				"    </div>\n" +
				"  </div>\n" +
				"</nav>");
		html.append("<section class=\"container mt-5 content\">\n" +
				"  <div class=\"row\">\n" +
				"    <div class=\"col-md-8 offset-md-2\">");
		html.append("<h2>Lista de Usuários</h2><br>");

		html.append("<ul class=\"list-group\">\n" +
				"    <li class=\"list-group-item\">\n" +
				"        <h4>Usuário #1:</h4>\n" +
				"    </li>\n" +
				"    <li class=\"list-group-item\">\n" +
				"        <strong>Nome:</strong> <span class=\"text-muted\">"+usuario1.getNome()+"</span>\n" +
				"    </li>\n" +
				"    <li class=\"list-group-item\">\n" +
				"        <strong>E-mail:</strong> <span class=\"text-muted\">"+usuario1.getEmail()+"</span>\n" +
				"    </li>\n" +
				"    <li class=\"list-group-item\">\n" +
				"        <strong>Idade:</strong> <span class=\"text-muted\">"+usuario1.getIdade()+"</span>\n" +
				"    </li>\n" +
				"</ul>\n");

		html.append("<ul class=\"list-group\">\n" +
				"    <li class=\"list-group-item\">\n" +
				"        <h4>Usuário #2:</h4>\n" +
				"    </li>\n" +
				"    <li class=\"list-group-item\">\n" +
				"        <strong>Nome:</strong> <span class=\"text-muted\">"+usuario2.getNome()+"</span>\n" +
				"    </li>\n" +
				"    <li class=\"list-group-item\">\n" +
				"        <strong>E-mail:</strong> <span class=\"text-muted\">"+usuario2.getEmail()+"</span>\n" +
				"    </li>\n" +
				"    <li class=\"list-group-item\">\n" +
				"        <strong>Idade:</strong> <span class=\"text-muted\">"+usuario2.getIdade()+"</span>\n" +
				"    </li>\n" +
				"</ul>\n");
		html.append("<br><br><a href=\"/\" class=\"btn btn-primary\">Voltar</a>");
		html.append("</section></div></div>");
		html.append("</body>");
		html.append("</html>");


		
		return html.toString();
	}
}