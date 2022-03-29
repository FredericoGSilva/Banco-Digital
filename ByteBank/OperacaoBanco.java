package ByteBank_Aula_nivel3;

public class OperacaoBanco {
    public static void main(String[] args) {

        ClassCliente frederico = new ClassCliente();// Informações pessoais do cliente
        frederico.setNome("Frederico Guilherme da Silva");
        frederico.setCpf("222.222.222-22");
        frederico.setProfissao("Programador");

        ClassConta contaDoFrederico = new ClassConta(123, 1451);// Criando a conta do cliente
        contaDoFrederico.setTitular(frederico);
        contaDoFrederico.setSaldo(20000);
    }
}
