package src.banco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import src.contas.Conta;

public class Banco {
    private String nomeDoBanco;

    public static List<Conta> lista = new ArrayList<>();

    public static void listaDeClientes(Conta clientes) {
        lista.add(clientes);
    }
    
    public static void imprimirLista() {
        Iterator<Conta> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getCliente().getNome());
    }
}

    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public void setNomeDoBanco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

}
