package Examen2EVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {
	public static String fichero = "C:\\Users\\jmsan\\Desktop\\ficherosExamen\\EjerFicheroTexto"
			+ "\\textoExamen.txt";
	
	static Scanner sc = new Scanner(System.in);
	
	public static int palabrasMasLargasQue(int longitud) {
		//int length = Integer.parseInt(longitud);
		int contador = 0;
		File doc = new File(fichero);	
		//int largura = Integer.parseInt(largo);
		try {
			Scanner d = new Scanner(doc);
			while(d.hasNextLine()) {
				String linea = d.nextLine();
				String[] lineaSep = linea.split(" ");
				//int lineSep = Integer.parseInt(linea);
				for(int i = 0; i < lineaSep.length; i++) {
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
	public static void main(String args[]) {
		System.out.println("Contador de palabras más largas que 5");
		System.out.println("Dime la longitud");
		int largo = sc.nextInt();
		palabrasMasLargasQue(largo);
	}
}