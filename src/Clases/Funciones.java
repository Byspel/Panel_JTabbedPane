/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import panel_jtabbedpane.Inicio;

/**
 *
 * @author Ivan
 */
public class Funciones {
    public void Cerrar() {
        Inicio.contenedor.remove(Inicio.contenedor.getSelectedIndex());
    }
}
