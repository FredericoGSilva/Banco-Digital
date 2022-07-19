import javax.swing.JOptionPane;

public class ClassConta {
	private double saldo;
	private int agencia;
	private int numero;
	private ClassCliente titular;// Verificar: getter e setter

	public void consultaSaldo() { // Para consultar o saldo da conta
		if (this.saldo > 0) {
			JOptionPane.showMessageDialog(null, "Seu saldo é " + saldo);
		} else if (this.saldo == 0) {
			JOptionPane.showMessageDialog(null, "Seu saldo está zerado.");
		} else {
			JOptionPane.showMessageDialog(null, "Seu saldo está negativado.");
		}
	}

	public boolean sacarValor(double valorParaSaque) {// Para fazer um saque
		if (this.saldo >= valorParaSaque) {
			this.saldo -= valorParaSaque;
			JOptionPane.showMessageDialog(null, "Você sacou " + valorParaSaque + "\nSaldo atualizado " + saldo);
			return true;
		} else {
			JOptionPane.showMessageDialog(null,
					"O valor que você deseja sacar ultrapassa " + "os limites do seu saldo.");
			return false;
		}
	}

	public void depositarValor(double valorParaDeposito) {
		this.saldo += valorParaDeposito;
		JOptionPane.showMessageDialog(null, "Saldo atualizado: " + saldo);
	}

	public boolean transferirValor(double valorParaTransferir, ClassConta destino) {
		if (this.saldo >= valorParaTransferir) {
			this.saldo -= valorParaTransferir;
			destino.depositarValor(valorParaTransferir);
			return true;
		} else {
			return false;
		}
	}

	int opcao;
	int laco;

	public void mensagens() {

		while (laco != 5) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Consultar seu saldo.\n2 - Fazer um saque.\n"
					+ "3 - Depositar um valor na minha conta.\n4 - Fazer uma transferência para outra conta.\n5 - Sair."));

			switch (opcao) {
			case 1: {
				consultaSaldo();
				break;
			}
			case 2: {
				double valorDoSaque = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do saque? "));
				sacarValor(valorDoSaque);
				break;
			}
			case 3: {
				double valorDoDeposito = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do depósito? "));
				depositarValor(valorDoDeposito);
				break;
			}
			case 4: {
				double valorDaTransferencia = Double
						.parseDouble(JOptionPane.showInputDialog("Qual o valor da tranferência? "));
				transferirValor(valorDaTransferencia, null); //Como fazer a transferencia p/ outra conta?
				break;
			}
			case 5: {
				JOptionPane.showMessageDialog(null, "Sistema finalizado!"); // Como encerrar o programa?
				if (opcao == 5) {
					laco = 5;
				}
				break;
			}
			default: {
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
			}

			}
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ClassCliente getTitular() {
		return titular;
	}

	public void setTitular(ClassCliente titular) {
		this.titular = titular;
	}
}
