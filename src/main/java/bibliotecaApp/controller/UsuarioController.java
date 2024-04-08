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
		Usuario usuario2 = new Usuario("Pedro Almeida", "pedro@email.com", 28);

		html.append("<!DOCTYPE html>");
		html.append("<html>");
		html.append("<head>");
		html.append("<title>Lista de Usuários - BibliotecaApp</title>");
		html.append("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n" +
				"  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n" +
				"  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n" +
				"  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>");
		html.append("<style>");
		html.append(".footer {\n" +
				"      background-color: #f8f9fa;\n" +
				"      padding: 20px 0;\n" +
				"      text-align: center;\n" +
				"      position: fixed;\n" +
				"      bottom: 0;\n" +
				"      width: 100%;\n" +
				"    }\n" +
				"    .content {\n" +
				"      margin-bottom: 100px; /* Espaço extra na parte inferior do conteúdo principal */\n" +
				"    }\n" +
				"    .footer {\n" +
				"      background-color: #F5F5DC; /* Cor de fundo mais clara */\n" +
				"    }\n" +
				"    .footer a {\n" +
				"      color: #000000; /* Cor do texto dos links */\n" +
				"    }");
		html.append("</style>");
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
		html.append("<h3>Lista de Usuários</h3><br>");
		html.append("<a href=\"/\" class=\"btn btn-success mr-2\">Criar Usuário</a>");
		html.append("<a href=\"/\" class=\"btn btn-dark\">Voltar à Página Home</a>\n");

		html.append("<div class=\"container mt-5\">\n" +
				"    <div class=\"row\">\n" +
				"        <div class=\"col-md-8\">\n" +
				"            <!-- Lista de usuário -->\n" +
				"            <ul class=\"list-group\">\n" +
				"                <li class=\"list-group-item\">\n" +
				"                    <h4>Usuário #1:</h4>\n" +
				"                </li>\n" +
				"                <li class=\"list-group-item\">\n" +
				"                    <strong>Nome:</strong> <span class=\"text-muted\">"+usuario1.getNome()+"</span>\n" +
				"                </li>\n" +
				"                <li class=\"list-group-item\">\n" +
				"                    <strong>E-mail:</strong> <span class=\"text-muted\">"+usuario1.getEmail()+"</span>\n" +
				"                </li>\n" +
				"                <li class=\"list-group-item\">\n" +
				"                    <strong>Idade:</strong> <span class=\"text-muted\">"+usuario1.getIdade()+"</span>\n" +
				"                </li>\n" +
				"            </ul>\n" +
				"        </div>\n" +
				"        <div class=\"col-md-4\">\n" +
				"            <!-- Botões -->\n" +
				"            <div class=\"text-center mt-3 mt-md-0\">\n" +
				"                <a href=\"/usuario/1/\" class=\"btn btn-primary btn-block mb-2\">Editar</a> <!-- Adicionado 'btn-block' para ocupar toda a largura -->\n" +
				"                <a href=\"/usuario/1\" class=\"btn btn-secondary btn-block mb-2\">Informações</a> <!-- Adicionado 'btn-block' para ocupar toda a largura -->\n" +
				"                <a href=\"/usuario/1/excluir\" class=\"btn btn-danger btn-block\">Excluir</a> <!-- Adicionado 'btn-block' para ocupar toda a largura -->\n" +
				"            </div>\n" +
				"        </div>\n" +
				"    </div>\n" +
				"</div>\n");

		html.append("<div class=\"container mt-5\">\n" +
				"    <div class=\"row\">\n" +
				"        <div class=\"col-md-8\">\n" +
				"            <!-- Lista de usuário -->\n" +
				"            <ul class=\"list-group\">\n" +
				"                <li class=\"list-group-item\">\n" +
				"                    <h4>Usuário #2:</h4>\n" +
				"                </li>\n" +
				"                <li class=\"list-group-item\">\n" +
				"                    <strong>Nome:</strong> <span class=\"text-muted\">"+usuario2.getNome()+"</span>\n" +
				"                </li>\n" +
				"                <li class=\"list-group-item\">\n" +
				"                    <strong>E-mail:</strong> <span class=\"text-muted\">"+usuario2.getEmail()+"</span>\n" +
				"                </li>\n" +
				"                <li class=\"list-group-item\">\n" +
				"                    <strong>Idade:</strong> <span class=\"text-muted\">"+usuario2.getIdade()+"</span>\n" +
				"                </li>\n" +
				"            </ul>\n" +
				"        </div>\n" +
				"        <div class=\"col-md-4\">\n" +
				"            <!-- Botões -->\n" +
				"            <div class=\"text-center mt-3 mt-md-0\">\n" +
				"                <a href=\"/usuario/2\" class=\"btn btn-primary btn-block mb-2\">Editar</a> <!-- Adicionado 'btn-block' para ocupar toda a largura -->\n" +
				"                <a href=\"/usuario/2\" class=\"btn btn-secondary btn-block mb-2\">Informações</a> <!-- Adicionado 'btn-block' para ocupar toda a largura -->\n" +
				"                <a href=\"/usuario/2/excluir\" class=\"btn btn-danger btn-block\">Excluir</a> <!-- Adicionado 'btn-block' para ocupar toda a largura -->\n" +
				"            </div>\n" +
				"        </div>\n" +
				"    </div>\n" +
				"</div>\n");

		html.append("");
		// html.append("<br><a href=\"/\" class=\"btn btn-dark\">Voltar á Página Home</a>\n" + "</div>\n");
		html.append("</section></div></div><br><br>");

		html.append("<footer class=\"footer\">\n" +
				"  <div class=\"container\">\n" +
				"    <a href=\"https://github.com/leonardomunijz/MeuProjetoJavaAT\" target=\"_blank\"><img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/9/91/Octicons-mark-github.svg/512px-Octicons-mark-github.svg.png\" alt=\"GitHub\" width=\"30\" height=\"30\"></a><br>\n" +
				"    <p>&copy; 2024 BibliotecaApp. Todos os direitos reservados.</p>\n" +
				"  </div>\n" +
				"</footer>");

		html.append("</body>");
		html.append("</html>");


		
		return html.toString();
	}
}