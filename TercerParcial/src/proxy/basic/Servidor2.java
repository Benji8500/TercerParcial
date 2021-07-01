package proxy.basic;

import java.util.ArrayList;
import java.util.List;

public class Servidor2 implements IServer {
	private String ip;
	private String hostName;
	private List<User> users;
	
	public Servidor2() {
		users = new ArrayList<>();

	}
	
	
	
    

    public Servidor2(String ip, String hostName) {
		this.ip = ip;
		this.hostName = hostName;
		users = new ArrayList<>();
	}





	public String getIp() {
		return ip;
	}

    



	public void setIp(String ip) {
		this.ip = ip;
	}





	public String getHostName() {
		return hostName;
	}





	public void setHostName(String hostName) {
		this.hostName = hostName;
	}






	@Override
    public void login(User user) {
       System.out.println("Login exitoso al servidor 2");
       System.out.println("Bienvenido: " + user.getNombre());
       users.add(user);

       
    }
}