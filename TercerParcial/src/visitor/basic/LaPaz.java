package visitor.basic;

public class LaPaz implements  IDepartamento {

    private String nombre;
    private int numeroProvincias;
    private int numeroHabitantes;
    private String clima;
    private int dineroPorTurismo;
    
    public LaPaz() {}
    
    private Turista tu;
    
    
    
	public Turista getTu() {
		return tu;
	}
	public void setTu(Turista tu) {
		this.tu = tu;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroProvincias() {
		return numeroProvincias;
	}
	public void setNumeroProvincias(int numeroProvincias) {
		this.numeroProvincias = numeroProvincias;
	}
	public int getNumeroHabitantes() {
		return numeroHabitantes;
	}
	public void setNumeroHabitantes(int numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;
	}
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	public int getDineroPorTurismo() {
		return dineroPorTurismo;
	}
	public void setDineroPorTurismo(int dineroPorTurismo) {
		this.dineroPorTurismo = dineroPorTurismo;
	}
	@Override
	public void visita(IVisit visitante) {
		// TODO Auto-generated method stub
		
	}




    
}
