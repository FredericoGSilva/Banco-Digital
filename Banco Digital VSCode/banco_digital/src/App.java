package src;

import src.cliente.Cliente;
import src.contas.Conta;
import src.contas.ContaCorrente;
import src.contas.ContaPoupanca;

public class App {
    public static void main(String[] args) {

        Cliente frederico = new Cliente();
        frederico.setNome("Frederico G. Silva");
        frederico.setCpf("55555555555");
        frederico.setTelefone(11111111);
        
        Cliente miriam = new Cliente();
        miriam.setNome("Miriam Rosa de Souza");
        miriam.setCpf("11111111111");
        miriam.setTelefone(77777777);

        Conta contaDoFrederico = new ContaCorrente(frederico);
        Conta contaDaMiriam = new ContaPoupanca(miriam);

        contaDoFrederico.depositar(15000);
        //contaDoFrederico.verificarSaldo();
        contaDoFrederico.imprimirExtrato();
        contaDoFrederico.transferir(250, contaDaMiriam);
        
        contaDaMiriam.imprimirExtrato();

        contaDoFrederico.imprimirExtrato();

    }
}
