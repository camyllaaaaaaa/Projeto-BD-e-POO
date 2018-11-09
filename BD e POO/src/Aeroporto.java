
public class Aeroporto {
	private int id;
	private String nome;
	private String localização;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalização() {
		return localização;
	}
	public void setLocalização(String localização) {
		this.localização = localização;
	}
	@Override
	public String toString() {
		return "aeroporto [id=" + id + ", nome=" + nome + ", localização=" + localização + "]";
	}
	public Aeroporto(int id, String nome, String localização) {
		super();
		this.id = id;
		this.nome = nome;
		this.localização = localização;
	}
	
	
	

}


