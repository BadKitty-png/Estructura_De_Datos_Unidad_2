package listas.simples;
/*Autor: Jan Carlo Martínez Martínez 
* 15 de octubre 2026
* Nodo.java
*/
public class Nodo{
	private int dato;
	private Nodo siguiente;
	
	public Nodo(int dato) {
        	this.dato = dato;
        	this.siguiente = null; // Por defecto el siguiente nodo apunta a nulo
    	}

    	// --- Getters y Setters ---

    	public int getDato() {
        	return dato;
    	}

    	public void setDato(int dato) {
        	this.dato = dato;
    	}

    	public Nodo getSiguiente() {
        	return siguiente;
    	}

   	public void setSiguiente(Nodo siguiente) {
        	this.siguiente = siguiente;
    	}

}