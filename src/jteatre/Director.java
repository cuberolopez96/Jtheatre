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
public class Director extends Personal implements Calculable{
    private Genero genero;
    private Personalidad personalidad;
    private ArrayList<String>proyectosFuturos = new ArrayList<String>();
    private Fama fama;
    private int experiencia;
    private int Salario;
    @Override
    public void fama() {
        int i  = 0;
        for (Premios  premios:listaPremios) {
            if(premios == Premios.PREMIOALAMEJORPELICULA||premios == Premios.PREMIOALMEJORDIRECTOR)
                i++;
        }
         if(i>= 0 && i<= 5){
           fama = Fama.NORMAL;
       }
       if(i>5 && i<=10){
           fama = Fama.FAMOSO;
          
       }
       if(i>10 && i<= 15){
           fama = Fama.MUYFAMOSO;
           
       }
       if(i>15 && i<= 20){
           fama = Fama.FAMOSISIMO;
       }
       
    }

    @Override
    public void experienciable() {
        experiencia = antecedentes.size() + proyectosFuturos.size();
    }

    @Override
    public void salariable() {
        Salario = experiencia * 100;
        
    }

    public void setGenero(Genero genero) throws GeneroNoValidoException {
    	if(genero == null)
    		throw new GeneroNoValidoException("el genero no es valido");
        this.genero = genero;
    }

    public void setPersonalidad(Personalidad personalidad) throws PersonalidadNoValidaException {
    	if(personalidad == null)
    		throw new  PersonalidadNoValidaException("personalidad no valida");
        this.personalidad = personalidad;
    }
    
    public Director(String nombre, String apellidos,Genero genero,Personalidad personalidad, int dia,int mes, int anno, String dni) throws DniInvalidoException, ApellidosNulosException, NombreNuloException, GeneroNoValidoException, PersonalidadNoValidaException {
        super(nombre, apellidos, dia, mes, anno, dni);
        setGenero(genero);
        setPersonalidad(personalidad);
    }
    public void dirigir(String titulo){
        antecedentes.add(titulo);
        experienciable();
    }
    public void annadirPremios(Premios premio) throws NoTienesObrasException{
        super.annadirPremios(premio);
        fama();
        salariable();
        experienciable();
    } 
    
}
