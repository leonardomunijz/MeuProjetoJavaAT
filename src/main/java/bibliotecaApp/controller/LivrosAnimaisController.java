package bibliotecaApp.controller;

import bibliotecaApp.model.domain.Biblioteca;
import bibliotecaApp.model.domain.Livro;
import bibliotecaApp.model.service.LivroService;
import spark.Request;
import spark.Response;
import spark.Route;

public class LivrosAnimaisController implements Route {

    public static Route obterLista = (req, res) -> {

        return LivroService.obterLista();
    };

    public static Route incluir = (req, res) -> {

        String oNome = req.params("nome");

        Livro livro = new Livro(oNome);

        LivroService.incluir(livro);

        return "Inclus�o realizada com sucesso: "+livro+"!";
    };

    public static Route excluir = (req, res) -> {

        Integer index = Integer.valueOf(req.params("id"));

        Livro livro = LivroService.obterPorId(index);

        LivroService.excluir(index);

        return "Exclus�o realizada com sucesso: "+livro+"!";
    };

    public static Route obter = (req, res) -> {

        Integer index = Integer.valueOf(req.params("id"));

        Livro livro = LivroService.obterPorId(index);

        return "Recupera��o realizada com sucesso: "+livro+"!";
    };

    @Override
    public String handle(Request request, Response response) throws Exception {

        StringBuilder html = new StringBuilder();

        Biblioteca biblioteca1 = new Biblioteca();
        Biblioteca biblioteca2 = new Biblioteca("Biblioteca KidsHappy", "Brasilia, DF", 1999);

        html.append("<!DOCTYPE html>");
        html.append("<html>");
        html.append("<head>");
        html.append("<title>Lista de Livros de Animais - BibliotecaApp</title>");
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
                "      margin-bottom: 100px; /* Espa�o extra na parte inferior do conte�do principal */\n" +
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
                "        <li class=\"nav-item\">\n" +
                "          <a class=\"nav-link\" href=\"/usuario/lista\">Usu�rios</a>\n" +
                "        </li>\n" +
                "        <li class=\"nav-item\">\n" +
                "          <a class=\"nav-link\" href=\"/funcionario/lista\">Funcion�rios</a>\n" +
                "        </li>\n" +
                "        <li class=\"nav-item dropdown active\">\n" +
                "          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
                "            Livros\n" +
                "          </a>\n" +
                "          <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n" +
                "            <a class=\"dropdown-item active\" href=\"/livrosAnimais/lista\">Livros de animais</a>\n" +
                "            <a class=\"dropdown-item\" href=\"/livrosEsportes/lista\">Livros de esportes</a>\n" +
                "            <!-- <a class=\"dropdown-item\" href=\"#\">Livros did�ticos</a> -->\n" +
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
        html.append("<h3>Lista de Livros de Animais</h3><br>");
        html.append("<a href=\"/livrosAnimais/newLivroAnimal/incluir\" class=\"btn btn-success mr-2\">Adicionar Livro</a>");
        html.append("<a href=\"/\" class=\"btn btn-dark\">Voltar � P�gina Home</a>\n");

        html.append("<div class=\"container mt-5\">\n" +
                "    <div class=\"row\">\n" +
                "        <div class=\"col-md-8\">\n" +
                "            <!-- Lista de bibliotecas -->\n" +
                "            <ul class=\"list-group\">\n" +
                "                <li class=\"list-group-item\">\n" +
                "                    <h4>Livro #1:</h4>\n" +
                "                </li>\n" +
                "                <li class=\"list-group-item\">\n" +
                "                    <strong>Nome:</strong> <span class=\"text-muted\">"+biblioteca1.getNome()+"</span>\n" +
                "                </li>\n" +
                "                <li class=\"list-group-item\">\n" +
                "                    <strong>Localiza��o: </strong> <span class=\"text-muted\">"+biblioteca1.getLocalizacao()+"</span>\n" +
                "                </li>\n" +
                "                <li class=\"list-group-item\">\n" +
                "                    <strong>Ano de Funda��o: </strong> <span class=\"text-muted\">"+biblioteca1.getAnoInicialFuncionamento()+"</span>\n" +
                "                </li>\n" +
                "            </ul>\n" +
                "        </div>\n" +
                "        <div class=\"col-md-4\">\n" +
                "            <!-- Bot�es -->\n" +
                "            <div class=\"text-center mt-3 mt-md-0\">\n" +
                "                <a href=\"/usuario/1/\" class=\"btn btn-primary btn-block mb-2\">Editar</a> <!-- Adicionado 'btn-block' para ocupar toda a largura -->\n" +
                "                <a href=\"/usuario/1\" class=\"btn btn-secondary btn-block mb-2\">Informa��es</a> <!-- Adicionado 'btn-block' para ocupar toda a largura -->\n" +
                "                <a href=\"/usuario/1/excluir\" class=\"btn btn-danger btn-block\">Excluir</a> <!-- Adicionado 'btn-block' para ocupar toda a largura -->\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div>\n");

        html.append("<div class=\"container mt-5\">\n" +
                "    <div class=\"row\">\n" +
                "        <div class=\"col-md-8\">\n" +
                "            <!-- Lista de bibliotecas -->\n" +
                "            <ul class=\"list-group\">\n" +
                "                <li class=\"list-group-item\">\n" +
                "                    <h4>Livro #2:</h4>\n" +
                "                </li>\n" +
                "                <li class=\"list-group-item\">\n" +
                "                    <strong>Nome:</strong> <span class=\"text-muted\">"+biblioteca2.getNome()+"</span>\n" +
                "                </li>\n" +
                "                <li class=\"list-group-item\">\n" +
                "                    <strong>Localiza��o:</strong> <span class=\"text-muted\">"+biblioteca2.getLocalizacao()+"</span>\n" +
                "                </li>\n" +
                "                <li class=\"list-group-item\">\n" +
                "                    <strong>Ano de Funda��o:</strong> <span class=\"text-muted\">"+biblioteca2.getAnoInicialFuncionamento()+"</span>\n" +
                "                </li>\n" +
                "            </ul>\n" +
                "        </div>\n" +
                "        <div class=\"col-md-4\">\n" +
                "            <!-- Bot�es -->\n" +
                "            <div class=\"text-center mt-3 mt-md-0\">\n" +
                "                <a href=\"/usuario/2\" class=\"btn btn-primary btn-block mb-2\">Editar</a> <!-- Adicionado 'btn-block' para ocupar toda a largura -->\n" +
                "                <a href=\"/usuario/2\" class=\"btn btn-secondary btn-block mb-2\">Informa��es</a> <!-- Adicionado 'btn-block' para ocupar toda a largura -->\n" +
                "                <a href=\"/usuario/2/excluir\" class=\"btn btn-danger btn-block\">Excluir</a> <!-- Adicionado 'btn-block' para ocupar toda a largura -->\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div>\n");

        html.append("");
        // html.append("<br><a href=\"/\" class=\"btn btn-dark\">Voltar � P�gina Home</a>\n" + "</div>\n");
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