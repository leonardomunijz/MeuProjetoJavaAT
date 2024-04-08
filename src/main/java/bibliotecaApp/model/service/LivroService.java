package bibliotecaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import bibliotecaApp.model.domain.Livro;

public class LivroService {

    private static Map<Integer, Livro> livros = new HashMap<Integer, Livro>();

    private static Integer id = 0;

    public static void incluir(Livro livro) {

        livro.setId(++id);

        livros.put(livro.getId(), livro);
    }

    public static void excluir(Integer id) {
        livros.remove(id);
    }

    public static Collection<Livro> obterLista() {
        return livros.values();
    }

    public static Livro obterPorId(Integer id) {
        return livros.get(id);
    }
}