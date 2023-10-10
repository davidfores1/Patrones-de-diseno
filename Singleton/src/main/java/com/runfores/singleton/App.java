/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runfores.singleton;

import com.runfores.singleton.model.Conexion;

/**
 *
 * @author david
 */
public class App {
    
    public static void main(String[] args) {
        Conexion c = Conexion.getInstancia();
        c.conectar();
        c.desconectar();
        
        boolean respuesta = c instanceof Conexion;
        System.out.println(respuesta);
    }
}
