package bibliotecaApp.controller;

import bibliotecaApp.model.domain.Biblioteca;
import spark.Request;
import spark.Response;
import spark.Route;

public class BibliotecaController implements Route {

    @Override
    public String handle(Request request, Response response) throws Exception {

        StringBuilder html = new StringBuilder();

        Biblioteca biblioteca = new Biblioteca();

        html.append(biblioteca);

        html.append("<br><br><button onclick=\"window.location.href='/'\">Voltar</button>");

        return html.toString();
    }
}