package decorator.basic;

public class Client {
    public static void main (String[]args){

        // objeto principal
        ICelular iPhone= new Apple();
        
        ((Apple)iPhone).setCpu("A12");
        ((Apple)iPhone).setRam(6);
        ((Apple)iPhone).setAlmacenamiento(64);
        ((Apple)iPhone).setPrecio(10000);
        
        iPhone = new Carcasa(iPhone,50);
        iPhone = new VidrioTemplado(iPhone,30);
        iPhone = new MemoriaExterna(iPhone,500);
        
        iPhone.operation();






       

    }
}
