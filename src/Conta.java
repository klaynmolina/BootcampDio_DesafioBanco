
public abstract class Conta implements InterfaceConta {

	protected Banco banco;
	protected Cliente cliente;
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	public Conta(Cliente cliente, Banco banco) {
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
		this.banco = banco;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public Banco getBanco() {
		return banco;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	

	@Override
	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
		//saldo += valor;
	}

	@Override
	public void saque(double valor) {
		this.saldo = this.saldo - valor;
		//saldo -= valor;
	}

	@Override
	public void transferencia(Conta destinatario, double valor) {
		this.saldo = this.saldo - valor; //this.saque(valor);
		destinatario.saldo = destinatario.saldo + valor; //destinatario.deposito(valor);
	}
	
	protected void InfoComum() {
		System.out.println(String.format("Titular: %s", cliente.getNome()));
		System.out.println(String.format("Agencia: %d", agencia));
		System.out.println(String.format("Conta: %d", numeroConta));
		System.out.println(String.format("Saldo: %.2f", saldo));
	}

}
