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
    NodoTicket cabeza, ultimo ;
    int numero;
    String tipo;
    Impresion imprimir = new Impresion();
    
    
    public boolean colaVacio(){
        return cabeza==null;
    }
    
    public void push(String tipo){
        if(colaVacio()){
            numero=1;
        }else{
            numero= 1+ultimo.ticket.numero;
        }             
        Ticket nuevoTicket = new Ticket(numero, tipo);
        NodoTicket nuevoNodo = new NodoTicket(nuevoTicket);
        if(cabeza==null){
            cabeza=nuevoNodo;
            ultimo=nuevoNodo;
        }else{
            ultimo.siguiente=nuevoNodo;
            ultimo=nuevoNodo;
        }
        imprimir.generarPdf(nuevoTicket);

        JOptionPane.showMessageDialog(null,"Se ha creado el ticket numero: "+nuevoTicket.numero + " de tipo: "+nuevoTicket.tipo);
    }

}
