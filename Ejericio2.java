//**Ejercicio 2 — Calculadora de una tienda */

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

