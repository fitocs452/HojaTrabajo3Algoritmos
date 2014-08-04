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
import javax.swing.JOptionPane;


public class Ordenador {
  protected int [] valores; //los valores a ordenar
 

     @Override
    //metodo que imprime los valores de la lista 
public String toString() {
         String cadena="";
    for (int i=0; i<(valores.length);i++){
        System.out.println(valores[i]);
        cadena= cadena+" ,"+valores[i];
        if(i%100==0)
            cadena=cadena+  "\n"; 

        }
   JOptionPane.showMessageDialog(null,cadena);
    return null;
    }
}
