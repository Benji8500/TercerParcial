package proxy.basic;

public class Client {
    public static void main (String[] args){
        Proxy serverProxy= new Proxy("192.168.10.12", "x");
        serverProxy.login(new User(3, "Benjamin","hadf"));
        serverProxy.login(new User(20,"Enzo","33325"));
        serverProxy.login(new User(11,"Andres","3ooo"));

        serverProxy.login(new User(500,"Usuario","hadf"));

        



    }
}


