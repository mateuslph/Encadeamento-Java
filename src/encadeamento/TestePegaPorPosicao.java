package encadeamento;

public class TestePegaPorPosicao {

	public static void main(String[] args) throws IllegalAccessException {
		
		ListaEncadeada lista = new ListaEncadeada(args);
		lista.adiciona("Guilherme");
		lista.adiciona("Felipe");
		lista.adiciona("Letícia");
		System.out.println(lista.pega(1));

	}

}
