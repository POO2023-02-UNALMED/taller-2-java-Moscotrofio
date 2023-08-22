package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    public static int cantidadCreados = 0;

    public Auto(String modelo, int precio, Asiento[] asientos, String marca, Motor motor, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
    }

    int cantidadAsientos() {
        int totalasientos = 0;
        for (Asiento i : this.asientos) {
            if (i.getClass() == Asiento.class) {
                totalasientos++;
            }
        }
        return totalasientos;
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
