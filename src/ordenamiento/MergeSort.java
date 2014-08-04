/*Universidad del Valle de Guatemala
 * Adolfo Morales 13014
 * Luis Duarte, 13003
 * Javier Merida 13269
 * Kevin Rivera 13389
 * AbirJFileChooser.java
 Guatemala 31 de 07 de 2014
 Descripción: Clase que permite encontrar el path de un archivo
 */
package ordenamiento;

public class MergeSort extends Ordenador{
    private int[] numbers;
    private int[] helper;
    private int number;

    public MergeSort(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        mergesort(0, number - 1);
    }

    public void mergesort(int low, int high) {
    // En caso de que izq sea menor que der, entonces la cadena tiene un largo de 0 o uno entonces esta ordenada.
        if (low < high) {
            // Se calcula el indice del elemento medio de la cadena para poder ordenar
            int middle = low + (high - low) / 2;
            // Ordenar la parte izquierda
            mergesort(low, middle);
            // Ordena la parte derecha de la cadena
            mergesort(middle + 1, high);
            // Combina las dos partess
            valores = merge(low, middle, high);
        }
    }

    public int[] merge(int low, int middle, int high) {

        // copia las dos partes en una sola
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // copiamos los valores mas pequeños de ambos lados a la cadena original
        while (i <= middle && j <= high) {
             //comparacion para saber cual es mas pequeño en la segunda mitad
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                    numbers[k] = helper[j];
                    j++;
            }
            k++;
        }
        // Copiamos la otra mitad
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }
        return numbers;


    }

    public int[] getArregloOrdenado() {
        return valores;
    }
  
} 