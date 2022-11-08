/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
public class NodoLSimple {
  Computador computador;
  NodoLSimple siguiente;
 public NodoLSimple(Computador computador){
     this.computador=computador;
     this.siguiente=null;
    
 }  
 public NodoLSimple(Computador computador,NodoLSimple inicioI){
    this.computador=computador;
    this.siguiente=inicioI;
 }
}
