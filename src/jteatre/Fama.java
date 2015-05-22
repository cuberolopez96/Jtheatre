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
enum Fama {
    NORMAL,
    FAMOSO,
    MUYFAMOSO,
    FAMOSISIMO;

    public Fama getFama(int index){
        for (Fama  fama  : Fama.values()) {
            if(index == fama.ordinal()){
                return fama;
            }
            
        }
        return null;
    }
    
    
}
