/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runfores.factory;

import com.runfores.factory.inter.IConexion;

/**
 *
 * @author david
 */
public class App {

    public static void main(String[] args) {

        ConexionFabrica fabrica = new ConexionFabrica();

        IConexion conexion1 = fabrica.getConexion("ORACLE");
        System.out.println("****Conexión 1*****");
        conexion1.conectar();
        conexion1.desconectar();
        System.out.println();
        
        IConexion conexion2 = fabrica.getConexion("mysql");
        System.out.println("****Conexión 2*****");
        conexion2.conectar();
        conexion2.desconectar();
        System.out.println();
        
        IConexion conexion3 = fabrica.getConexion("H2");
        System.out.println("****Conexión 3*****");
        conexion3.conectar();
        conexion3.desconectar();

    }

}
