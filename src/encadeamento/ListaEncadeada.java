package encadeamento;

public class ListaEncadeada {

	private ListaEncadeada proximo;
	private ListaEncadeada primeiro;
	private ListaEncadeada ultimo;
	private ListaEncadeada anterior;
	private Object elemento;
	private int totalDeElementos;

	
	public ListaEncadeada(ListaEncadeada proximo, Object elemento) {
		this.proximo = proximo;
		this.elemento = elemento;
	}
	
	public ListaEncadeada(Object elemento) {
		this.elemento = elemento;
	}
	
	public void setProximo(ListaEncadeada proximo) {
		this.proximo = proximo;
	}
	
	public ListaEncadeada getProximo() {
		return proximo;
	}
	
	public ListaEncadeada getAnterior() {
		return anterior;
	}
	
	public void setAnterior(ListaEncadeada anterior) {
		this.anterior = anterior;
		
	}
	
	public void adicionaListaEncadeadaComeco(Object elemento) {
		ListaEncadeada novo = new ListaEncadeada(this.primeiro, elemento);
		this.primeiro = novo;
		
		if(this.totalDeElementos == 0) {
			// caso especial de lista vasia
			
			this.ultimo = this.primeiro;
		}
		this.totalDeElementos++;
	}
	
	public void adiciona(Object elemento) {
		if(this.totalDeElementos == 0) {
			this.adicionaListaEncadeadaComeco(elemento);
		}else {
			ListaEncadeada novo = new ListaEncadeada(elemento);
			this.ultimo.setProximo(novo);
			this.ultimo = novo;
			this.totalDeElementos++;
		}
	}
	
	public void adicionaPosicao(int posicao, Object elemento) throws IllegalAccessException {
		if(posicao == 0) { // no comeco
			this.adicionaListaEncadeadaComeco(elemento);
		} else if(posicao == this.totalDeElementos){ // no fim
			this.adiciona(elemento);
		} else {
			ListaEncadeada anterior = this.pegaListaEncadeada(posicao -1);
			ListaEncadeada novo = new ListaEncadeada(anterior.getProximo(), elemento);
			anterior.setProximo(novo);
			this.totalDeElementos++;
		}
	}
	
	public Object pega(int posicao) throws IllegalAccessException {
		return this.pegaListaEncadeada(posicao).getElemento();
	}
	
	public void remove(int posicao) throws IllegalAccessException {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não Existe!!");
		}
		if(posicao == 0) {
			this.removeDoComeco();
		} else if(posicao == this.totalDeElementos -1) {
			this.removeDoFim();
		} else {
			ListaEncadeada anterior = this.pegaListaEncadeada(posicao -1);
			ListaEncadeada atual = anterior.getProximo();
			ListaEncadeada proximo = atual.getProximo();
			anterior.setProximo(proximo);
			proximo.setAnterior(anterior);
			this.totalDeElementos--;
		}
	}

	public int tamanho() {
		return this.totalDeElementos;
	}
	
	public boolean contem(Object elemento) {
		ListaEncadeada atual = this.primeiro;
		while(atual != null) {
			if(atual.getElemento().equals(elemento)) {
				return true;
			}
			atual = atual.getProximo();
		}
		return false;
	}
	
	public void removeDoComeco() throws IllegalAccessException {
		if(!this.posicaoOcupada(0)) {
			throw new IllegalAccessException("Posição não Existe!!");
		}
			this.primeiro = this.primeiro.getProximo();
			this.totalDeElementos--;
			if(this.totalDeElementos == 0) {
				this.ultimo = null;
			}
	}
	
	public void removeDoFim() throws IllegalAccessException {
		if(!this.posicaoOcupada(this.totalDeElementos -1)) {
			throw new IllegalAccessException("Posição não Existe!!");
		}
		if(this.totalDeElementos == 1) {
			this.removeDoComeco();
		} else {
			ListaEncadeada novo = new ListaEncadeada(elemento);
			this.ultimo.setProximo(novo);
			novo.setAnterior(this.ultimo);
			this.ultimo = novo;
			ListaEncadeada penultima = this.ultimo.getAnterior();
			penultima.setProximo(null);
			this.ultimo = penultima;
			
			this.totalDeElementos--;
		}
	}
	
	public boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	public ListaEncadeada pegaListaEncadeada(int posicao) throws IllegalAccessException {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalAccessException("Posição não Existe!!");
		}
		ListaEncadeada atual = primeiro;
		for(int i=0; i<posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	
	public ListaEncadeada getPrimeiro() {
		return primeiro;
	}
	
	public void setPrimeiro (ListaEncadeada primeiro) {
		this.primeiro = primeiro;
	}
	
	public ListaEncadeada getUltimo () {
		return ultimo;
	}
	
	public void setUltimo(ListaEncadeada ultimo) {
		this.ultimo = ultimo;
	}
	
	public int getTotalDeElementos() {
		return totalDeElementos;
	}
	
	public void setTotalDeElementos(int totalDeElementos) {
		this.totalDeElementos = totalDeElementos;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		ListaEncadeada temp = primeiro;
		
		for(int i=0; i<this.totalDeElementos; i++) {
			sb.append(temp.getElemento()+ "");
			temp = temp.getProximo();
		}
		return sb.toString();
	}
	
	public Object getElemento() {
		return elemento;
	}
	
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

}
