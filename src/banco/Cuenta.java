package banco;

public class Cuenta {
	//Se declaran los atributos:
	protected float saldo;
	protected int consignaciones = 0;
	protected int retiros = 0;
	protected float tasaAnual;
	protected float comisionMensual = 0;
	
	//Metodo constructor que tiene como parametros el saldo y la tasa anual de la cuenta:
	public Cuenta(float saldo, float tasaAnual) {
		this.saldo=saldo;
		this.tasaAnual=tasaAnual;
	}
	
	//Metodo para consignar una cantidad de dinero al saldo de la cuenta:
	public void consignar(float cantidad) {
		saldo+=cantidad;
	}
	
	//Metodo para retirar una cantidad de dinero del saldo de la cuenta:
	public void retirar(float cantidad) {
		if(cantidad>saldo) {
			System.out.println("No puedes retirar más dinero del que tienes");
		}else {
			saldo-=cantidad;
		}
	}
	
	//Metodo para calcular el interes mensual de la cuenta:
	public void cacularInteres() {
		float tasaMensual = tasaAnual / 12;
		float interesMensual = saldo * tasaMensual;
		saldo += interesMensual;
	}
	public void extractoMensual() {
		saldo-=comisionMensual;
	}

	//Metodo toString para imprimir todos los atributos de la clase con sus valores:
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", consignaciones=" + consignaciones + ", retiros=" + retiros + ", tasaAnual="
				+ tasaAnual + ", comisionMensual=" + comisionMensual + "]";
	}
	//Metodo que compara dos cuentas y devuelve la que mayor saldo tiene:
	public static float compararCuentas(float cuenta1, float cuenta2) {
		if(cuenta1>cuenta2) {
			return cuenta1;
		}else {
			return cuenta2;
		}
	}
	
	
	
	
}
