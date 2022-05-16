
public class Main {

	public static void main(String[] args) {
		
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.deposito(50);
		
		Conta contaPoupanca = new ContaPoupanca ();
		
		contaCorrente.transferencia(contaPoupanca, 25);
		
		contaCorrente.extrato();
		System.out.println();
		contaPoupanca.extrato();
	}

}
