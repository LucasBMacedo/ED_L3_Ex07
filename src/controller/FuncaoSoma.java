package controller;

public class FuncaoSoma {

	public FuncaoSoma() {
		super();
	}
	public int FuncSoma(int n) {
		if (n == 0) {
			return 0; // Parada para somar um número nulo.
		}
		return (n % 10) + FuncSoma(n/10); // Esta somando os restos com a chamado da funcao (Tive como base o exercicio 2).
	}
}