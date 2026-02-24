//**Ejercicio 6 — Turno en un banco */

public class Ejercicio6{
    public static void main(String[] args) {
        int turnoActual = 18;
        int turnoEnPantalla =  turnoActual;

        turnoEnPantalla = 45;

        System.out.println("=== Turno en un banco ===");
        System.out.println("Turno Actual: " + turnoActual);
        System.out.println("Turno en pantalla: " + turnoEnPantalla);
        
        //**Porque int es un tipo primitivo y en Java los tipos primitivos se copian por valor.
        //Java crea una copia independiente del valor (15) */

    }    
} 