/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jteatre;

import java.util.ArrayList;

/**
 *
 * @author Juan Antonio
 */
public class Gestion {
   public static Compannia compannia = new Compannia();
     public static void annadirActor(Actor actor) throws DniInvalidoException,DniDuplicadoException,PersonalDuplicadoException{
         compannia.annadirActor(actor);
     }
    public static void annadirDirector(Director director) throws DniInvalidoException, DniDuplicadoException, PersonalDuplicadoException{
        compannia.annadirDirector(director);
    }
    public static void annadirGuionista(Guionista guionista) throws DniInvalidoException, DniDuplicadoException, PersonalDuplicadoException{
       compannia.annadirGuionista(guionista);
    }
    public static ArrayList getListaDirector(){
       return  compannia.getListaDirectores();
    }
    public static ArrayList getListaActores(){
        return compannia.getListaActores();
    }
    public static ArrayList getListaGuionistas(){
        return compannia.getListaGuionistas();
    }
}
