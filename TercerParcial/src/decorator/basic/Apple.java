package decorator.basic;

public class Apple implements ICelular {
	private String cpu;
	private int ram;
	private int almacenamiento;
	private int precio;
	
	
	public Apple() {}
	
	
	
    public String getCpu() {
		return cpu;
	}



	public void setCpu(String cpu) {
		this.cpu = cpu;
	}



	public int getRam() {
		return ram;
	}



	public void setRam(int ram) {
		this.ram = ram;
	}



	public int getAlmacenamiento() {
		return almacenamiento;
	}



	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}



	@Override
	public void operation() {
		System.out.println("Celular Apple>CPU : "+cpu);
		System.out.println("Celular Apple>Ram : "+ram);
		System.out.println("Celular Apple>Almacenamiento : "+almacenamiento);
		System.out.println("Celular Apple>Precio : "+precio);



        
		
	}



	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}



	@Override
	public void setPrecio(int precio) {
		this.precio=precio;
	}


	
	
}
