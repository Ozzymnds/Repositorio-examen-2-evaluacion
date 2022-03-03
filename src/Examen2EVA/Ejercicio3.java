package Examen2EVA;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//C:\Users\jmsan\Desktop\ficherosExamen\EjerVideoGame\ventasVideojuegos.csv
public class Ejercicio3 {
	public static String fichero = "C:\\Users\\jmsan\\Desktop\\ficherosExamen\\EjerVideoGame\""
			+ "\\ventasVideojuegos.csv";
	
	public static ArrayList<String> t = new ArrayList<String>();
	
	public static Scanner sc = new Scanner(System.in);
	
	public static String informacionVideojuegos(String fichero) {
		File file = new File(fichero);	
		try {
			while(sc.hasNextLine()) {
				String line = sc.next();
				String[] lineSep = line.split(",");
				for(int i = 0; i < lineSep.length; i++) {
					if(lineSep[i] == lineSep[2]) {
						t.add(line);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return fichero;
	}
	public static void main(String args[]) {
		System.out.println("Bienvenido a la consulta de información sobre videojuegos");
		informacionVideojuegos(fichero);
	}
}
