//Ejercicio 7 — Inventario compartido

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] stockAlmacen = {1,18,0,6,2};
        int[] stockReportes = stockAlmacen;

        stockReportes[4] -= 5;
        System.out.println("Stock desde almacen:");
        for (int stock : stockAlmacen) {
            System.out.print(stock + " ");
        }

        System.out.println("\nStock desde reportes:");
        for (int stock : stockReportes) {
            System.out.print(stock + " ");
            
        }
    }
//*Ambas variables apuntan al mismo espacio en memoria. Por eso, al modificar 
// stockReportes, también cambia stockAlmacen. */
    
}
