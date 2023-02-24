public class Principal {
	 public static void main(String[] args) {
		 int a = 5;
		 int b = 15;
		 boolean opcion = true;
		 System.out.println("¿Desea contar numeros pares?");
				 if (opcion == true) {
			        while (a <= b) {
			        	if (a % 2 == 0)
			   		 System.out.println(a);
			            a++;
			        }
				 	}
				 	else {
				        while (a <= b) {
				        	if (a % 2 != 0)
				   		 System.out.println(a);
				            a++;
				        }
				 	}
			    }

}