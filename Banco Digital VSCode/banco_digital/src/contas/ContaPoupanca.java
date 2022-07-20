package src.contas;

import src.cliente.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void verificarSaldo() {
        Saldo();
        
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\nExtrato Conta Poupança ===");
        imprimirInformacoesConta();
    } 
    
}
