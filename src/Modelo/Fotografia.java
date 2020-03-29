/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author santi
 */
public class Fotografia 
{
    String nombreArchivo,descripcion;

     public Fotografia(){}
     public Fotografia(String nombre, String descripcion) {
        this.nombreArchivo = nombre;
        this.descripcion = descripcion;
    }
    
    
    public String getNombre() {
        return nombreArchivo;
    }

    public void setNombre(String nombre) {
        this.nombreArchivo = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    
}
