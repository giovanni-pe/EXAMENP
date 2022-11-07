/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Controlador.ControladorTxt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ListaDoble;
import vista.VistaTabla;
import modelo.Alumno;

/**
 *
 * @author GIOVANNI
 */
public class Control implements ActionListener {
    vista.VistaListaDoble vistaE1;
    ListaDoble lista;
    ArrayList<Alumno> listaTabla=new ArrayList<>();//alumno podemos cambiar por cualquier otro objeto y que sera enviado a la vista tabla
    public Control(vista.VistaListaDoble vistaE,ListaDoble lista) {
        this.vistaE1 = vistaE;
        this.lista=lista;
        this.vistaE1.btn_ingresarInicio.addActionListener(this);
        this.vistaE1.btn_mostrardesdeInicio.addActionListener(this);
        this.vistaE1.btn_verTabla.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(vistaE1.txt_id.getText().isEmpty()|| this.vistaE1.txt_id.getText().matches("[A-Z]*")||this.vistaE1.txt_id.getText().matches("[a-z]*")){
            this.vistaE1.txtA_monitorprin.setText("por favor llenar los campos con los datos correctos");
        }else { if (e.getSource() == vistaE1.btn_ingresarInicio) {
            int idT=Integer.parseInt(this.vistaE1.txt_id.getText().trim());
            lista.agregarIncio(idT);
            listaTabla.add(new Alumno("nombre","apellido",idT+"","20202"));
            JOptionPane.showMessageDialog(null,"dato agregado al incio con exito");
            this.vistaE1.txtA_monitorprin.setText("ingrese el siguente dato");
        }
        }
        if (e.getSource() == vistaE1.btn_mostrardesdeInicio) {
         this.vistaE1.txtA_monitorprin.setText("");
         this.vistaE1.txtA_monitorprin.append(lista.motrarDesdeInicio());
        
        }
        if(e.getSource()==vistaE1.btn_verTabla){
            try {
                Controlador.ControladorTxt cotrolpanel=new ControladorTxt(listaTabla);
            } catch (IOException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
