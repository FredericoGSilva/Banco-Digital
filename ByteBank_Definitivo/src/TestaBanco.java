
public class TestaBanco {
	public static void main(String[] args) {
		
		ClassCliente frederico = new ClassCliente();//Aqui � "literalmente" o perfil do cliente e seus dados: Cliente Frederico
		frederico.nome = "Frederico Guilherme da Silva"; 
		frederico.cpf = "450.458.745-22";
		frederico.profissao = "Programador";
		
		
		
		
		ClassConta contaDoFrederico = new ClassConta(); //Aqui � a conta do cliente no banco: Conta do Frederico
		contaDoFrederico.setTitular(frederico);
		contaDoFrederico.setSaldo(1000);
		contaDoFrederico.mensagens();
		
		
		
		
		
		
		
		
		
		
		/*
		ClassCliente frederico = new ClassCliente();//Aqui � "literalmente" o perfil do cliente e seus dados: Cliente Frederico
		frederico.nome = "Frederico Guilherme da Silva"; 
		frederico.cpf = "450.458.745-22";
		frederico.profissao = "Programador";
		
		ClassConta contaDoFrederico = new ClassConta(); //Aqui � a conta do cliente no banco: Conta do Frederico
		contaDoFrederico.setTitular(frederico);
		contaDoFrederico.setSaldo(1000);
		contaDoFrederico.sacarValor(500);
		/*--------------------------------------------------------------------------------------------------------------------------------------------*/
		/*
		ClassCliente elizabeth = new ClassCliente();
		
		elizabeth.nome = "Helizabeth Rosa da Silva";
		elizabeth.cpf = "748.956.154.22";
		elizabeth.profissao = "N�o declarada";
		
		ClassConta contaDaElizabeth = new ClassConta();
		
		contaDaElizabeth.setTitular(elizabeth);
		contaDaElizabeth.setSaldo(55108);
		contaDaElizabeth.transferirValor(3500, contaDoFrederico);Conta da helizabeth est� fazendo uma transfer�ncia para a conta do Frederico
		*/
	}
}
