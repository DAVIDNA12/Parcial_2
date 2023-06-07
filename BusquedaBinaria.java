
package busquedabinaria;

/**
 *
 * @author Nieto Ayala David
 */
import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {

    public static int busquedaBinaria(int[] array, int elemento) {
        int izquierda = 0;
        int derecha = array.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (array[medio] == elemento) {
                return medio;
            } else if (array[medio] < elemento) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1; // Retorna -1 si el elemento no se encuentra en el arreglo
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los elementos del arreglo separados  por espacios:");
        String arrreglo = scanner.nextLine();

        String[] elementos1 = arrreglo.split(" ");
        int[] array = new int[elementos1.length];

        for (int i = 0; i < elementos1.length; i++) {
            array[i] = Integer.parseInt(elementos1[i]);
        }

        System.out.println("Ingrese el número que desaeas buscar:");
        int elemento = scanner.nextInt();

        Arrays.sort(array); // Ordena el arreglo antes de realizar la búsqueda binaria

        int posicion = busquedaBinaria(array, elemento);

        if (posicion != -1) {
            System.out.println("El elemento " + elemento + " se encuentra en el la posicion " + posicion + " del arreglo.");
        } else {
            System.out.println("El elemento " + elemento + " no se encuentra en el arreglo.");
        }

        scanner.close();
    }
}