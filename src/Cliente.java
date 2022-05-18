import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class Cliente {
	
	private String nome;	
	private Long cpf;
	

	@Override
	public String toString() {
		return "Cliente: " + nome + "\nCPF: " + cpf;
	}

}
