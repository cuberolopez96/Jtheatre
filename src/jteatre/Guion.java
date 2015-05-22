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
enum Guion {
    LIBRETOACTOR,
    LIBRETODIRECTOR,
    LIBRETOAPUNTADOR,
    LIBRETOTECNICO,
    LIBRETOTRAMOYA,
    LIBRETOVESTUARIO,
    LIBRETOESCENOGRAFIA,
    LIBRETOTRASPUNTE,
    LIBRETOUTILERO;
    
    public static Guion getGuion(int index){
        for (Guion guion : Guion.values()) {
            if(index == guion.ordinal())
                return guion;
        }
        return null;
    }
    
}
