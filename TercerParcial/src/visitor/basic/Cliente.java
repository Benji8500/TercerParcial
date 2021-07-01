package visitor.basic;

public class Cliente {

    public static void main (String[]args){
        LaPaz lapaz = new LaPaz();
        SantaCruz santa = new SantaCruz();
        Cochabamba cocha = new Cochabamba();
        
        Turista tu = new Turista();
        tu.setDinero(10000);
        
        lapaz.setTu(tu);
        santa.setTu(tu);
        cocha.setTu(tu);
        
        cocha.setNumeroHabitantes(30000);
        santa.setNumeroProvincias(100);

        
        ConcreteVisitante visitante = new ConcreteVisitante();

        visitante.visit(cocha);
        visitante.visit(santa);
        visitante.visit(lapaz);



    }
}


/*
15% Visitor : Se tienen los departamentos principales de Bolivia: La Paz , Cochabamba y
Santa Cruz cada uno con atributos (nombre,número provincias, numero habitantes , clima,
dinero por turismo), se tiene un turista (nombre,monto Dinero, ci)que desea viajar a todos los
departamentos y según el clima que tienen estos departamentos este desea realizar un gasto
de su monto de dinero que tiene disponible, para la ciudad de la paz un gasto de una cantidad
randomica, para cochabamba se desea gastar el 10% del total de su número de habitantes y en
santa cruz gasta una cantidad igual al 50% de su número de provincias.
*/