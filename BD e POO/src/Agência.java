
public class Ag�ncia {
		public Ag�ncia(int id, String nome, String viagem, String endere�o) {
		super();
		this.id = id;
		this.nome = nome;
		this.viagem = viagem;
		this.endere�o = endere�o;
	}
		private int id; 
		private String nome;
		private String viagem;
		private String endere�o;
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
		public String getEndere�o() {
			return endere�o;
		}
		public void setEndere�o(String endere�o) {
			this.endere�o = endere�o;
		}
		@Override
		public String toString() {
			return "Ag�ncia [id=" + id + ", nome=" + nome + ", viagem=" + viagem + ", endere�o=" + endere�o + "]";
		}
}
