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

/**
 *
 * @author Adolfo
 */
public class SortFactory {
    public Ordenador ordena;

public SortFactory() {
    }
public void selecOrdenador(int [] val, int opcion){
    if (opcion==1){
        
    }if (opcion==2){
        
    }if(opcion == 3){
        ordena = new BubbleSort(val);
    }if(opcion == 4){
        ordena = new QuickSort(val);
    }
}    

    
}