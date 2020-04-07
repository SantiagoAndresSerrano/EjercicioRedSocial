/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Comentario;
import Modelo.Estudiante;
import Modelo.Fotografia;
import Modelo.Grupo;
import Vista.Ingresar;
import Vista.IngresoGrupo;
import Vista.Usuario;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class Controlador implements ActionListener 
{
    Comentario c;
    Grupo g;
    Estudiante e;
    Fotografia f;
    Ingresar ingresar;
    Usuario usuario;
    Estudiante estudianteAux;
    ArrayList<Estudiante> estudiantes;
    ArrayList<Grupo> grupos;
    IngresoGrupo ig;
    
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    private String fecha = sdf.format(new Date());
     
    
     
    public Controlador(IngresoGrupo ig,Comentario c, Grupo g, Estudiante e, Fotografia f, Ingresar ingresar, Usuario usuario) {
        super();
        this.c = c;
        this.g = g;
        this.e = e;
        this.f = f;
        this.ingresar = ingresar;
        this.usuario = usuario;
        this.estudiantes=new ArrayList<>();
        this.grupos=new ArrayList<>();
        this.ig=ig;
        actionListener(this);
        
    }

    public void actionListener(ActionListener al)
    {
    ingresar.btnRegistrar.addActionListener(al);
    ingresar.btnGrupo.addActionListener(al);
    ingresar.btnRegistroUsuarioGrupo.addActionListener(al);
    ingresar.btnListar.addActionListener(al);
    ingresar.btnUsuario.addActionListener(al);
    
    usuario.jButton2.addActionListener(al);
    usuario.btnSubirImagen1.addActionListener(al);
    ig.jButton1.addActionListener(al);
    usuario.jButton1.addActionListener(al);
    usuario.btnSubirImagen.addActionListener(al);
    
    }
    
     public void limpiar(){
         ingresar.jtDescripcionG.setText("");
         ingresar.jtNombreG.setText("");
         
        
         ingresar.jtNoticiasG.setText("");
         ingresar.jtApellido.setText("");
         ingresar.jtNombre.setText("");
         ingresar.jtContrasenaIngreso.setText("");
         ingresar.jtClave.setText("");
         ingresar.jtCorreo.setText("");
         ingresar.jtCorreoIngreso.setText("");
         ingresar.jtEdad.setText("");
         ingresar.jtNick.setText("");
         ingresar.jtTipo.setText("");
         ingresar.jtResponsable.setText("");
         
     }
    
     @Override
    
     
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getActionCommand().equals("Salir"))
        {
            
            this.ig.setVisible(false);
            this.ig.jtCorreo.setText("");
            this.ig.jtNombre.setText("");
            
            
            
            
        this.usuario.setVisible(false);
        
        this.usuario.jTextArea1.setText("");
        
        existeEstudiante(ingresar.jtCorreoIngreso.getText()).setIcono(usuario.jLabel3.getIcon());
        
        }
        
        if(ae.getActionCommand().equals("Registrar Usuario"))
        {
            try{
           String nombre=ingresar.jtNombre.getText();
           String apellido=ingresar.jtApellido.getText();
           String nick=ingresar.jtNick.getText();
           String correo=ingresar.jtCorreo.getText();
           int edad=Integer.parseInt(ingresar.jtEdad.getText());
           String clave=ingresar.jtClave.getText();
           
           
           e=new Estudiante(nombre,apellido,nick,clave,correo,edad);
           
           estudiantes.add(e);
           limpiar();
            }catch(NumberFormatException e){
                
            }
           
           
            
            
            
        }
    
        if(ae.getActionCommand().equals("Ingresar"))
        {
            
        if(existeEstudiante(ingresar.jtCorreoIngreso.getText())!=null)
        {
            if(existeEstudiante(ingresar.jtCorreoIngreso.getText()).getClave().equals(ingresar.jtContrasenaIngreso.getText()))
            {
                estudianteAux=existeEstudiante(ingresar.jtCorreoIngreso.getText());
                usuario.jLabel3.setIcon(estudianteAux.getIcono());
                
                
                
                usuario.labelNombre.setText(estudianteAux.getNombre()+" "+estudianteAux.getApellido());
                usuario.labelCorreo.setText(estudianteAux.getCorreo());
                usuario.labelEdad.setText(Integer.toString(estudianteAux.getEdad()));
                usuario.labelNick.setText(estudianteAux.getNick());
                usuario.labelPerfil.setText("Perfil de "+estudianteAux.getNombre());
                
                this.usuario.setVisible(true);
                
                
            }else{JOptionPane.showMessageDialog(null, "Contraseña incorrecta");}
            
            
        }
      
        
        }
        
        if(ae.getActionCommand().equals("Comentar"))
        {
          
            
            Date fech1 =new Date();
          
           if(existeEstudiante(ingresar.jtCorreoIngreso.getText()).getComentarios().size()<10)
           {
               System.out.println(existeEstudiante(ingresar.jtCorreoIngreso.getText()).getComentarios().size());
           estudianteAux.getComentarios().add(new Comentario(usuario.jTextArea1.getText(),fech1));
           usuario.jTextArea1.setText("");  
             
           }else{
           
           JOptionPane.showMessageDialog(null, "Solo puedes hacer 10 comentarios");
           }
           
        }
        
        
        
        if(ae.getActionCommand().equals("Subir imagen"))
        {
            
            
        }
        
        
        if(ae.getActionCommand().equals("Registrar Grupo"))
        {
           
            
            if(ingresar.jtNombreG.getText().equals("")
                    ||ingresar.jtNoticiasG.getText().equals("")
                    ||ingresar.jtDescripcionG.getText().equals("")
                    ||ingresar.jtTipo.getText().equals("")
                    ||ingresar.jtResponsable.getText().equals("")
                    
                    )
            {
            
                JOptionPane.showMessageDialog(null, "Campos vacios");
            }
            else{
            String nombre=ingresar.jtNombreG.getText();
            String noticias=ingresar.jtNoticiasG.getText();
            String tipo=ingresar.jtTipo.getText();
            String descripcion=ingresar.jtDescripcionG.getText();
            String datos=ingresar.jtResponsable.getText();
            
           
            
            g=new Grupo(nombre,descripcion,tipo,noticias,datos);
           grupos.add(g);
           
           limpiar();
           JOptionPane.showMessageDialog(null, "Grupo "+g.getNombre()+" agregado");
             
            }
            
        }
        
        if(ae.getActionCommand().equals("Registro Usuario a un grupo"))
        {
            this.ig.setVisible(true);
            
        
        }
        
        
        
        
         if(ae.getActionCommand().equals("Listar estudiantes"))
        {
            for (int i = 0; i < grupos.size(); i++) {
                if(grupos.get(i).getNombre().equals(ingresar.jtNombreGrupo.getText()))
                {
                    
                    ingresar.jTextArea1.setText(grupos.get(i).getEstudiantes().toString());
                    
                }
            }
            
        
        }
        
        
        
        if(ae.getActionCommand().equals("Registrar"))
        {
         boolean agregado=false;
        String nombre=ig.jtNombre.getText();
            String correo=ig.jtCorreo.getText();
            
            for (int i = 0; i < this.grupos.size(); i++) 
            {
                if(grupos.get(i).getNombre().equals(nombre))
                {                   
                    if(existeEstudiante(correo)!=null)
                    {
                        grupos.get(i).getEstudiantes().add(existeEstudiante(correo));
                        agregado=true;
                    }
                }
                    
            }
            if(agregado==true){
                JOptionPane.showMessageDialog(null,"Estudiante Agregado");
                 this.ig.setVisible(false); 
            }
             
        }
    }
    
    public Estudiante existeEstudiante(String correo)
    
    {
        for (int i = 0; i < this.estudiantes.size(); i++) {
            if(estudiantes.get(i).getCorreo().equals(correo))
            {
                return estudiantes.get(i);
            }
        }
    
    return null;
    }
    
    public Comentario getC() {
        return c;
    }

    public void setC(Comentario c) {
        this.c = c;
    }

    public Grupo getG() {
        return g;
    }

    public void setG(Grupo g) {
        this.g = g;
    }

    public Estudiante getE() {
        return e;
    }

    public void setE(Estudiante e) {
        this.e = e;
    }

    public Fotografia getF() {
        return f;
    }

    public void setF(Fotografia f) {
        this.f = f;
    }

    public Ingresar getIngresar() {
        return ingresar;
    }

    public void setIngresar(Ingresar ingresar) {
        this.ingresar = ingresar;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
    
   

    
    
    
    
}
