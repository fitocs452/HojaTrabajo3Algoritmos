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
public class QuickSort extends Ordenador{

    private int[] numeros;

    public QuickSort(int[] values) {
        this.numeros = values;
        numeros = quicksort();
    }
    
    public int[] quicksort(){
               /*Mando a llamar el ordenamiento, que recibe como parámetros:
                    - el arreglo de numeros enteros
                    - el pivote para particionar la lista en el principio, que en nuestro caso
                        es tambien mi first index o minimium index
                    - el last index o maximium index*/
        return quicksort(numeros, 0, numeros.length-1);
    }
    
    public int[] quicksort(int numeros[], int izq, int der){
        //Verifico que los index sean correctos
        if (izq >= der){
            return numeros;
        }
        
        int pivote=numeros[izq];
        
        //mis index que funcionan como variables para que se preserven los index en condiciones iniciales
        int izIndex = izq; 
        int deIndex = der;
        int aux;
        
        //Comienzo mi ordenamiento
        while(izIndex < deIndex){   

            //Voy verificando en donde se encuentran mis idex
            //Con el fin de ir ordenando las particiones
            while(numeros[izIndex] <= pivote && izIndex < deIndex) izIndex++;

            while(numeros[deIndex] > pivote) deIndex--;   

            //voy variando mi index para encontrar los mayores que él y así va ordenando
            if (izIndex < deIndex) {                                     
                    aux = numeros[izIndex];                  
                    numeros[izIndex] = numeros[deIndex];
                    numeros[deIndex] = aux;
            }
        }
        
        numeros[izq] = numeros[deIndex]; 
        numeros[deIndex] = pivote; 
        
        //Cuando ya esten mis indicadores en el centro, vuelve a hacer el proceso pero con las otras
        //dos mitades, lo único que varío son los valores de mis indicadores bueno el indicador maximium para ser exacto
        //la primera vez y luego el index minimium
        if(izq < deIndex-1){
            quicksort(numeros, izq, deIndex-1);
        }
        if(deIndex+1 <der){
            quicksort(numeros,deIndex+1,der);
        }
        
        return numeros;
    }
}
