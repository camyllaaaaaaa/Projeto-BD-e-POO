
public class Quartos {
	private int id;
	private String standard;
	private String suite_exclusiva;
	private String suite_master;
	private String suite_confort;
	private String superior_com_hidro;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getSuite_exclusiva() {
		return suite_exclusiva;
	}
	public void setSuite_exclusiva(String suite_exclusiva) {
		this.suite_exclusiva = suite_exclusiva;
	}
	public String getSuite_master() {
		return suite_master;
	}
	public void setSuite_master(String suite_master) {
		this.suite_master = suite_master;
	}
	public String getSuite_confort() {
		return suite_confort;
	}
	public void setSuite_confort(String suite_confort) {
		this.suite_confort = suite_confort;
	}
	public String getSuperior_com_hidro() {
		return superior_com_hidro;
	}
	public void setSuperior_com_hidro(String superior_com_hidro) {
		this.superior_com_hidro = superior_com_hidro;
	}
	@Override
	public String toString() {
		return "Quartos [id=" + id + ", standard=" + standard + ", suite_exclusiva=" + suite_exclusiva
				+ ", suite_master=" + suite_master + ", suite_confort=" + suite_confort + ", superior_com_hidro="
				+ superior_com_hidro + "]";
	}
	public Quartos(int id, String standard, String suite_exclusiva, String suite_master, String suite_confort,
			String superior_com_hidro) {
		super();
		this.id = id;
		this.standard = standard;
		this.suite_exclusiva = suite_exclusiva;
		this.suite_master = suite_master;
		this.suite_confort = suite_confort;
		this.superior_com_hidro = superior_com_hidro;
	}
	

}


}
