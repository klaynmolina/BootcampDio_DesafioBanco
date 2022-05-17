
public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Vanessa");
		
		Conta contaCorrente = new ContaCorrente(cliente);
		contaCorrente.deposito(50);
		
		Conta contaPoupanca = new ContaPoupanca (cliente);
		
		contaCorrente.transferencia(contaPoupanca, 25);
		
		contaCorrente.extrato();
		System.out.println();
		contaPoupanca.extrato();
	}

}
