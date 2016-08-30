package ec.com.live;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Textos {
	
	public void escribir(String nombreArchivo){
		File archivo;
		archivo=new File(nombreArchivo);
		
		
			FileWriter fw;
			try {
				fw = new FileWriter(archivo);
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter pw=new PrintWriter(bw);
				
				pw.append("- concatenación de texto");
				pw.append("\n second live");
				pw.close();
				bw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}
	
	public void leer(String nombreArchivo){
		try {
			FileReader fr=new FileReader(nombreArchivo);
			BufferedReader br=new BufferedReader(fr);
			String temp="";
			while (temp!=null) {
				temp=br.readLine();
				if (temp==null) {
					break;
				}
				System.out.println(temp);	
				br.close();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
