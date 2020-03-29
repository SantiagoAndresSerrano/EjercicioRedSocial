/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author santi
 */
public class Comentario {
    private String texto;
    private Date fecha;
    
    
     public Comentario(String texto, Date fecha) {
        this.texto = texto;
        this.fecha = fecha;
    }

    public Comentario() {
    }
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

   
}
