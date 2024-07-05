//entidad Cuenta:
class Cuenta {
	
	// Atributos(Caracteristicas)//
	
	private double saldo; // Private para encapsular y no sea publicos ni modificables
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente(); // Para no inicializar en null se le asigna la creacion de un nuevo objeto llamado "Cliente" directamente
	
	private static int total = 0;

	// Constructor personalizado, te obliga a crear los parametros necesarios al momento de crear una cuenta
	/* public Cuenta(int agencia) {
		if (agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total ++;
		System.out.println("Se van creando: " + total + " Cuentas" );
	}
	*/
	
	
	// Metodos(Acciones)//
	
	// No retorna el valor por el "void", siendo este metodo para no retornar ningun argumento
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	// Si retorna valor "falso o verdadero" por ser boolean
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
		return false;
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	// Get es para obtener
	public double getsaldo() {
		return this.saldo;
	}
	
	// Set es para asignar
	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("No estan permitidos los valores negativos");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
}