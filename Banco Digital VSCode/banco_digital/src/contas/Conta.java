package src.contas;

import src.cliente.Cliente;

import src.interface_conta.InterfaceConta;

public abstract class Conta implements InterfaceConta {

    protected int agencia;
    protected int quantidadeDeContas;
    protected double saldo;
    private static final int AGENCIA_PADRAO = 1; // constante
    private static int SEQUENCIAL = 1; // constante 
    private Cliente cliente; //tipo é refência p/ outra classe

    // Referenciar o cliente poderia ser passado pelo método set mas irei fazer no construtor de Conta

/*    public void setCliente(Cliente cliente) { 
        this.cliente = cliente;
    }*/ 

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.quantidadeDeContas = SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected void Saldo() {
        System.out.println(String.format("Seu saldo é - %.2f", this.saldo));
    }

    @Override
    public void depositar(double valorDoDeposito) {
        saldo += valorDoDeposito;
    }

    @Override
    public void sacar(double valorDoSaque) {
        if (valorDoSaque <= saldo) {
            saldo -= valorDoSaque;
        }
    }

    @Override
    public void transferir(double valorDaTransferencia, Conta destinoDaTransferencia) {
        if (valorDaTransferencia <= saldo) {
            sacar(valorDaTransferencia);
            destinoDaTransferencia.depositar(valorDaTransferencia);
        } else {
            System.out.println("A transferência supera o limite do seu saldo.");
        }
    }

    protected void imprimirInformacoesConta() {
        System.out.println("Nome: " + cliente.getNome() 
                            + String.format("\nAgencia: %d", agencia) 
                            + "\nNúmero da Conta: " + quantidadeDeContas
                            + String.format("\nSaldo: %.2f", saldo));
    }
}
