public class Principal {
	 public static void main(String[] args) {
		 double  ingresos = 489.000;
		 int vehiculos = 2; 
		 int inmuebles = 1;
		 boolean embarcacion = false;
		 	
		 	if ((ingresos < 489.083) && (vehiculos < 3) && (inmuebles < 3) && (embarcacion == false) ) {
		 		System.out.println("Usted no pertenece a ingresos altos");
		 	}
		 	else {
		 		System.out.println("Usted pertenece a ingresos altos");	
		 	}
	 }
}