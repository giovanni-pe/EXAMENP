/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GIOVANNI
 */
public class ModeloTXT {


    public void Cargar(File archivo, JTable tablaD, String cabezera[]) throws IOException {
        String respuesta = "Error en enl sistema, no se pudo cargar los datos";
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
        DefaultTableModel modeloT = new DefaultTableModel();
        tablaD.setModel(modeloT);
        tablaD.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
             
            String cad, matriz[][] = new String[200][20];
            int fila = 0;
            while ((cad = br.readLine()) != null) {
                String cad2[] = cad.split(",");
                for (int i = 0; i < cad2.length; i++) {
                    matriz[fila][i] = cad2[i];
                }
                fila++;
            }
            tablaD.setModel(new javax.swing.table.DefaultTableModel(matriz, cabezera));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Informacion cargada con exito");
    }

    public void Guardar(File archivo, JTable tablaD) throws IOException {
        String respuesta = "Error en el sistema txt.";
        int numFila = tablaD.getRowCount(), numColumna = tablaD.getColumnCount();
        if (!archivo.exists())   archivo.createNewFile();
        PrintWriter pw = new PrintWriter(archivo);
        for (int i = 0; i < numFila; i++) {
            String acu = "";
            for (int j = 0; j < numColumna; j++) {
                    acu += String.valueOf(tablaD.getValueAt(i, j)).trim() + ",";
            }
            pw.println(acu);
        }
        pw.close();
        respuesta = "DATOS GUARDADADOS.";
        JOptionPane.showMessageDialog(null, respuesta);
    }
}
