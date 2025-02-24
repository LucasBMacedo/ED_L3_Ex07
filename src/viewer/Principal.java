package viewer;

import javax.swing.JOptionPane;

import controller.FuncaoSoma;

public class Principal {

	public static void main(String[] args) {
		FuncaoSoma fs = new FuncaoSoma();
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero innteiro."));
		JOptionPane.showMessageDialog(null, "A soma dos digitos de " + numero + " é: " + fs.FuncSoma(numero) + ".");
	}
}