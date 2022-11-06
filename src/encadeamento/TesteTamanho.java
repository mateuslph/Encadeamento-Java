package encadeamento;

public class TesteTamanho {

	public static void main(String[] args) {

		ListaEncadeada lista = new ListaEncadeada(args);
		lista.adiciona("Guilherme");
		lista.adiciona("Felipe");
		System.out.println(lista.tamanho());
		lista.adiciona("Letícia");
		System.out.println(lista.tamanho());

	}

}
