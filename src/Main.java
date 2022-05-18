public class Main {

	public static void main(String[] args) {

		Banco banco = new Banco("BancoDesafio");

		Cliente cliente = new Cliente("Vanessa", 12345678933L);
		// banco.clientes.add(cliente);
		banco.adicionarCliente(cliente);

		Conta contaCorrente = new ContaCorrente(cliente, banco);
		contaCorrente.deposito(50);
		// banco.contas.add(contaCorrente);
		banco.adicionarConta(contaCorrente);

		Cliente novoCliente = new Cliente("Cintia", 78945612333L);
		// banco.clientes.add(novoCliente);
		banco.adicionarCliente(novoCliente);

		Conta contaPoupanca = new ContaPoupanca(novoCliente, banco);
		contaCorrente.transferencia(contaPoupanca, 25);
		// banco.contas.add(contaPoupanca);
		banco.adicionarConta(contaPoupanca);

		contaCorrente.extrato();
		System.out.println();
		contaPoupanca.extrato();

		System.out.println();
		banco.ListaClientes();
		System.out.println();
		banco.ListaContas();
		System.out.println();
		banco.ListaCompleta();

	}

}
