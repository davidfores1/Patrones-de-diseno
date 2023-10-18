/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runfores.abstractfactory.impl;

import com.runfores.abstractfactory.inter.IConexionDB;

/**
 *
 * @author david
 */
public class ConexionOracle implements IConexionDB {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionOracle() {
        this.host = "localhost";
        this.puerto = "3307";
        this.usuario = "root";
        this.contrasena = "1234";
    }

    @Override
    public void conectar() {
        System.out.println("Se conectó a Oracle");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de Oracle");
    }

}
