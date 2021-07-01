package decorator.basic;

public class VidrioTemplado extends Decorator {
   
    private int precioVidrio;

	public VidrioTemplado(ICelular component, int preciovi) {
		super(component);
		this.precioVidrio = preciovi;
	}
    
    
	@Override
    public void operation() {
        super.operation();
        System.out.println("\tVidrio Templado>Agregando vidrio templado ....");
        int newPrecio=this.precioVidrio+ super.getPrecio();
        System.out.println("\tprecio nuevo con vidrio templado "+newPrecio+" bs");
    }
    

}
