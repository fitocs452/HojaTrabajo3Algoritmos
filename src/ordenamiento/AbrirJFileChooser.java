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

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Adolfo
 */
public class AbrirJFileChooser{
    private JButton botonFile;
    private String pathArchivo;
    private String nombreArchivo;

    public AbrirJFileChooser() {
    }
    
    public void AbrirBuscador() {
        
        boolean continuar = false;
        //Si dio aceptar, obtiene el path y el nombre del archivo
        while(continuar == false){
            //Instancio un fileChooser
            JFileChooser elegir = new JFileChooser();
            //Verifico lo que escogió
            int opcion = elegir.showOpenDialog(botonFile);
            if (opcion == JFileChooser.APPROVE_OPTION) {
                pathArchivo = elegir.getSelectedFile().getPath(); //Obtiene path del archivo
                nombreArchivo = elegir.getSelectedFile().getName(); //obtiene nombre del archivo
                continuar = true;
            }else if(opcion == JFileChooser.CANCEL_OPTION){
                JOptionPane.showMessageDialog(null, "Por Favor escoga el archivo");
            }
        }
    }

    //Método que me permite accesar al String pathArchivo
    public String getPathArchivo() {
        return pathArchivo;
    }
    
    //Método que me permite accesar al String nombreArchivo
    public String getNombreArchivo(){
        return nombreArchivo;
    }
    
    
}