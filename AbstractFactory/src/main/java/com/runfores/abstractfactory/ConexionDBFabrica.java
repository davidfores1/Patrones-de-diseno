/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runfores.abstractfactory;

import com.runfores.abstractfactory.impl.ConexionMySQL;
import com.runfores.abstractfactory.impl.ConexionOracle;
import com.runfores.abstractfactory.impl.ConexionVacia;
import com.runfores.abstractfactory.inter.IConexionDB;
import com.runfores.abstractfactory.inter.IConexionRest;
import com.runfores.abstractfactory.inter.IFabricaAbstracta;

/**
 *
 * @author david
 */
public class ConexionDBFabrica implements IFabricaAbstracta{

    @Override
    public IConexionDB getDB(String motor) {
        
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

    @Override
    public IConexionRest getRest(String url) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
