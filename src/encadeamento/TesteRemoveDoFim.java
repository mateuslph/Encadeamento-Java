package encadeamento;

public class TesteRemoveDoFim {

	public static void main(String[] args) throws IllegalAccessException {
		
		ListaEncadeada lista = new ListaEncadeada(args);
		lista.adiciona("Guilherme");
		lista.adiciona("Felipe");
		lista.adiciona("Letícia");
		lista.removeDoFim();
		System.out.println(lista);

	}

}
