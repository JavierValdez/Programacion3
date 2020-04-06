/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Dell Laptop
 */
public class Escritorio {
    int numero;
    Ticket ticket;
    Usuario user;
    
    public Escritorio(int n){
        this.numero=n;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
        
    public Ticket getTicket() {
        return ticket;
    }


    public void setUser(Usuario user) {
        this.user = user;
    }

    public Usuario getUser() {
        return user;
    }

}
