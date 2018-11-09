
public class Refeição {
	private int id;
	private String meia_pensão;
	private String sem_refeição;
	private String pensão_completa;
	private String café_da_manhão;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMeia_pensão() {
		return meia_pensão;
	}
	public void setMeia_pensão(String meia_pensão) {
		this.meia_pensão = meia_pensão;
	}
	public String getSem_refeição() {
		return sem_refeição;
	}
	public void setSem_refeição(String sem_refeição) {
		this.sem_refeição = sem_refeição;
	}
	public String getPensão_completa() {
		return pensão_completa;
	}
	public void setPensão_completa(String pensão_completa) {
		this.pensão_completa = pensão_completa;
	}
	public String getCafé_da_manhão() {
		return café_da_manhão;
	}
	public void setCafé_da_manhão(String café_da_manhão) {
		this.café_da_manhão = café_da_manhão;
	}
	@Override
	public String toString() {
		return "Refeição [id=" + id + ", meia_pensão=" + meia_pensão + ", sem_refeição=" + sem_refeição
				+ ", pensão_completa=" + pensão_completa + ", café_da_manhão=" + café_da_manhão + "]";
	}
	public Refeição(int id, String meia_pensão, String sem_refeição, String pensão_completa, String café_da_manhão) {
		super();
		this.id = id;
		this.meia_pensão = meia_pensão;
		this.sem_refeição = sem_refeição;
		this.pensão_completa = pensão_completa;
		this.café_da_manhão = café_da_manhão;
	}

}




}
