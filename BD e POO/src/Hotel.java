
public class Hotel {
	private int id;
	private String wifi;
	private String com_academia;
	private String sem_academia;
	private String localização;
	private String nome;
	private String com_piscina;
	private String sem_piscina;
	private String estacionamento;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getCom_academia() {
		return com_academia;
	}
	public void setCom_academia(String com_academia) {
		this.com_academia = com_academia;
	}
	public String getSem_academia() {
		return sem_academia;
	}
	public void setSem_academia(String sem_academia) {
		this.sem_academia = sem_academia;
	}
	public String getLocalização() {
		return localização;
	}
	public void setLocalização(String localização) {
		this.localização = localização;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCom_piscina() {
		return com_piscina;
	}
	public void setCom_piscina(String com_piscina) {
		this.com_piscina = com_piscina;
	}
	public String getSem_piscina() {
		return sem_piscina;
	}
	public void setSem_piscina(String sem_piscina) {
		this.sem_piscina = sem_piscina;
	}
	public String getEstacionamento() {
		return estacionamento;
	}
	public void setEstacionamento(String estacionamento) {
		this.estacionamento = estacionamento;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", wifi=" + wifi + ", com_academia=" + com_academia + ", sem_academia="
				+ sem_academia + ", localização=" + localização + ", nome=" + nome + ", com_piscina=" + com_piscina
				+ ", sem_piscina=" + sem_piscina + ", estacionamento=" + estacionamento + "]";
	}
	public Hotel(int id, String wifi, String com_academia, String sem_academia, String localização, String nome,
			String com_piscina, String sem_piscina, String estacionamento) {
		super();
		this.id = id;
		this.wifi = wifi;
		this.com_academia = com_academia;
		this.sem_academia = sem_academia;
		this.localização = localização;
		this.nome = nome;
		this.com_piscina = com_piscina;
		this.sem_piscina = sem_piscina;
		this.estacionamento = estacionamento;
	}

}

}
