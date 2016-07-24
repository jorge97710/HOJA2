import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * * Clase que es el main del programa
 * 	@author Carlos Calderon, 15219
 *  @author Jorge Azmitia,15202
 *  @author javier jo 
 * 	@version 1.3 Julio 23, 2016
 *
 */
public class main {
	//Atributos
    private static Stack<String> miStack = new StackArrayList<String>();
    private static Stack<String> miStack2 = new StackArrayList<String>();
    //Metodo para leer contenido
    /**
    LeerContenido recibe como parametro el archivo donde estan los datos. devuelve el texto que esta en la linea. si no se encuentra el archivo muesta error
    @param archivo
  */
    private static String LeerContenido(String archivo) {
		 String texto= "";
		 try{
			 BufferedReader ar = new BufferedReader (new FileReader(archivo));
			 String temp= "";
			 String bfRead;
			 while ((bfRead = ar.readLine()) != null){
				 temp+=bfRead;
			 }
			 texto=temp;
		 }
		 catch(Exception e){
			 System.out.println("No se encontro archivo");
		 }
		 
		 return texto;
	    }
    
    /**
    valido recibe como parametro el String operador. los admitidos son mas,menos,multiplicacion,division. devuele true si es valido y false si no lo es 
    @param op, el operador a utilizar
  */
    private static boolean valido(String op){
    	if (op.equals("+") || op.equals("-")||op.equals("*")||op.equals("/")) {
    		return true;
    	}
        else{
        	 return false;
        }
    }
    /**
    calcular recibe como parametro los numeros a operar y el operando. devuelve el resultado de la operacion
    @param x,primer numero a operar en formato double
    @param y, segundo numero a operar en formato double
    @param op, string del operador a utilizar
  */
	private static double calcular(double x, double y,String op){
		double resultado=0.0;
		if (op.equals("+")){
			resultado= (x + y);
		}
		else if (op.equals("-")){
			resultado=(x - y);
		}
		else if (op.equals("*")){
			resultado= (x * y);
		}
		else if (op.equals("/")){
			resultado=(x / y);
		}
		return resultado;
	}
	/**
    operador recibe como parametro el string del operador. y devuelve el texto de la operacion a realizar
    @param op, el operador a utilizar
  */
	private static String operador(String op){
		String operadorTexto = "";
		if (op.equals("+")){
			operadorTexto="Suma";
		}
		else if (op.equals("-")){
			operadorTexto= "Resta";
		}
		else if (op.equals("*")){
			operadorTexto= "Multiplicacion";
		}
		else if (op.equals("/")){
			operadorTexto="Division";
		}
		return operadorTexto;
	}
	/**
    lista no recibe parametros
  */
	private static void lista(){
		String x="",y="",imp="[";
		double resultado = 0,no1,no2;
		int conta = 0;
		String textolista=LeerContenido("C:\\Users\\Carlos\\Desktop\\txt\\hola.txt");
		System.out.println(textolista);
		System.out.println("-----------------------------------------------------");
        String textoArray[] = textolista.split(" ");
        for(String i : textoArray){
        	// Si es un operador valido
        	if (valido(i)){
        		if (miStack.size()>=2){
        			y=miStack.pop();
        			x=miStack.pop();
        			no1=Double.parseDouble(x);
        			no2=Double.parseDouble(y);
        			//Operar 
        	        resultado = calcular(no1,no2,i);
        	        miStack.push(Double.toString(resultado));
        	        
        			}
        		}
        	
        	//Asumir que es un numero
        	else if (isNumeric(i)==true){
        		miStack.push(i);
        	}
        	else {
        		System.out.println("No se tiene un formato valido");
        		System.exit(0);
        	}
        	
          }
        System.out.println("Resultado = "+resultado);
	}
	
	  public static boolean isNumeric(String str) {
	        return (str.matches("[+-]?\\d*(\\.\\d+)?") && str.equals("")==false);
	    }
	
	 public static void main(String[] args) throws IOException {
		lista();
		  }
	 
}
