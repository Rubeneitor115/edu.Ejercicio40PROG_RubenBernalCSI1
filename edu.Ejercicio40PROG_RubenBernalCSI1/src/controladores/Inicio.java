/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.util.ArrayList;

/**
 * Clase controladora de la aplicacion
 * @author rbr - 080125
 *
 */
public class Inicio {

	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 080125
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Genero la lista
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Carlos");
		nombres.add("Ana");
		nombres.add("Beatriz");
		nombres.add("Daniel");
		nombres.add("Eva");
		
		//Variables
		int tamanyo = nombres.size();
		boolean control;
		
		//Muestro la lista sin ordenar
		System.out.println("Lista sin ordenar: ");
		for(String persona : nombres) {
			System.out.println(persona);
		}
		
		//Ordeno la lista
		for(int i = 0; i<tamanyo-1 ; i++) {
			control = false;
			for(int j = 0; j < tamanyo - i - 1; j++) {
				if(nombres.get(j).compareTo(nombres.get(j + 1)) > 0) {
					String temp = nombres.get(j);
                    nombres.set(j, nombres.get(j + 1));
                    nombres.set(j + 1, temp);
                    control = true;
				}
			}
			if(!control) {
				break;
			}
		}
		
		System.out.println();
		//Muestro la lista ordenada
		System.out.println("Lista ordenada: ");
		for(String pers : nombres) {
			System.out.println(pers);
		}

	}

}
