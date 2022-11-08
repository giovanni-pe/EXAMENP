/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecuta;

import controlador.ControladorWelcome;
import vista.Welcome;

/**
 *
 * @author kuennen(7 caracteres) --> computador 4 atributos
 * clases listo
 * label, textfield listo
 * jbuton listo
 * 
 * archivo listo
 * lista simple listo
 * lista doble listo
 * aleatorio listo
 * originalidad listo
 * creatividad listo
 * funcionalidad listo
 */
public class Main {

    public static void main(String[] args) {
        Welcome ventanaInicio = new Welcome();
        ControladorWelcome WelControler = new ControladorWelcome(ventanaInicio);
        ventanaInicio.setVisible(true);
    }

}
