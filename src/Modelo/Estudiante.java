/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author santi
 */
public class Estudiante 
{
    private Icon icono=new Icon() {
        @Override
        public void paintIcon(Component cmpnt, Graphics grphcs, int i, int i1) {
        }

        @Override
        public int getIconWidth() {
            return 0;
        }

        @Override
        public int getIconHeight() {
            return 0;
        }
    };
    private String nombre,apellido,nick,clave,correo;
    private int edad;
    private ArrayList<Comentario> comentarios;
    public Estudiante(){}
    public Estudiante(String nombre, String apellido, String nick, String clave, String correo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nick = nick;
        this.clave = clave;
        this.correo = correo;
        this.edad = edad;
        this.comentarios=new ArrayList<>();
         
    }

    public Icon getIcono() {
        return icono;
    }

    public void setIcono(Icon icono) {
        this.icono = icono;
    }



    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", nick=" + nick + ", correo=" + correo + ", edad=" + edad + '}'+"\n";
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    
    
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

  
    
    
}
