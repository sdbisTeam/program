import java.io.BufferedWriter;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		//Balineanu Claudia
		
		try {
		Name n = new Name();  
		String str = "";		
		String str2 = new String();
		str2 =n.console(str);
	        
	         File file = new File("C:\\Users\\Home\\Desktop\\penta\\name.txt");
	         if (!file.exists()) {
	            file.createNewFile();
	         } 
	         FileWriter fw = new FileWriter(file.getAbsoluteFile());
	         BufferedWriter bw = new BufferedWriter(fw);
	         bw.write(str2);
	         bw.close();
	         
	         System.out.println("Done");
	      } catch (IOException e) {
	         e.printStackTrace();
	      } 
		
		
	}

}
