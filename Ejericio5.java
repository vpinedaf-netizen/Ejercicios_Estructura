//**Ejercicio 5 — Conversor de unidades */

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

