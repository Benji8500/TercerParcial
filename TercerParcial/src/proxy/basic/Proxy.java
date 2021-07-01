package proxy.basic;

import java.util.Arrays;

public class Proxy implements IServer {
	

	private String ip;
	private String hostName;
	private String[] unallowedName = { "Usuario", "Servidor", "Nombre" };

	private String[] unallowedPwd = { "password", "contrasena" };

	
	
	private Servidor1 server1 = new Servidor1("3","3");
	private Servidor2 server2 = new Servidor2("4","4");;
	
	
	public Proxy(String ip, String host){
        this.ip=ip;
        this.hostName=host;
        System.out.println("inicializando proxy ...");
        System.out.println("ip: "+this.ip);
        System.out.println("host: "+this.hostName);

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
		
		int i,m=0,flag=0;      
		  int n=user.getId(); 
		  m=n/2;      
		    
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     flag=1;      
		     break;      
		    }      
		        		  } 
		if ((Arrays.stream(unallowedName).anyMatch(user.getNombre()::equals))
				|| (Arrays.stream(unallowedPwd).anyMatch(user.getPwd()::equals))) {
			System.out.println("CREDENCIALES INVALIDAS");
		} else if (flag == 0 && (n!=0) && (n!=1)) {
			this.server1.login(user);
		} else {
			this.server2.login(user);
		}

	}

}