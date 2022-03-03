import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//C:\Users\jmsan\Desktop\ficherosExamen\EjerFicheroTexto\textoExmen.txt
public class Ejercicio2 {
	static Scanner sc = new Scanner(System.in);
	private static void palabrasMasLargasQue(String longitud) {
		int length = Integer.parseInt(longitud);
		int contador = 0;
		File doc = new File(longitud);
		String largo = sc.nextLine();
		try {
			Scanner d = new Scanner(doc);
			while(d.hasNextLine()) {
				String linea = d.nextLine();
				String[] lineaSep = linea.split(" ");
				int lineSep = Integer.parseInt(linea);
				for(int i = 0; i < lineaSep.length; i++) {
					//System.out.println(lineaSep[i]);
					if (lineaSep[i].equals(d)) {
						contador++;
					}
				}
			}
			d.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo enconctrar el fichero.");
		}
	}
	public static void main(String args[]) {
		String fichero = "C:\\Users\\jmsan\\Desktop\\ficherosExamen\\EjerFicheroTexto\\textoExamen.txt";
		palabrasMasLargasQue(fichero);
	}
}