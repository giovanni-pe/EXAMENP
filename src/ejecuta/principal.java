/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecuta;

import modelo.ListaDoble;
import vista.VistaListaDoble;



/**
 *
 * @author GIOVANNI
 */
public class principal{
    public static void main(String[] args) {
       VistaListaDoble vista=new VistaListaDoble();
        ListaDoble lista= new ListaDoble();
       controlador.Control control = new controlador.Control(vista,lista);
       vista.setVisible(true);
        
    }
}
