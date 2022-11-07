/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author GIOVANNI
 */
public class NodoD {
    int dato;
    NodoD anterior,siguiente;
 public NodoD(int dato) {///cuando  hay nodos
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
    public NodoD(int dato,NodoD siguiente, NodoD anterior ) {///cuando no hay nodos
        this.dato = dato;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }
}
