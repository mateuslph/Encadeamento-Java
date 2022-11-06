package encadeamento;

public class RemovePorPosicao {

	public static void main(String[] args) throws IllegalAccessException {

		ListaEncadeada lista = new ListaEncadeada(args);
		lista.adiciona("Guilherme");
		lista.adiciona("Felipe");
		lista.adiciona("Letícia");
		lista.remove(1);
		System.out.println(lista);

	}

}
