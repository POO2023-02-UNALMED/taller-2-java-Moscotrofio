package test;

public class Auto {
	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int numAsientos=0;
		for (int z=0; z<asientos.length; z++) {
			if (asientos[z] !=null) {
				numAsientos++;
			}
		}
		return numAsientos;
	}
	String verificarIntegridad() 
	{
		boolean verificar = true;
		if (motor.registro!=registro) {
			verificar = false;
		}
		for(int z=0; z<asientos.length; z++) {
			if (asientos[z]!=null && asientos[z].registro!=registro) {
				verificar = false;
				break;
			}
		}
		if (verificar==true) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
}