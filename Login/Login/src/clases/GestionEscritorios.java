/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * lkn@author Dell Laptop
 */
public class GestionEscritorios {

    NodoEscritorio cabeza, ultimo;
    int numero;

    public boolean colaVacio() {
        return cabeza == null;
    }

    public void push() {
        if (colaVacio()) {
            numero = 1;
        } else {
            numero = 1 + ultimo.escritorio.numero;
        }
        Escritorio escritorio = new Escritorio(numero);
        NodoEscritorio nuevoNodo = new NodoEscritorio(escritorio);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
        }
        JOptionPane.showMessageDialog(null, "Se ha creado el escritorio numero: " + escritorio.numero);
    }
}
