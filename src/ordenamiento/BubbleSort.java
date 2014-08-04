/*Universidad del Valle de Guatemala
 * Luis Duarte, 13003
 * Javier Merida 13269
 * Adolfo Morales 13014
 * Kevin Rivera 13389
 * BubbleSort.java
 * Clase que realiza el ordenamiento de datos por medio del Bubble Sort
 */
package ordenamiento;

public class BubbleSort extends Ordenador {
    //Definimos los atributos 
    //Contador de los movimientos realizados
    public int contOr=0;
    //Una lista de valores
    public int [] lista;
//Creamos el constructor, recibe de parametros la lista a ordenar 
public BubbleSort(int [] lista) {
    this.lista=lista;
    valores=bubble();
    toString();

}
//Metodo ordenar recibe como parametro un indice 
public void Ordenar(int i){
    //creamos valores temporales para guardar valores consecutivos
    int temp1=lista[i];
    int temp2=lista[i+1];
    //comparamos el mayor
    if (temp1>temp2){
        //si estan mal posicionados entonces se hace el cambio
        lista[i]=temp2;
        lista[i+1]=temp1;
        //incrementamos el contador de movimientos
        contOr++;
    }
}
//Metodo que devuelve el vector de valores ya ordenado
public int [] bubble (){
    //inicializamos con 0 el contador de movimientos
    contOr=0;
    //Recorremos la lista y la vamos ordenando
    for (int i=0; i<(lista.length-1);i++){
        Ordenar(i);
    }
    //Si el contador de movimientos aun no es cero quiere decir que todavia falta para ordenar
    if(contOr!=0)
        //entonces volvemos a llamar a la funcion hasta que se haga cero
        bubble();
    //retornamos la lista
    return lista;
}

}
 