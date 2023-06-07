
package torres.de.hanoi;

/**
 *
 * @author Nieto Ayala David
 */
public class TorresDeHanoi {

    

    public static void moverTorre(int discos, char torreOrigen, char torreDestino, char torreAuxiliar) {
        if (discos == 1) {
            System.out.println("Mover disco 1 desde la torre " + torreOrigen + " a la torre " + torreDestino);
        } else {
            moverTorre(discos - 1, torreOrigen, torreAuxiliar, torreDestino);
            System.out.println("Mover disco " + discos + " desde la torre " + torreOrigen + " a la torre " + torreDestino);
            moverTorre(discos - 1, torreAuxiliar, torreDestino, torreOrigen);
        }
    }

    public static void main(String[] args) {
        int discos = 3;
        char torreOrigen = 'A';
        char torreDestino = 'C';
        char torreAuxiliar = 'B';

        moverTorre(discos, torreOrigen, torreDestino, torreAuxiliar);
    }
}
    
   /**
 *
 *El programa comienza definiendo un método llamado moverTorre.
 * Este método recibe cuatro parámetros: el número de discos (discos), 
 * las torres de origen (torreOrigen), destino (torreDestino) y auxiliar 
 * (torreAuxiliar).
 * 
 * En el método moverTorre, se verifica si discos es igual a 1. En ese caso, 
 * significa que solo hay un disco en la torre de origen, por lo que se imprime 
 * el movimiento necesario para mover ese disco directamente desde la torreOrigen a 
 * la torreDestino.
 * 
 * 
 * Si discos no es igual a 1, se realiza la recursión para mover los discos restantes.
 * El primer paso es llamar recursivamente al método moverTorre con discos - 1, 
 * torreOrigen como torre de origen, torreAuxiliar como torre auxiliar y torreDestino 
 * como torre destino.
 * 
 * 
 * Después de la recursión, se imprime el movimiento necesario para mover el disco 
 * más grande desde la torreOrigen a la torreDestino.
 * 
 * Finalmente, se realiza otra recursión llamando al método moverTorre con discos - 1,
 * pero intercambiando torreAuxiliar y torreDestino. Esto permite mover los discos 
 * restantes desde la torreAuxiliar a la torreDestino, utilizando la torreOrigen como 
 * torre auxiliar.
 * 
 * 
 * En el método main, se establece el número de discos inicial (discos),
 * y se definen las torres de origen, destino y auxiliar (torreOrigen, 
 * torreDestino y torreAuxiliar, respectivamente).
 * 
 * 
 * 
 * 
 */

