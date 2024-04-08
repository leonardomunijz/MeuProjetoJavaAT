package bibliotecaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import bibliotecaApp.model.domain.Biblioteca;

public class BibliotecaService {

    private static Map<Integer, Biblioteca> bibliotecas = new HashMap<Integer, Biblioteca>();

    private static Integer id = 0;

    public static void incluir(Biblioteca biblioteca) {

        biblioteca.setId(++id);

        bibliotecas.put(biblioteca.getId(), biblioteca);
    }

    public static void excluir(Integer id) {
        bibliotecas.remove(id);
    }

    public static Collection<Biblioteca> obterLista() {
        return bibliotecas.values();
    }

    public static Biblioteca obterPorId(Integer id) {
        return bibliotecas.get(id);
    }
}