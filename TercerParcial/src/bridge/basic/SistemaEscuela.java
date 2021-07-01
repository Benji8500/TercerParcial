package bridge.basic;

import java.util.List;

public class SistemaEscuela implements  ISisInscripcion {
	private String nombre;
	private int capacidad;
	private String requisitos;
	private List<Estudiante> Estudiantes;

    private Implementor implemento;
    
    

    public SistemaEscuela(String nombre, int capacidad, String requisitos, List<bridge.basic.Estudiante> estudiante) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.requisitos = requisitos;
		Estudiantes = estudiante;
	}

	public SistemaEscuela(Implementor implemento){
        this.implemento=implemento;
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


	@Override
	public void metodo1() {
		implemento.mostrar();
		System.out.println("Mostrando los datos del sistema de escuela :");
		System.out.println(">Escuela/ Nombre: "+ nombre);
		System.out.println(">Escuela/ Capacidad: "+ capacidad);
		System.out.println(">Escuela/ Requisitos: "+ requisitos);
		for(Estudiante e : Estudiantes) {
			System.out.println(">Escuela/ Estudiante: "+ e.getNombre()+ " edad: "+ e.getEdad());

		}


	}

    


}
