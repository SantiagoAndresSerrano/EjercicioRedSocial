/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class Grupo {
    private ArrayList<Estudiante> estudiantes;
    private String nombre,descripcion,tipoGrupo,noticias,datosDePropietario;
    
    public Grupo(){}
    public Grupo(String nombre, String descripcion, String tipoGrupo, String noticias, String datosDePropietario) {
        this.estudiantes = new ArrayList<>();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoGrupo = tipoGrupo;
        this.noticias = noticias;
        this.datosDePropietario = datosDePropietario;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoGrupo() {
        return tipoGrupo;
    }

    public void setTipoGrupo(String tipoGrupo) {
        this.tipoGrupo = tipoGrupo;
    }

    public String getNoticias() {
        return noticias;
    }

    public void setNoticias(String noticias) {
        this.noticias = noticias;
    }

    public String getDatosDePropietario() {
        return datosDePropietario;
    }

    public void setDatosDePropietario(String datosDePropietario) {
        this.datosDePropietario = datosDePropietario;
    }
    
}
