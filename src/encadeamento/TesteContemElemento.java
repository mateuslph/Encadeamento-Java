package encadeamento;

public class TesteContemElemento {

	public static void main(String[] args) {
		
		ListaEncadeada lista = new ListaEncadeada(args);
		lista.adiciona("Guilherme");
		lista.adiciona("Felipe");
		System.out.println(lista.contem("Guilherme"));
		System.out.println(lista.contem("Letícia"));

	}

}
