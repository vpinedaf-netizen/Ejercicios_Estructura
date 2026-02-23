# Ejercicios_Estructura

## Ejercicio 1 — Ficha de un estudiante

public class Ejericio1 {
    public static void main(String[] args) {
        String nombreCompleto = "Ana Torres";
        int codigo = 20241001;
        int semestre = 3;
        double promedio = 3.85;
        boolean matriculado = true;

        System.out.println("=== Ficha del Estudiante ===");
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matriculado: " + matriculado);
    }
}

## Ejercicio 2 — Calculadora de una tienda

public class Ejericio2 {
    public static void main(String[] args) {
        double precioUnitario = 15000.0;
        int cantidad = 5;
        double descuento = 10.0;

        double subtotal = precioUnitario * cantidad;
        double valorDescuento = subtotal * (descuento / 100);
        double totalPagar = subtotal - valorDescuento;

        System.out.println("=== Calculadora de Tienda ===");
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Valor descuento: " + valorDescuento);
        System.out.println("Total a pagar: " + totalPagar);
    }
}

## Ejercicio 3 — Sensor de temperatura

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

## Ejercicio 4 — Placa de un vehículo

public class Ejericio4 {
    public static void main(String[] args) {
        String placa = "ABC123";
        int añoFabricacion = 2020;
        int cilindraje = 1600;
        double precioCompra = 45000000.0;
        char inicialColor = 'R';
        boolean tieneSOATVigente = true;

        System.out.println("=== Placa del Vehículo ===");
        System.out.println("Placa: " + placa);
        System.out.println("Año de fabricación: " + añoFabricacion);
        System.out.println("Cilindraje: " + cilindraje + " cc");
        System.out.println("Precio de compra: " + precioCompra);
        System.out.println("Inicial del color: " + inicialColor);
        System.out.println("Tiene SOAT vigente: " + tieneSOATVigente);
    }
}

## Ejercicio 5 — Conversor de unidades

public class Ejericio5 {
    public static void main(String[] args) {
        double tazas = 3.5;
        double mililitros = tazas * 236.588;
        double litros = mililitros / 1000;

        System.out.println("=== Conversor de Unidades ===");
        System.out.println("Tazas: " + tazas);
        System.out.println("Mililitros: " + mililitros);
        System.out.println("Litros: " + litros);
    }
}