package bridge.basic;

import java.util.List;

public class SistemaColegio implements  ISisInscripcion {
	private String nombre;
	private int capacidad;
	private String requisitos;
	private List<Estudiante> Estudiantes;

    private Implementor implemento;
    
    

    public SistemaColegio(String nombre, int capacidad, String requisitos, List<bridge.basic.Estudiante> estudiante) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.requisitos = requisitos;
		Estudiantes = estudiante;
	}
    
    

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getCapacidad() {
		return capacidad;
	}



	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}



	public String getRequisitos() {
		return requisitos;
	}



	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}



	public List<Estudiante> getEstudiantes() {
		return Estudiantes;
	}



	public void setEstudiantes(List<Estudiante> estudiantes) {
		Estudiantes = estudiantes;
	}



	public SistemaColegio(Implementor implemento){
        this.implemento=implemento;
    }

	@Override
	public void metodo1() {
		implemento.mostrar();
		System.out.println("Mostrando los datos del sistema de colegio :");
		System.out.println(">Colegio/ Nombre: "+ nombre);
		System.out.println(">Colegio/ Capacidad: "+ capacidad);
		System.out.println(">Colegio/ Requisitos: "+ requisitos);
		for(Estudiante e : Estudiantes) {
			System.out.println(">Colegio/ Estudiante: "+ e.getNombre()+ " edad: "+ e.getEdad());

		}


	}

    


}
