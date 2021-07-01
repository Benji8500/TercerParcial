package decorator.basic;

public class MemoriaExterna extends Decorator {
   
    private int precioMemoria;

	public MemoriaExterna(ICelular component, int precioMe) {
		super(component);
		this.precioMemoria = precioMe;
	}
    
    
	@Override
    public void operation() {
        super.operation();
        System.out.println("\tMemoria Externa>Agregando memoria externa ....");
        int newPrecio=this.precioMemoria+ super.getPrecio();
        System.out.println("\tprecio nuevo con memoria externa "+newPrecio+" bs");
        }
    

}
