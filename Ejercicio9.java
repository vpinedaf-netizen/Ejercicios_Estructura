//*Ejercicio 9 — Notas de un curso */

public class Ejercicio9 {
    public static void main(String[] args) {
        double[] Notasprofesor = {1.5,2.5,3.0,4.5};
        double[] Notascoordinador = Notasprofesor;

        Notascoordinador[1] = 3.0;
        System.out.println("Notas profesor:");
        for (double Notas : Notasprofesor) {
            System.out.print(Notas + " ");
        }

        System.out.println("\nNotas de coordinador:");
        for (double Notas : Notascoordinador) {
            System.out.print(Notas+ " ");
            
        }
    }
    
}
 //*Ambas variables apuntan al mismo espacio en memoria. Por eso, al modificar 
// stockReportes, también cambia stockAlmacen. */
