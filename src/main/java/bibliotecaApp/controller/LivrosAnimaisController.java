package bibliotecaApp.controller;

import bibliotecaApp.model.domain.LivrosAnimais;
import spark.Request;
import spark.Response;
import spark.Route;

public class LivrosAnimaisController implements Route {

    @Override
    public String handle(Request request, Response response) throws Exception {

        StringBuilder html = new StringBuilder();

        LivrosAnimais livro = new LivrosAnimais();

        html.append(livro);

        html.append("<br><br><button onclick=\"window.location.href='/'\">Voltar</button>");

        return html.toString();
    }
}