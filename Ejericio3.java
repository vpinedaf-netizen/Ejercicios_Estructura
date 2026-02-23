//**Ejercicio 3 — Sensor de temperatura */

public class Ejericio3 {
    public static void main(String[] args) {
        double temperaturaActual = 85.5;
        String nombreSensor = "Sensor-A";
        int numeroLectura = 125;
        boolean enAlarma = temperaturaActual > 80;

        System.out.println("=== Estado del Sensor ===");
        System.out.println("Nombre del sensor: " + nombreSensor);
        System.out.println("Número de lectura: " + numeroLectura);
        System.out.println("Temperatura actual: " + temperaturaActual + "°C");
        System.out.println("En alarma: " + enAlarma);
    }
}

