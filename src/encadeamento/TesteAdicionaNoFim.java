package encadeamento;

public class TesteAdicionaNoFim {

	public static void main(String[] args) throws IllegalAccessException {
		
		ListaEncadeada lista = new ListaEncadeada(args);
		lista.adiciona("Guilherme");
		lista.adicionaPosicao(0, "Felipe");
		lista.adicionaPosicao(1, "Letícia");
		System.out.println(lista);
		
		
	}
	
}
