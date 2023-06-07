
package busqueda_secuencial;

/**
 *
 * @author Nieto Ayala David 
 */


    import java.util.Scanner;

public class BusquedaSecuencial {

    public static int busquedaSecuencial(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return i;
            }
        }
        return -1; // Retorna -1 si el elemento no se encuentra en el arreglo
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los elementos separados por espacios:");
        String input = scanner.nextLine();

        String[] elementos1 = input.split(" ");
        int[] Arreglo = new int[elementos1.length];

        for (int i = 0; i < elementos1.length; i++) {
            Arreglo[i] = Integer.parseInt(elementos1[i]);
        }

        System.out.println("Ingrese el número que buscas:");
        int elemento = scanner.nextInt();

        int posicion = busquedaSecuencial(Arreglo, elemento);

        if (posicion != -1) {
            System.out.println("El elemento " + elemento + " se encuentra en el la posicion " + posicion + " del arreglo.(Recuerda que inici en cero)");
        } else {
            System.out.println("El elemento " + elemento + " no se encuentra en el arreglo.");
        }

        scanner.close();
    }
}