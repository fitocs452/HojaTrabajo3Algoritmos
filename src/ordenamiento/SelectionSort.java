/*Universidad del Valle de Guatemala
 * Luis Duarte, 13003
 * Javier Merida, 
 * Adolfo Morales, 13014
 * Kevin Rivera, 13389
 * SelectionSort.java
 * Clase que realiza el ordenamiento de datos por medio del SelectionSort
 */

package ordenamiento;

/**
 *
 * @author Kevin
 */
//Clase que toma una lista de datos desordenada y la ordena por medio de SelectionSort
public class SelectionSort extends Ordenador{
    private int[] arregloOrdenado;

//El arreglo ordenado se genera a partir de utilizar el selection sort a los valores de una lista desordenada
    public SelectionSort(int[] lista) {
        arregloOrdenado = selectionSort(lista);
    }

//El contador es la cantidad de datos menos uno, ya que compara por parejas consecutivas 
//Es decir que el ciclo termina cuando ya se hicieron cantidad de datos menos una comparaciones
    public int[] selectionSort(int[] lista){
        for (int i = 0; i < lista.length - 1; i++)
        {
            int index = i;
            //Compara un dato con su dato consecutivo
            //Selecciona el dato menor y lo coloca primero
            //Luego se mueve un espacio y hace otra comparacion con una pareja de datos consecutivos
            //Asi se va hasta que haya realizado cantidad de datos menos una comparaciones
            for (int j = i + 1; j < lista.length; j++)
                if (lista[j] < lista[index]) 
                    index = j;
            //Genera una nueva lista a partir de los datos ordenados de la lista anterior desordenada  
            int smallerNumber = lista[index];  
            lista[index] = lista[i];
            lista[i] = smallerNumber;
        }
        
        return lista;
    }

    public int[] getArregloOrdenado() {
        return arregloOrdenado;
    }
    
    
}
