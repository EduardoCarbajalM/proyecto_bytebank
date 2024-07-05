
public class crearCuenta {
	
	public static void main(String[] args) {
		// Variable			 = Valor
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.depositar(1000);
		// primeraCuenta.pais = "Peru"; No compila
		System.out.println(primeraCuenta.getsaldo());
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.depositar(500);
		System.out.println(segundaCuenta.getsaldo());
		
		
	}

}
