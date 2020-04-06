/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell Laptop
 */
public class GestionTickets {

    NodoTicket cabeza, ultimo;
    NodoTicket esp1, esp2;
    int numero, numeroes;
    String tipo;
    Impresion imprimir = new Impresion();

    public boolean colaVacio() {
        return cabeza == null;
    }

    public boolean colaVacio1() {
        return esp1 == null;
    }

    public void push(String tipo) {
        JOptionPane.showMessageDialog(null, tipo);
        if (tipo.equals("GENERAL")) {
            if (colaVacio()) {
                numero = 1;
            } else {
                numero = 1 + ultimo.ticket.numero;
            }
            Ticket nuevoTicket = new Ticket(numero, tipo);
            NodoTicket nuevoNodo = new NodoTicket(nuevoTicket);
            if (cabeza == null) {
                cabeza = nuevoNodo;
                ultimo = nuevoNodo;
            } else {
                ultimo.siguiente = nuevoNodo;
                ultimo = nuevoNodo;
            }
            imprimir.generarPdf(nuevoTicket);

            JOptionPane.showMessageDialog(null, "Se ha creado el ticket numero: " + nuevoTicket.numero + " de tipo: " + nuevoTicket.tipo);
        } else {

            if (colaVacio1()) {
                numeroes = 1;
            } else {
                numeroes = 1 + esp2.ticket.numero;
            }
            Ticket nuevoTicket = new Ticket(numeroes, tipo);
            NodoTicket nuevoNodo = new NodoTicket(nuevoTicket);
            if (esp1 == null) {
                esp1 = nuevoNodo;
                esp2 = nuevoNodo;
            } else {
                esp2.siguiente = nuevoNodo;
                esp2 = nuevoNodo;
            }
            imprimir.generarPdf(nuevoTicket);

            JOptionPane.showMessageDialog(null, "Se ha creado el ticket numero: " + nuevoTicket.numero + " de tipo: " + nuevoTicket.tipo);

        }

    }
}
