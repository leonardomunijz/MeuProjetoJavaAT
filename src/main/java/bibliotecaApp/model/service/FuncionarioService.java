package bibliotecaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import bibliotecaApp.model.domain.Funcionario;

public class FuncionarioService {

	private static Map<Integer, Funcionario> funcionarios = new HashMap<Integer, Funcionario>();
	
	private static Integer id = 0;
	
	public static void incluir(Funcionario funcionario) {
		
		funcionario.setId(++id);
		
		funcionarios.put(funcionario.getId(), funcionario);
	}

	public static void excluir(Integer id) {
		funcionarios.remove(id);
	}
	
	public static Collection<Funcionario> obterLista() {
		return funcionarios.values();
	}
	
	public static Funcionario obterPorId(Integer id) {
		return funcionarios.get(id);
	}
}