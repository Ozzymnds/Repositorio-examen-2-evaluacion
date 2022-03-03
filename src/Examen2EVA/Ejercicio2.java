package Examen2EVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {
	public static String fichero = "C:\\Users\\jmsan\\Desktop\\ficherosExamen\\EjerFicheroTexto" 
			+ "\\textoExamen.txt";

	static Scanner sc = new Scanner(System.in);

	/*
	 * M�todo usado para leer el fichero l�nea a l�nea, luego lo separamos con
	 * '.split' usando como referencia las comas (","), para finalizar le pedimos
	 * que nos devuelva el 'contador', el cual se encarga de enumerar las palabras
	 * que tengan una longitud superior a la pedida por scanner.
	 * 
	 */
	public static int palabrasMasLargasQue(int longitud) {
		// int length = Integer.parseInt(longitud);
		int contador = 0; // Encargado de contar las palabras en base a la longitudad dada.
		File doc = new File(fichero);
		// int largura = Integer.parseInt(largo);
		try {
			Scanner d = new Scanner(doc);
			// Si el fichero de texto tiene una l�nea m�s a continuaci�n, se abre bucle.
			while (d.hasNextLine()) {
				String linea = d.nextLine();
				// Usamos el '.split' para separar las palabras del texto por espacios.
				String[] lineaSep = linea.split(" ");
				// int lineSep = Integer.parseInt(linea);
				for (int i = 0; i < lineaSep.length; i++) {
					System.out.println(lineaSep[i]);
					if (longitud > (lineaSep[i].length())) {
						contador++;
						System.out.println("Nose que sera esto: " + contador);
						System.out.println();
					}
				}
			}
			d.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo enconctrar el fichero.");
		}
		return contador;
	}

	/*
	 * Pre: --- Post: Nos piden un programa Java que lea un fichero de texto para
	 * llevarlo a un m�todo al cual llamaremos 'palabrasMasLargasQue()', para que
	 * nos muestre el n�mero de palabras que son m�s largas que la longitud que
	 * habr� de meter el usuario por scanner.
	 */
	public static void main(String args[]) {
		System.out.println("Contador de palabras m�s largas que 5");
		System.out.println("Dime la longitud");
		int largo = sc.nextInt();
		palabrasMasLargasQue(largo);
	}
}