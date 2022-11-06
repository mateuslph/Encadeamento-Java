package encadeamento;

public class TesteAdicionaNoComeco {

	public static void main(String[] args) {

		ListaEncadeada lista = new ListaEncadeada(args);
		lista.adicionaListaEncadeadaComeco("Guilherme");
		lista.adicionaListaEncadeadaComeco("Felipe");
		System.out.println(lista);

	}

}
