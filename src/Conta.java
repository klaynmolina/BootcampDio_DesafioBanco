
public abstract class Conta implements InterfaceConta {

	private int agencia;
	private int numeroConta;
	private double saldo;

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
