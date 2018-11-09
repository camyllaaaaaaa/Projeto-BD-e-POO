
public class Agência {
		public Agência(int id, String nome, String viagem, String endereço) {
		super();
		this.id = id;
		this.nome = nome;
		this.viagem = viagem;
		this.endereço = endereço;
	}
		private int id; 
		private String nome;
		private String viagem;
		private String endereço;
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
		public String getViagem() {
			return viagem;
		}
		public void setViagem(String viagem) {
			this.viagem = viagem;
		}
		public String getEndereço() {
			return endereço;
		}
		public void setEndereço(String endereço) {
			this.endereço = endereço;
		}
		@Override
		public String toString() {
			return "Agência [id=" + id + ", nome=" + nome + ", viagem=" + viagem + ", endereço=" + endereço + "]";
		}
}
