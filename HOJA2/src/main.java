
public class main {
	 public static void main(String[] args) {
		    Stack<String> miStack = new StackVector<String>();
		    miStack.push("Adios");  //1
			miStack.push("Hola");   //2

		    String cadena = miStack.pop();
		    System.out.println(cadena);
			cadena = miStack.pop();
			System.out.println(cadena);
		  }
}
