
public class TestReferencia3 {
	
	public static void main(String[] args) {
		Cuenta cuentaDeDiego = new Cuenta();
		
		/* cuentaDeDiego.titular = new Cliente(); // Enlazar directamente al objeto "Cuenta" a un objeto nuevo "Cliente"
		cuentaDeDiego.titular.nombre = "Diego";
		*/
		
		System.out.println(cuentaDeDiego.getTitular().getNombre());
	}
}
