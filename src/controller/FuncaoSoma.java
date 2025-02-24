package controller;

public class FuncaoSoma {

	public FuncaoSoma() {
		super();
	}
	public int FuncSoma(int n) {
		if (n == 0) {
			return 0;
		}
		return (n % 10) + FuncSoma(n/10);
	}
}