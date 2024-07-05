
public class PruebaMetodos {
	
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.depositar(300);
		miCuenta.depositar(200);
		System.out.println(miCuenta.getsaldo());
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.getsaldo());
		
		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(1000);
		boolean puedeTransferir = cuentaDeJimena.transferir(400, miCuenta);
		
		if (puedeTransferir) {
			System.out.println("Transferencia exitosa");
		} else {
			System.out.println("No es posible realizar la transferencia");
		}

		
		System.out.println(cuentaDeJimena.getsaldo());
		System.out.println(miCuenta.getsaldo());

	}

}
