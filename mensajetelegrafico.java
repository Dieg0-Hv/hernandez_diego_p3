/**
 * @author Diego Hernández Vázquez
 * @version 1.0
 * @date 15 aug  2024.
 */
import java.util.Scanner;
public class mensajetelegrafico{
    public static void main(String[] diego){
	Scanner sc = new Scanner(System.in);

	System.out.println("\n Nombre del remitente");
	String nombre = sc.nextLine();
	System.out.println("Nombre:" + nombre);

	int numero = 7;

	String resultado = (numero % 2 == 0 ) ? "Par" : "Impar";

	System.out.println(resultado);
	if(numero % 2 == 0){
	    System.out.println("par");
	}
	    else {
		System.out.println("impar");
		    }
    }
}
