public class Cliente {
	public Cliente(int id, String data_de_nascimento, String nacionalidade, String nome) {
		super();
		this.id = id;
		this.data_de_nascimento = data_de_nascimento;
		this.nacionalidade = nacionalidade;
		this.nome = nome;
	}
	private int id;
      private String data_de_nascimento;
      private String nacionalidade;
      private String nome;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData_de_nascimento() {
		return data_de_nascimento;
	}
	public void setData_de_nascimento(String data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", data_de_nascimento=" + data_de_nascimento + ", nacionalidade=" + nacionalidade
				+ ", nome=" + nome + "]";
	}
      
}


}
