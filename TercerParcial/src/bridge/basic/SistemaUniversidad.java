package bridge.basic;

import java.util.List;

public class SistemaUniversidad implements  ISisInscripcion {
	private String nombre;
	private int capacidad;
	private String requisitos;
	private List<Estudiante> Estudiantes;

    private Implementor implemento;
    
    

    public SistemaUniversidad(String nombre, int capacidad, String requisitos, List<bridge.basic.Estudiante> estudiante) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.requisitos = requisitos;
		Estudiantes = estudiante;
	}

	public SistemaUniversidad(Implementor implemento){
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
		System.out.println("Mostrando los datos del sistema de universidad :");
		System.out.println(">Universidad/ Nombre: "+ nombre);
		System.out.println(">Universidad/ Capacidad: "+ capacidad);
		System.out.println(">Universidad/ Requisitos: "+ requisitos);
		for(Estudiante e : Estudiantes) {
			System.out.println(">Universidad/ Estudiante: "+ e.getNombre()+ " edad: "+ e.getEdad());

		}


	}

    


}
