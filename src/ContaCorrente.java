public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}

	@Override
	public void extrato() {
		System.out.println("****Extrato Conta Poupança****");
		super.InfoComum();
	}

	@Override
	public String toString() {
		return "Conta Corrente \n"
				+ cliente 
				+"\n"+ banco 
				+ "\nAgencia: " + agencia 
				+ "\nNumero_Conta: " + numeroConta 
				+ "\nSaldo: " + saldo;
	}

}
