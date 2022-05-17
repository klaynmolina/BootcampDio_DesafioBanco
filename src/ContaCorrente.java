
public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}

	@Override
	public void extrato() {
		System.out.println("****Extrato Conta Poupança****");
		super.InfoComum();
		
	}

}
