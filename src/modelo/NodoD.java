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
    Computador computador;
    NodoD anterior,siguiente;
 public NodoD(Computador computador) {///cuando  hay nodos
        this.computador = computador;
        this.anterior = null;
        this.siguiente = null;
    }
    public NodoD(Computador computador,NodoD siguiente, NodoD anterior ) {///cuando no hay nodos
        this.computador = computador;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }
}
