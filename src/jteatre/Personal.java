/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jteatre;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 *
 * @author Juan Antonio
 */
class Personal {
    protected String nombre;
    protected String apellidos;
    protected int id = 0;
    private static int auxid = 0;
    protected ArrayList <String> antecedentes = new ArrayList<String>();
    protected ArrayList <Premios> listaPremios = new ArrayList<Premios>();
    protected Calendar fechaNacimiento = new GregorianCalendar();
    protected String dni;
    private Pattern pdni = Pattern.compile("\\d{8}([-]?)[A-Z]");
    
	

   
   
    
    public String getDni() {
		return dni;
	}
	public void setDni(String dni) throws DniInvalidoException {
		if(!pdni.matcher(dni).matches())
			throw new DniInvalidoException("dni no valido");
		this.dni = dni;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public Personal(String nombre,String apellidos,int dia,int mes,int anno,String dni) throws DniInvalidoException, ApellidosNulosException, NombreNuloException{
        setNombre(nombre);
        setApellidos(apellidos);
        setFechaNacimiento(dia, mes, anno);
        setDni(dni);
       
        autoInc();
        
        
    }
    private void setFechaNacimiento(int dia,int mes,int anno){
    	fechaNacimiento.set(anno, mes, dia);
    	fechaNacimiento.setLenient(false);
    }
    
    private void setNombre(String nombre) throws NombreNuloException{
    	if(nombre == null)
    		throw new NombreNuloException("introduce el nombre");
        this.nombre = nombre;
    }
    
    private void setApellidos(String apellidos) throws ApellidosNulosException{
    	if(apellidos == null)
    		throw new ApellidosNulosException("introduce los apellidos");
        this.apellidos = apellidos;
    }
    private  void autoInc(){
    	id = ++auxid;
    }
    public void annadirAntecedentes(String titulo){
        antecedentes.add(titulo);
        
    }
    public void annadirPremios(Premios premios) throws NoTienesObrasException{
     if(antecedentes.size() == 0)
         throw new NoTienesObrasException("no has participado en ninguna obra");
        listaPremios.add(premios);
        
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

    
    
}
