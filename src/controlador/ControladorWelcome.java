/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.VistaLista;

/**
 *
 * @author GIOVANNI
 */
public class ControladorWelcome implements ActionListener{
     VistaLista vista=new VistaLista();
        
       controlador.ControlListaDoble controlLDoble ;
       ControlListaSimple controlLsimple;
    vista.Welcome vistaE1;
    
 
    public ControladorWelcome(vista.Welcome vistaE){
      
        this.vistaE1 = vistaE;
        this.vistaE1.btn_listaDoble.addActionListener(this);
        this.vistaE1.btn_listaSimple.addActionListener(this);
    
    }
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vistaE1.btn_listaSimple) {
            try {
                controlLsimple = new controlador.ControlListaSimple(vista);
            } catch (IOException ex) {
                Logger.getLogger(ControladorWelcome.class.getName()).log(Level.SEVERE, null, ex);
            }
            vista.lbl_tipolista.setText("LISTA SIMPLE");
            vista.setVisible(true);
        }
        if (e.getSource() == vistaE1.btn_listaDoble) {
            vista.lbl_tipolista.setText("LISTA DOBLE");
            try {
                controlLDoble = new controlador.ControlListaDoble(vista);
              
            } catch (IOException ex) {
                Logger.getLogger(ControladorWelcome.class.getName()).log(Level.SEVERE, null, ex);
            }
        vista.setVisible(true);
        }
    }
    
}
