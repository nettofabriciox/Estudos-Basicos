package vetores;

public class VetoresDeClasse {

	private String nome;
	private double preco;
	
	public VetoresDeClasse(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "VetoresDeClasse [nome=" + nome + ", preco=" + preco + "]";
	}
	
	
}
