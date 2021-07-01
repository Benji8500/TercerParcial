package decorator.basic;

public class Decorator implements  ICelular {

    private ICelular component;
    
    public Decorator(ICelular component){
        this.component=component;
    }

    public ICelular getComponent() {
		return component;
	}



	public void setComponent(ICelular component) {
		this.component = component;
	}



	



	@Override
	public void operation() {
		this.component.operation();
	}



	@Override
	public int getPrecio() {
		return this.component.getPrecio();
	}



	@Override
	public void setPrecio(int precio) {
		this.component.setPrecio(precio);
	}

    
}
