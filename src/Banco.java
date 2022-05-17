import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	protected List<Conta> contas = new ArrayList<>();
	public List<Cliente> clientes = new ArrayList<>();
	public List<Conta> completa = new ArrayList<>();
	
	public Banco(String nome) {
		this.nome = nome;
	}

	public void ListaClientes() {
		System.out.println("***LISTA DE CLIENTES***");
		for(Cliente cli: clientes) {
			System.out.println("Nome do titular: " + cli.getNome() + " | CPF: " + cli.getCpf());			
		}
	}
	
	public void ListaContas() {
		System.out.println("***LISTA DE CONTAS***");
		for(Conta con: contas) {
			System.out.println("Ag: "+con.getAgencia()  +" | Conta: " + con.getNumeroConta() +" | Tipo: "+ con.getClass().getName());			
		}
	}
	
	public void ListaCompleta() {
		System.out.println("***LISTA COMPLETA DE DADOS DO BANCO***");
		for(Conta c: contas) {
			System.out.println(
					"Ag: " + c.getAgencia()  +
					" | Conta: " + c.getNumeroConta() +
					" | Tipo: "+ c.getClass().getName() +
					" | Cliente: " + c.getCliente().getNome() +
					" | CPF: " + c.getCliente().getCpf()
					);			
		}
	}
	
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void adicionarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
