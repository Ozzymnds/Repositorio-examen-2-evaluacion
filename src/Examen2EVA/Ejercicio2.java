package Examen2EVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//C:\Users\jmsan\Desktop\ficherosExamen\EjerFicheroTexto\textoExamen.txt
public class Ejercicio2 {
	public static String fichero = "C:\\Users\\jmsan\\Desktop\\ficherosExamen\\EjerFicheroTexto"
			+ "\textoExamen.txt";
	static Scanner sc = new Scanner(System.in);
	public static int palabrasMasLargasQue(String longitud) {
		//int length = Integer.parseInt(longitud);
		int contador = 0;
		File doc = new File(fichero);
		System.out.println("Dime la longitud");
		String largo = sc.nextLine();	
		//int largura = Integer.parseInt(largo);
		try {
			Scanner d = new Scanner(doc);
			while(d.hasNextLine()) {
				String linea = d.nextLine();
				String[] lineaSep = linea.split(" ");
				int lineSep = Integer.parseInt(linea);
				for(int i = 0; i < lineaSep.length; i++) {
					//System.out.println(lineaSep[i]);
					if (longitud.compareTo(largo) == 1) {
						contador++;
						System.out.println(contador);
						System.out.println(largo);
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
		palabrasMasLargasQue(fichero);
	}
}