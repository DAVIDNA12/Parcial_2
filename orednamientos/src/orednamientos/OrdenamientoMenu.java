

package orednamientos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OrdenamientoMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Ingrese el tamaño del vector: ");
        int tam = scanner.nextInt();
        
        int[] array = new int[tam];
        for (int i = 0; i < tam; i++) {
            array[i] = random.nextInt(100);       
        }
        
        System.out.println("Arreglo original: " + Arrays.toString(array));
        
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú de Ordenamiento");
            System.out.println("1. Ordenamiento burbuja");
            System.out.println("2. Ordenamiento de selección");
            System.out.println("3. Ordenamiento Shell");
            System.out.println("4. Ordenamiento por inserción");
            System.out.println("5. Ordenamiento rápido (QuickSort)");
            System.out.println("6. Ordenamiento secuencial");
            System.out.println("7. Ordenamiento binario");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    bubbleSort(array);
                    break;
                case 2:
                    selectionSort(array);
                    break;
                case 3:
                    shellSort(array);
                    break;
                case 4:
                    insertionSort(array);
                    break;
                case 5:
                    quickSort(array, 0, array.length - 1);
                    break;
                case 6:
                    System.out.print("Ingrese el número a buscar: ");
                    int targetSequential = scanner.nextInt();
                    int indexSequential = sequentialSearch(array, targetSequential);
                    if (indexSequential != -1) {
                        System.out.println("El número " + targetSequential + " se encuentra en el índice " + indexSequential);
                    } else {
                        System.out.println("El número " + targetSequential + " no se encuentra en el vector.");
                    }
                    break;
                case 7:
                    Arrays.sort(array);
                    System.out.println("Arreglo ordenado: " + Arrays.toString(array));
                    System.out.print("Ingrese el número a buscar: ");
                    int targetBinary = scanner.nextInt();
                    int indexBinary = binarySearch(array, targetBinary);
                    if (indexBinary != -1) {
                        System.out.println("El número " + targetBinary + " se encuentra en el índice " + indexBinary);
                    } else {
                        System.out.println("El número " + targetBinary + " no se encuentra en el vector.");
                    }
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo nuevamente.");
                    break;
            }

            if (!exit && option >= 1 && option <= 5) {
                System.out.println("Arreglo ordenado: " + Arrays.toString(array));
            }
        }

        System.out.println("¡Hasta luego!");
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void shellSort(int[] array) {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static int sequentialSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}

