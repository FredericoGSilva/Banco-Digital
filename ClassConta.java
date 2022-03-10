
public class ClassConta {
	private double saldo;
	private int agencia;
	private int numero;
	private String titular;
	
	public void mensagem(double valorAdd) {
		this.saldo += valorAdd;
		System.out.println("Seu saldo é: "+ getSaldo());
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	} 
}
