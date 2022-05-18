
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}

	@Override
	public void extrato() {
		System.out.println("****Extrato Conta Corrente****");
		super.InfoComum();
	}
	
	@Override
	public String toString() {
		return "Conta Poupança \n"
				+ cliente 
				+"\n"+ banco  
				+ "\nAgencia: " + agencia 
				+ "\nNumero_Conta: " + numeroConta 
				+ "\nSaldo: " + saldo;
	}

}
