
package pilas;

/**
 * Explicacion de pilas 
 * @author David Nieto Ayala
 */


 import java.util.Stack;
import java.util.Scanner;

public class Pilas {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa de Pilas");
        System.out.println("Ingrese un número positivo para agregar a la pila o -1 para terminar:");

        int numero = scanner.nextInt();

        while (numero != -1) {
            pila.push(numero);
            numero = scanner.nextInt();
        }

        System.out.println("Elementos en la pila:");

        while (!pila.empty()) {
            System.out.println(pila.pop());
        }

        scanner.close();
    }
}
/**
 * Explicacion de pilas 
 * 
 * 
 * Una pila es una estructura de datos lineal que sigue el principio de "último en entrar,
 * primero en salir" (LIFO, Last In, First Out). Es similar a una pila de objetos físicos,
 * donde puedes agregar elementos (push) en la parte superior y sacar elementos (pop) desde
 * la misma parte superior.
 * 
 * 
 * En el programa, se crea una instancia de la clase Stack llamada pila para almacenar los
 * elementos ingresados por el usuario.
 * 
 *El programa utiliza un objeto de la clase Scanner para permitir que el usuario ingrese los 
 * elementos de la pila. Se solicita al usuario que ingrese un número positivo para agregarlo
 * a la pila o ingresar -1 para finalizar el ingreso.
 * 
 * Dentro del bucle while, cada número ingresado por el usuario se agrega a la pila utilizando
 * el método push.
 * 
 * Una vez que el usuario ingresa -1 para finalizar, el programa imprime los elementos de la pila 
 * utilizando el bucle while. Utiliza el método pop para sacar y mostrar el elemento en la parte 
 * superior de la pila. El bucle se ejecuta hasta que la pila esté vacía, lo cual se verifica 
 * utilizando el método empty.
 * 
 *Finalmente, el programa se cierra después de que el usuario haya terminado de interactuar con la pila.
 * 
 * 
 * 
 */
