/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ListaDoble;
import modelo.Computador;
import modelo.metodoTXT;

/**
 *
 * @author GIOVANNI
 */
public final class ControlListaDoble implements ActionListener {
    
    vista.VistaLista vistaE1;
    ListaDoble lista = new ListaDoble();
    metodoTXT mTXT = new metodoTXT();
    ArrayList<Computador> listaArr = new ArrayList<>();//alumno podemos cambiar por cualquier otro objeto y que sera enviado a la vista tabla

    public ControlListaDoble(vista.VistaLista vistaE) throws IOException {
        mTXT.leer();
        this.listaArr = mTXT.getLista();
        this.vistaE1 = vistaE;
        cargarListaDoble();
        this.vistaE1.btn_ingresarInicio.addActionListener(this);
        this.vistaE1.btn_mostrardesdeInicio.addActionListener(this);
        this.vistaE1.btn_guardar.addActionListener(this);
        this.vistaE1.btn_mostrardesdeFin.addActionListener(this);
    }
    
    void cargarListaDoble() {
        for (int i = 0; i < listaArr.size() ; i++) {
            lista.agregarIncio(listaArr.get(i));
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (vistaE1.txt_id.getText().isEmpty() || this.vistaE1.txt_id.getText().matches("[A-Z]*") || this.vistaE1.txt_id.getText().matches("[a-z]*")) {
            this.vistaE1.txtA_monitorprin.setText("por favor llenar los campos con los datos correctos");
        } else {
            if (e.getSource() == vistaE1.btn_ingresarInicio) {
                int puertos= (int) (Math.random() * 20) + 1; //se genera un aleatoro
                int idT = Integer.parseInt(this.vistaE1.txt_id.getText().trim());
                lista.agregarIncio(new Computador(idT + "", this.vistaE1.txt_marca.getText().trim(),this.vistaE1.txt_procesador.getText().trim(), puertos+""));
                listaArr.add(new Computador(idT + "", this.vistaE1.txt_marca.getText().trim(),this.vistaE1.txt_procesador.getText().trim(), puertos+""));
                JOptionPane.showMessageDialog(null, "dato agregado al incio con exito");
                this.vistaE1.txtA_monitorprin.setText("ingrese el siguente dato");
            }
        }
        if (e.getSource() == vistaE1.btn_mostrardesdeInicio) {
            this.vistaE1.txtA_monitorprin.setText("");
            this.vistaE1.txtA_monitorprin.append(lista.motrarDesdeInicio());
            
        }
        if (e.getSource() == vistaE1.btn_mostrardesdeFin) {
            this.vistaE1.txtA_monitorprin.setText("");
            this.vistaE1.txtA_monitorprin.append(lista.mostrarDesdeFin());
            
        }
        if (e.getSource() == vistaE1.btn_guardar) {
            mTXT.setLista(listaArr);
            try {
                mTXT.escribir();
            } catch (IOException ex) {
                Logger.getLogger(ControlListaDoble.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
