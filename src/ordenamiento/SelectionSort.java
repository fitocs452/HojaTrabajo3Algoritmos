/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordenamiento;

/**
 *
 * @author Adolfo
 */
public class SelectionSort extends Ordenador{
    private int[] arregloOrdenado;

    public SelectionSort(int[] lista) {
        arregloOrdenado = selectionSort(lista);
    }
    
    public int[] selectionSort(int[] lista){
        for (int i = 0; i < lista.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < lista.length; j++)
                if (lista[j] < lista[index]) 
                    index = j;
      
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
