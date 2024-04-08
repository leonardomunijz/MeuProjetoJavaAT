package bibliotecaApp.controller;

import bibliotecaApp.model.domain.LivrosEsportes;
import spark.Request;
import spark.Response;
import spark.Route;

public class LivrosEsportesController implements Route {

    @Override
    public String handle(Request request, Response response) throws Exception {

        StringBuilder html = new StringBuilder();

        LivrosEsportes livro = new LivrosEsportes();

        html.append(livro);

        html.append("<br><br><button onclick=\"window.location.href='/'\">Voltar</button>");

        return html.toString();
    }
}