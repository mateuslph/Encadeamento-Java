package encadeamento;

public class TesteRemoveDoComeco {

	public static void main(String[] args) throws IllegalAccessException {

		ListaEncadeada lista = new ListaEncadeada(args);
		lista.adiciona("Guilherme");
		lista.adiciona("Felipe");
		lista.removeDoComeco();
		System.out.println(lista);

	}

}
