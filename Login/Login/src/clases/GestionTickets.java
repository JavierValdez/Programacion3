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
    NodoTicket EspInf, EspSup,GenInf,GenSup;
    int numero, numeroes;
    String tipo;
    Impresion imprimir = new Impresion();

    public boolean colaVacio() {
        return cabeza == null;
    }

    public boolean colaVacio1() {
        return EspInf == null;
    }

    public void push(String tipo) {
        
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
                numeroes = 1 + EspSup.ticket.numero;
            }
            Ticket nuevoTicket = new Ticket(numeroes, tipo);
            NodoTicket nuevoNodo = new NodoTicket(nuevoTicket);
            if (EspInf == null) {
                EspInf = nuevoNodo;
                EspSup = nuevoNodo;
            } else {
                EspSup.siguiente = nuevoNodo;
                EspSup = nuevoNodo;
            }
            imprimir.generarPdf(nuevoTicket);

            JOptionPane.showMessageDialog(null, "Se ha creado el ticket numero: " + nuevoTicket.numero + " de tipo: " + nuevoTicket.tipo);

        }
        
        if(!colaVacio1()){
            GenInf=EspInf;
            GenSup=EspSup;
            GenSup.siguiente=cabeza;
            GenSup=ultimo;
        }else{
            GenInf=cabeza;
            GenSup=ultimo;
        }
        NodoTicket n=GenInf;
        while(n!=null){
            JOptionPane.showMessageDialog(null,"Numero: "+n.ticket.numero+" clase "+n.ticket.tipo);
            n=n.siguiente;
        }
        
        
        

    }
}
