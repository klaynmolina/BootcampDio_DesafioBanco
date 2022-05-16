
public abstract class Conta implements InterfaceConta {

	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
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
		
	}

	@Override
	public void saque(double valor) {
		
	}

	@Override
	public void transferencia(Conta destinatario, double valor) {
		
	}

}
