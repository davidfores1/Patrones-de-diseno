/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runfores.singleton.model;

/**
 *
 * @author David Forero
 */
public class Conexion {
    
    //Declaración
    private static Conexion instancia;
    
    //privado para evitar instancia mediante operador "new"
    private Conexion(){}
    
    //Para obtener la instancia unicamente por este metodo
    //Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo
    public static Conexion getInstancia() {
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }

    public void conectar(){
        System.out.println("Me conecté a la DB");
    }
    
    public void desconectar(){
        System.out.println("Me desconecté a la DB");
    }
    
}
