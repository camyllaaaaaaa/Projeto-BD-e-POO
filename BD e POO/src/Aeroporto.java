
public class Aeroporto {
	private int id;
	private String nome;
	private String localiza��o;
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
	public String getLocaliza��o() {
		return localiza��o;
	}
	public void setLocaliza��o(String localiza��o) {
		this.localiza��o = localiza��o;
	}
	@Override
	public String toString() {
		return "aeroporto [id=" + id + ", nome=" + nome + ", localiza��o=" + localiza��o + "]";
	}
	public Aeroporto(int id, String nome, String localiza��o) {
		super();
		this.id = id;
		this.nome = nome;
		this.localiza��o = localiza��o;
	}
	
	
	

}


