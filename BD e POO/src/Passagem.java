
public class Passagem {
	private int id;
	private String hora_de_chegada;
	private String valor;
	private String hora_de_saída;
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
	public String getHora_de_saída() {
		return hora_de_saída;
	}
	public void setHora_de_saída(String hora_de_saída) {
		this.hora_de_saída = hora_de_saída;
	}
	@Override
	public String toString() {
		return "Passagem [id=" + id + ", hora_de_chegada=" + hora_de_chegada + ", valor=" + valor + ", hora_de_saída="
				+ hora_de_saída + "]";
	}
	public Passagem(int id, String hora_de_chegada, String valor, String hora_de_saída) {
		super();
		this.id = id;
		this.hora_de_chegada = hora_de_chegada;
		this.valor = valor;
		this.hora_de_saída = hora_de_saída;
	}
	

}


}
