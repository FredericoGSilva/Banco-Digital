package src.contas;

import src.cliente.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void verificarSaldo() {
        Saldo();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\nExtrato Conta Corrente ===");
        imprimirInformacoesConta();
    }

    
}
