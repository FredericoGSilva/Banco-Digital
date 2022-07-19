package ByteBank_Aula_nivel3;

import javax.swing.JOptionPane;

public class ClassConta {
    private double saldo;
    private int agencia;
    private int numero;
    private ClassCliente titular;

    public ClassConta(int agencia, int numero) {// Construtor
        this.agencia = agencia;
        this.numero = numero;
    }

    public void mensagemSaldo() {
        System.out.println("\nO seu saldo é " + getSaldo());
    }

    public boolean sacarDinheiro(double valorSacar) {
        if (this.saldo >= valorSacar) {
            this.saldo -= valorSacar;
            System.out.println("\nSaldo atualizado: " + getSaldo());
            return true;
        } else {
            System.out.println("\nO valor que deseja sacar ultrapassa seu saldo.");
            return false;
        }
    }

    public void depositaNaMinhaConta(double valorDepositar) {
        this.saldo += valorDepositar;
        System.out.println("\nFoi depositado na sua conta: " + valorDepositar);
        System.out.println("Saldo atualizado: " + getSaldo());
    }

    public boolean transferirParaOutraConta(double valorTranferir, ClassConta destino) {
        if (this.saldo >= valorTranferir) {
            this.saldo -= valorTranferir;
            // destino.saldo -= valorTranferir;
            destino.depositaNaMinhaConta(valorTranferir);// Estou reaproveitando o método depositaNaMinhaConta
            return true;
        } else {
            return false;
        }
    }

    int laco;

    public void mensagens() {

        int qualAagencia = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua agencia? "));
        int qualOnumero = Integer.parseInt(JOptionPane.showInputDialog("Qual o número? "));

        if (qualAagencia == this.agencia && qualOnumero == this.numero) {

            while (laco != 5) {

                int opcao = Integer
                        .parseInt(JOptionPane.showInputDialog("1 - Consultar seu saldo.\n2 - Fazer um saque.\n"
                                + "3 - Depositar um valor na minha conta.\n4 - Fazer uma transferência para outra conta.\n5 - Sair."));

                switch (opcao) {
                    case 1:
                        mensagemSaldo();
                        break;
                    case 2:
                        double valorSacar = Double
                                .parseDouble(JOptionPane.showInputDialog("Qual o valor que deseja sacar? "));// Descobir
                                                                                                             // pq
                                                                                                             // não está
                                                                                                             // funcionando
                        sacarDinheiro(valorSacar);
                        break;
                    case 3:
                        double valorDepositar = Double
                                .parseDouble(JOptionPane.showInputDialog("Qual o valor deseja depositar? "));
                        depositaNaMinhaConta(valorDepositar);
                        break;
                    case 4:
                        double valorDaTransferencia = Double
                                .parseDouble(JOptionPane.showInputDialog("Qual o valor da tranferência? "));
                        transferirParaOutraConta(valorDaTransferencia, null);// Como fazer a transferencia p/ outra
                                                                             // conta?
                        break;
                    case 5:
                        if (opcao == 5) {
                            laco = 5;
                        }
                        break;
                    default:
                        System.out.println("ERRO.");
                        break;
                }
            }
        } else {
            System.out.println("Algo está errado.");
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