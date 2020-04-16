/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell Laptop
 */
public class Impresion {
    private static Font fuenteNormal= new Font(Font.FontFamily.COURIER, 10 , Font.NORMAL);       
    private static Font fuenteTicket= new Font(Font.FontFamily.COURIER, 20 , Font.NORMAL);
        
        public void generarPdf(Ticket ticket){
            try{
                Document doc = new Document(PageSize.A7, 2,2,2,2);
                PdfWriter.getInstance(doc, new FileOutputStream(Integer.toString(ticket.numero)+".pdf"));
                doc.open();
                doc.add(getTitulo("Banco Pistio"));
                doc.add(getTitulo(" "));
                doc.add(getId(ticket.id));
                doc.add(getTitulo(" "));
                doc.add(getFecha(ticket.getFecha()));
                doc.add(getHora(ticket.getHora()));
                doc.close();              
                
                
            }catch(Exception e) {
                System.out.println("Error"+e);
            }
            }
        
        
        private Paragraph getTitulo(String titulo){
            Paragraph p= new Paragraph();
            Chunk c= new Chunk();
            p.setAlignment(Element.ALIGN_CENTER);
            c.append(titulo);
            c.setFont(fuenteNormal);
            p.add(c);
            return p;
        }
        private Paragraph getId(String id){
            Paragraph p= new Paragraph();
            Chunk c= new Chunk();
            p.setAlignment(Element.ALIGN_CENTER);
            c.append(id);
            c.setFont(fuenteTicket);
            p.add(c);
            return p;
        }
        private Paragraph getFecha(String fecha){
            Paragraph p= new Paragraph();
            Chunk c= new Chunk();
            p.setAlignment(Element.ALIGN_CENTER);
            c.append(fecha);
            c.setFont(fuenteNormal);
            p.add(c);
            return p;
        }
        private Paragraph getHora(String hora){
            Paragraph p= new Paragraph();
            Chunk c= new Chunk();
            p.setAlignment(Element.ALIGN_CENTER);
            c.append(hora);
            c.setFont(fuenteNormal);
            p.add(c);
            return p;
        }
        
}
