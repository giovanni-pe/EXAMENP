/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author GIOVANNI
 */
public class ListaDoble {

    private NodoD inicio, fin;

    public ListaDoble() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean ListaVacia() {
        return inicio == null;
    }
    //metodo para agregar nodos al final

    public void agregarFin(Computador computador) {
        if (!ListaVacia()) {
            fin = new NodoD(computador, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new NodoD(computador);
        }
    }

    public void agregarIncio(Computador Computador) {
        if (!ListaVacia()) {
            inicio = new NodoD(Computador, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new NodoD(Computador);
        }
    }
    //metodo para mostrar la lista de incicio a fin

    public String motrarDesdeInicio() {
        String data="";
        if (!ListaVacia()) {
            String datos = "<=>";
            NodoD auxD = inicio;
            while (auxD != null) {
                datos = datos + "[" + auxD.computador.informacion() + "]<=>";
                auxD = auxD.siguiente;
            }
            data=datos;
            }
        return data;
    }
    //metdos para mostrar la lista de fin a incio

    public String mostrarDesdeFin() {
        String data="";
        if (!ListaVacia()) {
            String datos = "<=>";
            NodoD aux = fin;
            while (aux != null) {
                datos += "[" + aux.computador.informacion() + "]<=>";
                aux = aux.anterior;
            }
           data=datos;     }
        return data;
    }
    //eliminar del incio 

    public int eliminarDesdeIncio() {
        int elemento = Integer.parseInt(inicio.computador.Id);
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return elemento;
    }

    public int eliminarDesdeFin() {
        int dato=Integer.parseInt(fin.computador.Id);
        if (inicio == fin) {
            inicio = fin = null;
        }else{
            fin=fin.anterior;
            fin.siguiente=null;
        }
        return dato;
    }
    public void eliminar(int x){
        NodoD p=inicio;
        boolean encontrado=false;
        while (p!=null && !encontrado) {
            encontrado=(Integer.parseInt(p.computador.Id)==x);
            if (!encontrado) {
                p=p.siguiente;
            }
            if(encontrado){
                if (p==inicio) {
                    eliminarDesdeIncio();
//                inicio=p.siguiente;//porque da error cuando la lista esta vacia
//                inicio.anterior=null;

                }else{
                    if(p==fin){
                        eliminarDesdeFin();
//                       fin=fin.anterior;
//            fin.siguiente=null; 
                    }
                    
                    p.anterior.siguiente=p.siguiente;
                    if(p.siguiente!=null){
                        p.siguiente.anterior=p.anterior;
                       
                    }
                }
                p=null;
            }
        }
        
    }
    public void buscar(int x){
        NodoD p=inicio;
        boolean encontrado=false;
        while (p!=null && !encontrado) {
            encontrado=(Integer.parseInt(p.computador.Id)==x);
            if (!encontrado) {
                p=p.siguiente;
            }
            
            }
        if(encontrado){
                JOptionPane.showMessageDialog(null,"elmento con ID:"+x+ " encontrado");      
                p=null;
        }else{
            JOptionPane.showMessageDialog(null,"Elemento no econtrado");
        }
        
    }
}
