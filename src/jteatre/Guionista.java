/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jteatre;

/**
 *
 * @author Juan Antonio
 */
public class Guionista extends Personal implements Calculable{
    private Genero genero;
    private Guion tipoGuiones;
    private Fama fama;
    private int experiencia;
    private int salario;
    boolean isescritor = false;

    @Override
    public void fama() {
        int i = 0;
        for (Premios premios  : listaPremios) {
            if(premios == Premios.PREMIOALMEJORGUION || premios == Premios.PREMIOALMEJORGUIONISTA)
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Guion getTipoGuiones() {
        return tipoGuiones;
    }

    public void setTipoGuiones(Guion tipoGuiones) {
        this.tipoGuiones = tipoGuiones;
    }

    @Override
    public void experienciable() {
        experiencia = (antecedentes.size() + listaPremios.size())*2;
    }

    @Override
    public void salariable() {
        salario = experiencia * (fama.ordinal() + 1);
        if(isescritor == true)
            salario += 1200;
    }

    public Guionista(String nombre, String apellidos,Genero genero, Guion guion, int dia, int mes, int anno, String dni) throws DniInvalidoException, ApellidosNulosException, NombreNuloException {
        super(nombre, apellidos, dia, mes, anno, dni);
        setGenero(genero);
        setTipoGuiones(tipoGuiones);
    }
    private void setIsEscritor(boolean isescritor){
        this.isescritor = isescritor;
    }
    public void hacerGuion(String titulo){
        antecedentes.add(titulo);
    }

    public Fama getFama() {
        return fama;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getSalario() {
        return salario;
    }

    public boolean isIsescritor() {
        return isescritor;
    }
    public void annadirPremios(Premios premio) throws NoTienesObrasException{
        super.annadirPremios(premio);
        fama();
        experienciable();
        salariable();
    }
    
    
    
    
}
