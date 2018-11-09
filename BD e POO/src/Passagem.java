
public class Passagem {
	private int id;
	private String hora_de_chegada;
	private String valor;
	private String hora_de_sa�da;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHora_de_chegada() {
		return hora_de_chegada;
	}
	public void setHora_de_chegada(String hora_de_chegada) {
		this.hora_de_chegada = hora_de_chegada;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getHora_de_sa�da() {
		return hora_de_sa�da;
	}
	public void setHora_de_sa�da(String hora_de_sa�da) {
		this.hora_de_sa�da = hora_de_sa�da;
	}
	@Override
	public String toString() {
		return "Passagem [id=" + id + ", hora_de_chegada=" + hora_de_chegada + ", valor=" + valor + ", hora_de_sa�da="
				+ hora_de_sa�da + "]";
	}
	public Passagem(int id, String hora_de_chegada, String valor, String hora_de_sa�da) {
		super();
		this.id = id;
		this.hora_de_chegada = hora_de_chegada;
		this.valor = valor;
		this.hora_de_sa�da = hora_de_sa�da;
	}
	

}


}
