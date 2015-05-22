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
public class Actor extends Personal implements Calculable {
    private int altura;
    private int Peso;
    private String descripcionFisica;
    private String representante;
    private Fama fama;
    private int experiencia = 0;
    boolean cantar = false;
    boolean bailar = false;
    boolean accion = false;
    boolean thriller = false;
    boolean drama = false;
    boolean comedia = false;
    boolean tragedia = false;
    int salario;
    
    
    public Actor(String nombre, String apellidos,String dni,int altura,int peso,int dia,int mes,int anno) throws DniInvalidoException, AlturaNoValida, PesoNoValido, ApellidosNulosException, NombreNuloException {
        super(nombre, apellidos, dia, mes, anno,dni);
        salariable();
        setPeso(peso);
        setAltura(altura);
        fama();
        experienciable();
        salariable();
    }

    public void setAltura(int altura) throws AlturaNoValida {
    	if(altura < 140 || altura > 210)
    		throw new AlturaNoValida("introduce la altura de forma Valida");
        this.altura = altura;
    }

    public void setPeso(int peso) throws PesoNoValido {
    if(peso < 50 || peso > 110)
    	throw new PesoNoValido("introduce el peso de forma valida");
        this.Peso = Peso;
    }

    @Override
    public void fama() {
        int i = 0;
        
       for(Premios premios: listaPremios){
           if(premios == Premios.PREMIOALMEJORACTOR || premios == premios.PREMIOALAMEJORINTERPRETACION|| premios == Premios.PREMIOALMEJORACTORDEREPARTO){
               i++;
           }
           
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
    public void sabeCantar(boolean saber){
        cantar = saber;
    }
    public void sabeBailar(boolean saber){
        bailar = saber;
    }
    public void sabeAccion(boolean saber){
        accion = saber;
    }
    public void sabeThriller(boolean saber){
        thriller = saber;
    }
    public void sabeComedia(boolean saber){
        comedia = saber;
    }
    public void sabeDrama(boolean saber){
        drama = saber;
    }
    public void sabeTragedia(boolean saber){
        tragedia = saber;
    }

    @Override
    public void experienciable() {
        if(cantar == true)
            experiencia++;
        if(bailar == true)
            experiencia++;
        if(accion == true)
            experiencia++;
        if(thriller == true)
            experiencia++;
        if(drama == true)
            experiencia++;
        if(tragedia == true)
            experiencia++;
        if(comedia == true)
            experiencia++;
    }

    @Override
    public void salariable() {
        salario = experiencia + antecedentes.size() *10;
    }

    public int getAltura() {
        return altura;
    }

    public int getPeso() {
        return Peso;
    }

    public Fama getFama() {
        return fama;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public boolean isAccion() {
        return accion;
    }

    public float getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getId() {
        return id;
    }
    public void actuar(String titulos){
        antecedentes.add(titulos);
        salariable();
    }
    public void annadirPremios(Premios premio) throws NoTienesObrasException{
        super.annadirPremios(premio);
        fama();
        experienciable();
        salariable();
    }

   
    
    
}
