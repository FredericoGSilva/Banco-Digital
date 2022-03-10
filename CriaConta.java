import java.text.BreakIterator;

import javax.swing.JOptionPane;

public class CriaConta {
	public static void main(String[] args) {
		
		ClassConta newConta = new ClassConta();
		
		newConta.setSaldo(1000);
		
		int QuerAddConta = Integer.parseInt(JOptionPane.showInputDialog
								("Adicionar dinheiro na conta? 1(sim) ou 2(não) "));
		
		if (QuerAddConta == 1) {
			double AddNaConta = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser adicionado: "));
			newConta.mensagem(AddNaConta);
		} else {
			System.out.println("Verificação encerrada.");
		}
	}
}
