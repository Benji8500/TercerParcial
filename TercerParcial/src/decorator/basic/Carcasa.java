package decorator.basic;

public class Carcasa extends Decorator {
   
    private int precioCarcasa;

	public Carcasa(ICelular component, int precioCarcasa) {
		super(component);
		this.precioCarcasa = precioCarcasa;
	}
    
    
	@Override
    public void operation() {
        super.operation();
        System.out.println("\tCarcasa>Agregando carcasa ....");
        int newPrecio=this.precioCarcasa+ super.getPrecio();
        System.out.println("\tprecio nuevo con carcasa "+newPrecio+" bs");
    }
    

}
