
public class PruebaEncapsulmiento {
	
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Diego");
		cliente.setDocumento("fdfd343434");
		
		cuenta.setTitular(cliente);
		
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
	}

}
