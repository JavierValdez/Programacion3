/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell Laptop
 */
public class Ticket {
    public int numero;
    String tipo; 
    String id;
    Date date = new Date();
    DateFormat hora = new SimpleDateFormat("HH:mm:ss");
    DateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");  
      
    public Ticket(int num, String tipo){
        this.numero=num;
        this.tipo=tipo;
        this.fecha=fecha;
        this.hora=hora;
        this.id=this.idgenerador(tipo,num);

    }
    public String getHora() {
        return hora.format(date);
    }

    public String getFecha() {
        return fecha.format(date);
    }
    private String idgenerador(String a,int b){
        char[] id = tipo.toCharArray();
        String z = String.valueOf(id[0])+String.valueOf(b);
        return z;
    }
}
