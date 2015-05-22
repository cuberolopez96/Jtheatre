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
class Compannia {
        private ArrayList<Personal>listaPersonal ;
        private ArrayList<Actor>listaActores;
        private ArrayList<Guionista>listaGuionista;
        private ArrayList<Director>listaDirectores;
        
        public Compannia(){
        	listaPersonal = new ArrayList<Personal>();
        	listaActores = new ArrayList<Actor>();
        	listaGuionista = new ArrayList<Guionista>();
        	listaDirectores = new ArrayList<Director>();
        }
        
        public void annadirPersonal(Personal personal) throws DniInvalidoException, PersonalDuplicadoException, DniDuplicadoException{
        	if(isNoDuplicado(personal))
        		throw new PersonalDuplicadoException("este trabajador ya existe");
        	if(validarDni(personal))
        		throw new DniDuplicadoException("dni duplicado");
            listaPersonal.add(personal);
        }
        private boolean validarDni(Personal personal) {
			// TODO Auto-generated method stub
			for (Personal personal1 : listaPersonal) {
				if(personal.getDni().equals(personal1.getDni()))
					return true;
			}
			return false;
		}

		private boolean isNoDuplicado(Personal personal) {
			// TODO Auto-generated method stub
			for (Personal personal1 : listaPersonal) {
				if(personal.equals(personal1))
					return true;
			}
			return false;
		}

		public void annadirActor(Actor actor) throws DniInvalidoException,DniDuplicadoException,PersonalDuplicadoException{
           annadirPersonal(actor);
            listaActores.add(actor);
        }
        public void annadirDirector(Director director) throws DniInvalidoException, DniDuplicadoException,PersonalDuplicadoException{
           annadirPersonal(director);
            listaDirectores.add(director);
        }
        public void annadirGuionista(Guionista guionista) throws DniInvalidoException,DniDuplicadoException,PersonalDuplicadoException{
            annadirGuionista(guionista);
            listaGuionista.add(guionista);
        }
        public ArrayList getListaPersonal(){
            return listaPersonal;
        }
        public ArrayList getListaActores(){
            return listaActores;
        }
        public ArrayList getListaGuionistas(){
            return listaGuionista;
            
        }
        public ArrayList getListaDirectores(){
            return listaDirectores;
        }

   
   
}
