
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

    public void agregarFin(int dato) {
        if (!ListaVacia()) {
            fin = new NodoD(dato, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new NodoD(dato);
        }
    }

    public void agregarIncio(int dato) {
        if (!ListaVacia()) {
            inicio = new NodoD(dato, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new NodoD(dato);
        }
    }
    //metodo para mostrar la lista de incicio a fin

    public String motrarDesdeInicio() {
        String data="";
        if (!ListaVacia()) {
            String datos = "<=>";
            NodoD auxD = inicio;
            while (auxD != null) {
                datos = datos + "[" + auxD.dato + "]<=>";
                auxD = auxD.siguiente;
            }
            data=datos;
            }
        return data;
    }
    //metdos para mostrar la lista de fin a incio

    public void  mostrarDesdeFin() {
        if (!ListaVacia()) {
            String datos = "<=>";
            NodoD aux = fin;
            while (aux != null) {
                datos += "[" + aux.dato + "]<=>";
                aux = aux.anterior;
            }
            JOptionPane.showMessageDialog(null, datos, "mostrando desde fin a incicio", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //eliminar del incio 

    public int eliminarDesdeIncio() {
        int elemento = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return elemento;
    }

    public int eliminarDesdeFin() {
        int dato=fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        }else{
            fin=fin.anterior;
            fin.siguiente=null;
        }
        return dato;
    }
}
