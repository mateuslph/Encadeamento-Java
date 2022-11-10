package encadeamento;

import java.util.Arrays;

/*1. Desenvolva um programa que possibilite a inserção de 25 valores do tipo 
inteiro aleatórios de 0 a 100 em ordem em um objeto de lista encadeada.
Ao final o programa deverá calcular a soma dos elementos e a média em ponto 
flutuante dos elementos.*/

public class TesteAdicionaIntOrdenadoECalcula {

	public static void main(String[] args) throws IllegalAccessException {

		ListaEncadeada lista = new ListaEncadeada(args);
		int[] arrayLista = new int[25];
		int soma = 0;
		double divisao = 0;

		for (int i = 0; i < 25; i++) {
			int v1 = (int) (Math.round(Math.random() * 100));
			arrayLista[i] = v1;
		}

		Arrays.sort(arrayLista);

		for (int i = 0; i < 25; i++) {
			lista.adiciona(arrayLista[i]);
		}

		for (int i = 0; i < lista.getTotalDeElementos(); i++) {
			if (i > 1) {
				soma = soma + (int)lista.pega(i);
			} else {
				soma = (int)lista.pega(i);
			}
		}
		divisao = (double)soma/25;
		System.out.println("A soma é: " + soma);
		System.out.println("A divisão é: " + divisao);
	}
}
