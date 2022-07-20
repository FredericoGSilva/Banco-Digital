package src.interface_conta;

import src.contas.Conta;

public interface InterfaceConta {
    
    void sacar(double valorDoSaque);

    void depositar(double valorDoDeposito);

    void transferir(double valorDaTransferencia, Conta destinoDaTransferencia);

    void verificarSaldo();

    void imprimirExtrato();
}
