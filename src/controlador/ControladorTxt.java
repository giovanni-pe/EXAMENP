/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import modelo.ModeloTXT;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Alumno;


import vista.VistaTabla;

public class ControladorTxt implements ActionListener {
    
    ModeloTXT modeloT = new ModeloTXT();
    String cabezeraTabla[] = {"titulo1", "titulo2", "titulo3", "titulo4"};

    VistaTabla vistaE1=new VistaTabla();
    File archivoT;

    public ControladorTxt(ArrayList<Alumno> al) throws IOException {
        this.vistaE1.PasarLista(al); 
      
        this.vistaE1.setVisible(true);
        
        this.modeloT = new modelo.ModeloTXT();

        archivoT = new File("src\\archivos\\BdTXT.txt");
        modeloT.Cargar(archivoT, vistaE1.jTableAlumno, cabezeraTabla);
       
        this.vistaE1.btnGuardaModificacion.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaE1.btnGuardaModificacion) {
            archivoT = new File("src\\archivos\\BdTXT.txt");
            try {
                modeloT.Guardar(archivoT, vistaE1.jTableAlumno);
            } catch (IOException ex) {
                Logger.getLogger(ControladorTxt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
