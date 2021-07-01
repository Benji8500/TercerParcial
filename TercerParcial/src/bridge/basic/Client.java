package bridge.basic;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static  void main(String[]ags){
    	
    	Estudiante e1= new Estudiante("Andres",7);
    	Estudiante e2= new Estudiante("Juan",8);
    	Estudiante e3= new Estudiante("Erick",12);
    	Estudiante e4= new Estudiante("Daniel",25);
    	
    	List<Estudiante> estus = new ArrayList<>();
    	estus.add(e1);
    	estus.add(e2);



        ISisInscripcion colegio = new SistemaColegio(new Facebook());
        ((SistemaColegio)colegio).setNombre("Montessori");
        ((SistemaColegio)colegio).setEstudiantes(estus);
        ((SistemaColegio)colegio).setCapacidad(1000);
        ((SistemaColegio)colegio).setRequisitos("Promedio de 80");


        colegio.metodo1();
        ISisInscripcion escuela = new SistemaEscuela(new Whatsapp());
        ISisInscripcion universidad = new SistemaUniversidad(new Twitter());



    }
}
