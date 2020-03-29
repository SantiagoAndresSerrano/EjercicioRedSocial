/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsocial;

import Controlador.Controlador;
import Modelo.Comentario;
import Modelo.Estudiante;
import Modelo.Fotografia;
import Modelo.Grupo;
import Vista.Ingresar;
import Vista.IngresoGrupo;
import Vista.Usuario;

/**
 *
 * @author santi
 */
public class RedSocial {

   
    public static void main(String[] args) 
    {
    Comentario c=new Comentario();
    Grupo g=new Grupo();
    Estudiante e=new Estudiante();
    Fotografia f=new Fotografia();
    Ingresar ingresar=new Ingresar();
    Usuario usuario=new Usuario();
     IngresoGrupo ig=new IngresoGrupo();
    
    Controlador co=new Controlador(ig,c,g,e,f,ingresar,usuario);
    }
    
}
