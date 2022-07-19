package src;

import src.contas.Conta;
import src.contas.ContaCorrente;
import src.contas.ContaPoupanca;

public class App {
    public static void main(String[] args) {
    
        Conta conta1 = new ContaCorrente();

        System.out.println("Conta Corrente: " + conta1.getQuantidadeDeContas());

        Conta conta2 = new ContaPoupanca();

        System.out.println("Conta Poupança: " + conta2.getQuantidadeDeContas());
    }
}
