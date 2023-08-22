package test;

public class Asiento {
    String color;
        int precio;
        int registro;

        public Asiento(String color, int precio, int registro) {
            this.color = color;
            this.precio = precio;
            this.registro = registro;
        }

        void cambiarColor(String color) {
            if (color.equals("rojo") || color.equals("verde") || color.equals("amarillo") || color.equals("negro") || color.equals("blanco")) {
                this.color = color;
            }
        }
}
