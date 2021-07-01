package proxy.basic;

public class User {
	private int id;
	private String nombre;
	private String pwd;
	

	public User() {}
	
	



	public User(int id, String nombre, String pwd) {
		this.id = id;
		this.nombre = nombre;
		this.pwd = pwd;
	}





	public String getNombre() {
		return nombre;
	}

	public void setNombre(String user) {
		this.nombre = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
}
