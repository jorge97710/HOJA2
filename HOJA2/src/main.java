import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class main {
    public static Stack<String> miStack = new StackVector<String>();

	 public static void main(String[] args) throws IOException {

		 muestraContenido("/home/archivo.txt");
	   		 
		    
		/*    
		    miStack.push("ghfghfh");  //1
			miStack.push("Hola");   //2

		    String cadena = miStack.pop();
		    System.out.println(cadena);
			cadena = miStack.pop();
			System.out.println(cadena);
		  */
		  }
	 
	 
	 public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
	        String cadena;
	        FileReader f = new FileReader(archivo);
	        BufferedReader b = new BufferedReader(f);
	        while((cadena = b.readLine())!=null) {
	        	miStack.push(cadena);
	            System.out.println(cadena);
	        }
	        b.close();
	    }

	 public static int encontrarnumero (){
		 
		return 0;
	 }
	 
	 public static String operando (){
		return "";
		 
		 }
	 
}
