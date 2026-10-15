package listas.simples;
/* Autor: Jan Carlo Martínez Martínez 
- 15 de octubre 2026
- ListaSimple.java
*/

public class ListaSimple {
    private Nodo cabeza; // Nodo cabeza se declara como privado para buena práctica de seguridad
    
    public ListaSimple() {
        this.cabeza = null; // Constructor
    }
    
    // Función para insertar al inicio
    public void insertarAlInicio(int valor) {
        if (cabeza == null) {
            // Si la lista está vacía
            Nodo t = new Nodo(valor); 
            cabeza = t;
        } else {
            // Si la lista ya tiene elementos
            Nodo t = new Nodo(valor);
            t.setSiguiente(cabeza);
            cabeza = t;
        }
    }

    // Método para recorrer la lista y mostrar los datos en pantalla
    public void recorrer() {
        Nodo itera = cabeza; // Empezamos desde la cabeza
        System.out.println("===============================");
	System.out.println("Autor: Juanito Mentiras(Jan)");
	System.out.println("===========Resultado==========");
        System.out.print("Elementos de la lista: ");
        while (itera != null) {
            System.out.print(itera.getDato() + " -> ");
            itera = itera.getSiguiente(); // Avanzamos al siguiente nodo
        }
        System.out.println("Lista Vacia pap");
    }

    // Método principal (main) para probar las inserciones y el recorrido
    public static void main(String[] args) {
        // 1. Creamos la lista
        ListaSimple miLista = new ListaSimple();

        // 2. Agregamos elementos desde el main
        /*miLista.insertarAlInicio(10);
        *miLista.insertarAlInicio(20);
        miLista.insertarAlInicio(30);*/

        // 3. Mostramos los datos recorriendo la lista
        miLista.recorrer();
    }
}