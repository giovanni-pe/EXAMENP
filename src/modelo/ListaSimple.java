/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author GIOVANNI
 */
public class ListaSimple {

    NodoLSimple inicio;
     NodoLSimple fin;
    public ListaSimple() {
        inicio = null;
        fin = null;
    }

    public void agregar(Computador computador) {
        NodoLSimple nuevoNodo = new NodoLSimple(computador);
        nuevoNodo.siguiente = inicio;
        inicio = nuevoNodo;
        if (fin == null) {
            fin = inicio;
        }

//        inicio=new Nodo(dato,inicio);
    }

    public String  mostrarP() {
        NodoLSimple recorre = this.inicio;
        String buf="";
        while (recorre != null) {
            buf+=recorre.computador.informacion()+"-->";
            recorre = recorre.siguiente;
        }
        return buf;
    }

    boolean Listavacia() {
        return inicio == null;
    }

    public void agregarAlFinal(Computador computador) {
        NodoLSimple nuevo_nodo = new NodoLSimple(computador);
        if (!Listavacia()) {
            fin.siguiente = nuevo_nodo;
            fin = fin.siguiente;
        } else {
            inicio = fin = nuevo_nodo;
        }
    }
 
 public void eliminarFin(){
  
   if(inicio==fin){
       inicio=fin=null;
   }else{ 
       NodoLSimple temp=inicio;
   while(temp.siguiente!=fin){
       temp=temp.siguiente;
   } 
   
       fin=temp;
       fin.siguiente=null;
       
  }
}
}
