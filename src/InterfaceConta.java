
public interface InterfaceConta {
	
	void deposito(double valor);

	void saque(double valor);

	void transferencia(Conta destinatario, double valor);
	
	void extrato();

}
