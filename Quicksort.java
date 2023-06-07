package quicksort;

/**
 *
 * @author David Nieto
 */
import java.util.Arrays;
import java.util.Scanner;

public class Quicksort {

    public static void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quicksort(array, low, pivotIndex - 1);
            quicksort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los elementos del arreglo separados por espacios:");
        String arreglo = scanner.nextLine();

        String[] elements = arreglo.split(" ");
        int[] array = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        System.out.println("Arreglo original: " + Arrays.toString(array));

        quicksort(array, 0, array.length - 1);

        System.out.println("Arreglo ordenado: " + Arrays.toString(array));

        scanner.close();
    }
}

/**
 *El programa comienza importando las clases Arrays y Scanner para trabajar con arreglos y 
 * para permitir que el usuario ingrese datos.
 * 
 * El método quicksort es el núcleo del algoritmo de ordenación Quicksort. Toma un arreglo array,
 * el índice más bajo low y el índice más alto high del subarreglo a ordenar.
 * 
 * Dentro de quicksort, se verifica si low es menor que high, lo que significa que aún 
 * hay elementos por ordenar en el subarreglo.
 * 
 * El método partition se utiliza para dividir el subarreglo en dos partes,
 * colocando los elementos menores o iguales al pivote en un lado y los elementos mayores 
 * al pivote en el otro lado.
 * 
 * El pivote se elige como el último elemento del subarreglo (array[high]). Se utiliza un 
 * índice i para rastrear la posición del elemento más pequeño encontrado hasta ahora.
 * 
 * Se itera a través del subarreglo desde low hasta high - 1. Si un elemento es menor o 
 * igual al pivote, se incrementa i y se intercambia el elemento actual con el elemento en 
 * la posición i.
 * 
 * Después de iterar sobre el subarreglo, se intercambia el pivote (array[high]) 
 * con el elemento en la posición i + 1. Esto coloca el pivote en su posición final.
 * 
 */
