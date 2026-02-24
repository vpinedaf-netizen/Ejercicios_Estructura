//*Ejercicio 8 — Historial de mensajes
public class Ejercicio8 {
    public static void main(String[] args) {
        String ultimoMensaje = "Hola";
        String copiaTexto = ultimoMensaje;

       copiaTexto = "¿Cómo estás?";

        System.out.println("=== Historial de mensajes ===");
        System.out.println("ultimoMensaje: " + ultimoMensaje);
        System.out.println("copiaTexto: " + copiaTexto);
    }
}
//*Los String son inmutables en Java.
//Al cambiar copiaTexto, se 
//crea un nuevo objeto en memoria, y el original (ultimoMensaje) no se modifica. */