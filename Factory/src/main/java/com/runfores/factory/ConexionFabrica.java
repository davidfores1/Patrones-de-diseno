/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runfores.factory;

import com.runfores.factory.impl.ConexionMySQL;
import com.runfores.factory.impl.ConexionOracle;
import com.runfores.factory.impl.ConexionVacia;
import com.runfores.factory.inter.IConexion;

/**
 *
 * @author david
 */
public class ConexionFabrica {

    public IConexion getConexion(String motor) {

        if (motor == null) {
            return new ConexionVacia();
        }
        if (motor.equalsIgnoreCase("MYSQL")) {
            return new ConexionMySQL();
        }
        if (motor.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        }
        return new ConexionVacia();
    }
}
