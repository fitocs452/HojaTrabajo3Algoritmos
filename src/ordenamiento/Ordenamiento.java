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

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Adolfo
 */
public class Ordenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /************** Creamos el archivo de números aleatorios ***********************/
        
        DataManager generadorData = new DataManager();
        boolean archivoValido = false;
        
        while (archivoValido != true){
            try{
                //mandamos a llamar el método que genera los números aleatorios
                generadorData.generarDatos();
                JOptionPane.showMessageDialog(null, "           Archivo generado satisfactoriamente " + "\n"
                                            + "Favor de seleccionar archivo en donde se encuentran " + "\n" 
                                            + "                   los números a ordenar            ");
                archivoValido = true;
                
            }catch(Exception e){
                System.out.println("Error al momento de crear el archivo");
            }
        }
        /********************************************************************************/
        
        /*********** Abrimos el archivo en donde se generaron los números ***************/
        AbrirJFileChooser findFile = new AbrirJFileChooser();
        findFile.AbrirBuscador();
        String path = findFile.getPathArchivo();
        /********************************************************************************/
        
        /*********** Generamos el arreglo de enteros de los números aleatorios***********/
        int[] archivo = generadorData.generarArregloEnteros(path);
        System.out.println("\n" + "Tamanho: " + archivo.length);
        /********************************************************************************/
        
        /*********** Implementamos el Factory Pattern ***********************************/
        SortFactory factory = new SortFactory();
        
        /*******************************************************************************/
        boolean salir = false;
        while(salir == false){
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        "Bienvenido al Ordenamiento: "+ "\n" +
                        "Seleccion de algoritmo de ordenamiento: "+"\n"+
                        " 1. Selection Sort. "+ "\n" +
                        " 2. Merge Sort. "+ "\n" +
                        " 3. Bubble Sort. "+ "\n" +
                        " 4. Quick Sort. "+   "\n" +     
                        " 5. Salir Programa. "+   "\n" +  
                                    "\n"+
                        "Ingresa una opcion:"));

            if(opcion != 5){
            factory.selecOrdenador(archivo, opcion);
            }else{
                salir = true;
            }
        }
        
        
        /********************************************************************************/
        
    }
        
    
}
