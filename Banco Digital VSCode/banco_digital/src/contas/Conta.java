package src.contas;

import src.interface_conta.InterfaceConta;

public abstract class Conta implements InterfaceConta {

    protected int agencia;
    protected int quantidadeDeContas;
    protected double saldo = 0;
    private static final int AGENCIA_PADRAO = 1; // constante
    private static int SEQUENCIAL = 1; // constante 

    public int getAgencia() {
        return agencia;
    }

    public static int getAgenciaPadrao() {
        return AGENCIA_PADRAO;
    }

    public int getQuantidadeDeContas() {
        return quantidadeDeContas;
    }

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.quantidadeDeContas = SEQUENCIAL++;
    }

    @Override
    public void depositar(double valorDoDeposito) {
        
    }

    @Override
    public void sacar(double valorDoSaque) {
        
    }

    @Override
    public void transferir(double valorDaTransferencia, Conta destinoDaTransferencia) {
        
    }

}
