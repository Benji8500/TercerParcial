package visitor.basic;

import java.util.Random;

public class ConcreteVisitante implements  IVisit {

    @Override
    public void visit(LaPaz laPaz) {
    	Random random = new Random();   

    	int x = random.nextInt(laPaz.getTu().getDinero());   

    	laPaz.getTu().setDinero(laPaz.getTu().getDinero()-x);
        System.out.println(" **** El monto que el turista gastara en La Paz es de:" +x+ "bs ****");
        System.out.println(x+"Bs");
        
        System.out.println("Su saldo ahora es de: "+ laPaz.getTu().getDinero());
    }

    @Override
    public void visit(Cochabamba cochabamba) {
        double x = 0.1* (double)cochabamba.getNumeroHabitantes();

        System.out.println(" **** El monto que el turista gastara en Cochabamba es de:" +x+"bs ****");
        cochabamba.getTu().setDinero(cochabamba.getTu().getDinero()-(int)x);
        System.out.println("Su saldo ahora es de: "+ cochabamba.getTu().getDinero());
    }

    @Override
    public void visit(SantaCruz santacruz) {
        double x = 0.5* (double)santacruz.getNumeroProvincias();
    	System.out.println(" **** El monto que el turista gastara en Santa Cruz es de:"+x+ "bs ****");
        santacruz.getTu().setDinero(santacruz.getTu().getDinero()-(int)x);
        System.out.println("Su saldo ahora es de: "+ santacruz.getTu().getDinero());
    }
}
