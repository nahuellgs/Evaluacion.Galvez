package Evaluacion_Galvez;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evaluacion_Galvez {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		List<Integer> Numdelegajo = new ArrayList<>();
		List<String> apellidos = new ArrayList<>();
		List<String> Nombre = new ArrayList<>();
		
		System.out.println("Cuantos empleados desea registrar?");
		int cantidadEmpleados = entrada.nextInt();
		int Numdelegajo_buscado;
		
		for (int i = 0; i < cantidadEmpleados; i++) {
			
			System.out.println("Ingrese un numero de Nombre: ");
			Nombre.add(entrada.next());
			
		
			System.out.println("Ingrese el apellido del numero de legajo " + (i + 1) + ":");
			apellidos.add(entrada.next());
			
			System.out.println("Ingrese un numero de legajo: ");
			Numdelegajo.add(entrada.nextInt());
	
		}
			
			
			
				System.out.println("\nIngrese un numero de  a buscar: ");
				Numdelegajo_buscado = entrada.nextInt();
			
				boolean encontrado = false;
				for (int i = 0; i < Numdelegajo.size(); i++) {
					if (Numdelegajo_buscado == Numdelegajo.get(i)) {
						System.out.println("El numero de legajo " + Numdelegajo_buscado + " pertenece a: " + apellidos.get(i));
						encontrado = true;
					}	
				}	

						for (int i = 0; i < cantidadEmpleados - 1; i++) {
							for (int j = 0; j < cantidadEmpleados - i - 1; j++) {
								if (Numdelegajo.get(j) > Numdelegajo.get(j + 1)) {
								
									int tempNumdelegajo = Numdelegajo.get(j);
									Numdelegajo.set(j, Numdelegajo.get(j + 1));
									Numdelegajo.set(j + 1, tempNumdelegajo);

							
									String tempApellido = apellidos.get(j);
									apellidos.set(j, apellidos.get(j + 1));
									apellidos.set(j + 1, tempApellido);
									
									
									
									
								}
							}
						}
	System.out.println("--------------------------------------"); 
						
	System.out.println("Lista de legajo ordenada:");
	 for (int  i= 0; i < Numdelegajo.size(); i++) {
		System.out.println("El numero de legajo " + (i + 1) + " es: " + Numdelegajo.get(i) + " perteneciente a: " + apellidos.get(i) ); 

		
			
	}
		
		boolean BuscarOtro = true;
		while (buscarOtro == true) {
			System.out.println("\nIngrese un numero de legajo a buscar: ");
			int Numdelegajo_Buscado = entrada.nextInt();

			boolean Encontrado = false;
			for (int i = 0; i < Numdelegajo.size(); i++) {
				if (Numdelegajo_buscado == Numdelegajo.get(i)) {
					System.out.println("El numero de legajo " + Numdelegajo_buscado + " pertenece a: " + apellidos.get(i));
					encontrado = true;
					
					
			
					
					
				

		
		
		
}
}
		}
					}
				}
	

