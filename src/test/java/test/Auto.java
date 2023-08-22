package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    public static int cantidadCreados = 0;

	int cantidadAsientos() {
		int numAsientos=0;
		for (int z=0; z<asientos.length; z++) {
			if (asientos[z] !=null) {
				numAsientos++;
			}
		}
		return numAsientos;
	}

    String verificarIntegridad() {
        boolean original = true;
        if (this.registro != this.motor.registro) {
        original = false;
        } else {
            for (Asiento j : this.asientos) {
                if (j.registro != this.registro) {
                    original = false;
                    break;
                }
            }
        }
        if (original) {
            return "Auto original";
        } else {
            return "Las piezas no son originales";
        }
    }
}
