package src.ejercicio1;

/*
 * Autor: Jan Carlo Martínez Martínez
 * Ejercicio 1 - Ordenamiento por Burbuja (Bubble Sort) la fakin burbuja
 * 05/11/2026
 * Me pasa con 7 la unidad 1 profe 
 * le heche ganas pero andaba en mi global :)
 */

public class ejercicio1 {
						//Declaramos el metodo que se nos pide en el pdf
    public static void bubbleSort(int[] arreglo) {

        int comparaciones = 0;//Iniciamos variable de comparaciones
        int intercambios = 0;//Iniciamos el contador de intercambios
        int pasadas = 0;// Pasadas completas de arrglo
        boolean intercambio;//Declaramos una variable para el intercambio de tipo boolean

        do {//Ciclo de mientras que donde vemos intercambio
            intercambio = false;//Intercambio se marca en falso para continuar con el dowhile
            pasadas++;//Cada que entra a un nuevo ciclo marcamos la pasada osea le sumamos 1

            for (int i = 0; i < arreglo.length - pasadas; i++) {//Ciclo for para recorrer el arreglo y comparar el arreglo 

                comparaciones++;//cada que entra al for se le suma 1 a las comparaciones

                if (arreglo[i] > arreglo[i + 1]) {//Comparamos el arreglo la posicion actual i y la siguiente posicion i+1

                    int aux = arreglo[i];//Aquí declare una variable de tipo int con el nombre aux para agregar 
					//la primera posicion en caso de que sera mayor al siguiente en el arreglo
                    arreglo[i] = arreglo[i + 1];//posteriormente agregamos n+1 a la posicion n 
                    arreglo[i + 1] = aux;//y reasignamos n en la variable auxiliar 
					//a n+1
                    intercambios++;//Al hacer todo este proceso hicimos un intercambio
					//le sumamos una a la variable
                    intercambio = true;//Y intercambio lo cambiamos de false a true para que continue con el ciclo
                }
            }

            System.out.print("Pasada " + pasadas + ": ");//Mostramos la pasada actual
            mostrarArreglo(arreglo);//llamos a la funcion mostrar arreglo y de parametro enviamos arreglo

        } while (intercambio);

        System.out.println("\nResultados:");//Imprimimos resultados 
        System.out.println("Comparaciones: " + comparaciones);//comparaciones
        System.out.println("Intercambios: " + intercambios);//Intrecambios
        System.out.println("Pasadas: " + pasadas);//Pasadas
    }

    public static void mostrarArreglo(int[] arreglo) {//Creamos una funcion mostrar arreglo
		//Que sera estatica, que recibira un entero
        for (int elemento : arreglo) {//for para recorrer e imprimir el arreglo
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("____Arreglo original____");
        int[] arreglo1 = {34, 12, 25, 8, 19};//Arregllo original del pdf 
        bubbleSort(arreglo1);

        System.out.println("\n____Arreglo ya ordenado____");
        int[] arreglo2 = {8, 12, 19, 25, 34};//El arreglo ya ordenado 
		// Aquí solo sera hara una pasada debido a que todo ya esta en orden 
        bubbleSort(arreglo2);

        System.out.println("\n____Arreglo en orden inverso____");
        int[] arreglo3 = {34, 25, 19, 12, 8};// Arreglo inverso para arreglarlo
        bubbleSort(arreglo3);
    }
}