
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}

	@Override
	public void extrato() {
		System.out.println("****Extrato Conta Corrente****");
		super.InfoComum();
		
	}
	
}
