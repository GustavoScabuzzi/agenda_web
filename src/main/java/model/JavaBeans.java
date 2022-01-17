package model;

public class JavaBeans {
	private String idcont;
	private String nome;
	private String fone;
	private String email;
	
	public JavaBeans() {
		super();
	}
	
	public JavaBeans(String idcont, String nome, String fone, String email) {
		super();
		this.idcont = idcont;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
	}

	public String getIdcont() {
		return idcont;
	}
	public void setIdcont(String idcont) {
		this.idcont = idcont;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
