
public class Refei��o {
	private int id;
	private String meia_pens�o;
	private String sem_refei��o;
	private String pens�o_completa;
	private String caf�_da_manh�o;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMeia_pens�o() {
		return meia_pens�o;
	}
	public void setMeia_pens�o(String meia_pens�o) {
		this.meia_pens�o = meia_pens�o;
	}
	public String getSem_refei��o() {
		return sem_refei��o;
	}
	public void setSem_refei��o(String sem_refei��o) {
		this.sem_refei��o = sem_refei��o;
	}
	public String getPens�o_completa() {
		return pens�o_completa;
	}
	public void setPens�o_completa(String pens�o_completa) {
		this.pens�o_completa = pens�o_completa;
	}
	public String getCaf�_da_manh�o() {
		return caf�_da_manh�o;
	}
	public void setCaf�_da_manh�o(String caf�_da_manh�o) {
		this.caf�_da_manh�o = caf�_da_manh�o;
	}
	@Override
	public String toString() {
		return "Refei��o [id=" + id + ", meia_pens�o=" + meia_pens�o + ", sem_refei��o=" + sem_refei��o
				+ ", pens�o_completa=" + pens�o_completa + ", caf�_da_manh�o=" + caf�_da_manh�o + "]";
	}
	public Refei��o(int id, String meia_pens�o, String sem_refei��o, String pens�o_completa, String caf�_da_manh�o) {
		super();
		this.id = id;
		this.meia_pens�o = meia_pens�o;
		this.sem_refei��o = sem_refei��o;
		this.pens�o_completa = pens�o_completa;
		this.caf�_da_manh�o = caf�_da_manh�o;
	}

}




}
